package io.anuke.mindustry.editor;

import io.anuke.arc.Core;
import io.anuke.arc.collection.Array;
import io.anuke.arc.graphics.Color;
import io.anuke.arc.graphics.g2d.*;
import io.anuke.arc.input.GestureDetector;
import io.anuke.arc.input.GestureDetector.GestureListener;
import io.anuke.arc.input.KeyCode;
import io.anuke.arc.math.Mathf;
import io.anuke.arc.math.geom.*;
import io.anuke.arc.scene.Element;
import io.anuke.arc.scene.event.*;
import io.anuke.arc.scene.ui.TextField;
import io.anuke.arc.scene.ui.layout.Unit;
import io.anuke.arc.util.Tmp;
import io.anuke.mindustry.graphics.Pal;
import io.anuke.mindustry.input.Binding;
import io.anuke.mindustry.ui.GridImage;

import static io.anuke.mindustry.Vars.mobile;
import static io.anuke.mindustry.Vars.ui;

public class MapView extends Element implements GestureListener{
    private MapEditor editor;
    private EditorTool tool = EditorTool.pencil;
    private Bresenham2 bresenham2D = new Bresenham2();
    private float offsetX, offsetY;
    private float zoom = 1f;
    private boolean grid = false;
    private GridImage image = new GridImage(0, 0);
    private Vector2 vector2D = new Vector2();
    private Rectangle rectangle = new Rectangle();
    private Vector2[][] brushPolygons = new Vector2[MapEditor.brushSizes.length][0];

    private boolean drawing;
    private int lastX, lastY;
    private int startX, startY;
    private float mouseX, mouseY;
    private EditorTool lastTool;

    public MapView(MapEditor editor){
        this.editor = editor;

        initiateBrushPolygons();

        Core.input.getInputProcessors().insert(0, new GestureDetector(20, 0.5f, 2, 0.15f, this));
        touchable(Touchable.enabled);

        Point2 firstTouch = new Point2();

        addListener(new InputListener(){

            @Override
            public boolean mouseMoved(InputEvent event, float x, float y){
                mouseX = x;
                mouseY = y;

                return false;
            }

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, KeyCode button){
                if(pointer != 0){
                    return false;
                }

                if(!mobile && button != KeyCode.MOUSE_LEFT && button != KeyCode.MOUSE_MIDDLE){
                    return true;
                }

                if(button == KeyCode.MOUSE_MIDDLE){
                    lastTool = tool;
                    tool = EditorTool.zoom;
                }

                mouseX = x;
                mouseY = y;

                Point2 p = project(x, y);
                lastX = p.x;
                lastY = p.y;
                startX = p.x;
                startY = p.y;
                tool.touched(editor, p.x, p.y);
                firstTouch.set(p);

                if(tool.edit){
                    ui.editor.resetSaved();
                }

                drawing = true;
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, KeyCode button){
                if(!mobile && button != KeyCode.MOUSE_LEFT && button != KeyCode.MOUSE_MIDDLE){
                    return;
                }

                drawing = false;

                Point2 p = project(x, y);

                if(tool == EditorTool.line){
                    if(Core.input.keyDown(KeyCode.TAB)){
                        if(Math.abs(p.x - firstTouch.x) > Math.abs(p.y - firstTouch.y)){
                            p.y = firstTouch.y;
                        }else{
                            p.x = firstTouch.x;
                        }
                    }

                    ui.editor.resetSaved();
                    Array<Point2> points = bresenham2D.line(startX, startY, p.x, p.y);
                    for(Point2 point : points){
                        editor.draw(point.x, point.y, EditorTool.isPaint());
                    }
                }

                editor.flushOp();

                if(button == KeyCode.MOUSE_MIDDLE && lastTool != null){
                    tool = lastTool;
                    lastTool = null;
                }

            }

            @Override
            public void touchDragged(InputEvent event, float x, float y, int pointer){

                mouseX = x;
                mouseY = y;

                Point2 p = project(x, y);

                if(drawing && tool.draggable && !(p.x == lastX && p.y == lastY)){
                    ui.editor.resetSaved();
                    Array<Point2> points = bresenham2D.line(lastX, lastY, p.x, p.y);
                    for(Point2 point : points){
                        tool.touched(editor, point.x, point.y);
                    }
                }

                setLastXYtoDragged(p, firstTouch);
            }
        });
    }

    private void setLastXYtoDragged(Point2 p, Point2 firstTouch) {
        if(tool == EditorTool.line && Core.input.keyDown(KeyCode.TAB)){
            if(Math.abs(p.x - firstTouch.x) > Math.abs(p.y - firstTouch.y)){
                lastX = p.x;
                lastY = firstTouch.y;
            }else{
                lastX = firstTouch.x;
                lastY = p.y;
            }
        }else{
            lastX = p.x;
            lastY = p.y;
        }
    }

    private void initiateBrushPolygons() {
        for(int i = 0; i < MapEditor.brushSizes.length; i++){
            float size = MapEditor.brushSizes[i];
            brushPolygons[i] = Geometry.pixelCircle(size, (index, x, y) -> Mathf.dst(x, y, index, index) <= index - 0.5f);
        }
    }

    public EditorTool getTool(){
        return tool;
    }

    public void setTool(EditorTool tool){
        this.tool = tool;
    }

    public boolean isGrid(){
        return grid;
    }

    public void setGrid(boolean grid){
        this.grid = grid;
    }

    @Override
    public void act(float delta){
        super.act(delta);

        if(Core.scene.getKeyboardFocus() == null || !(Core.scene.getKeyboardFocus() instanceof TextField) &&
        !Core.input.keyDown(KeyCode.CONTROL_LEFT)){
            float axisX = Core.input.axis(Binding.move_x);
            float axisY = Core.input.axis(Binding.move_y);
            offsetX -= axisX * 15f / zoom;
            offsetY -= axisY * 15f / zoom;
        }

        if(Core.input.keyTap(KeyCode.SHIFT_LEFT)){
            lastTool = tool;
            tool = EditorTool.pick;
        }

        if(Core.input.keyRelease(KeyCode.SHIFT_LEFT) && lastTool != null){
            tool = lastTool;
            lastTool = null;
        }

        if(ui.editor.hasPane()) return;

        zoom += Core.input.axis(KeyCode.SCROLL) / 10f * zoom;
        clampZoom();
    }

    private void clampZoom(){
        zoom = Mathf.clamp(zoom, 0.2f, 20f);
    }

    private Point2 project(float x, float y){
        float ratio = 1f / ((float)editor.width() / editor.height());
        float size = Math.min(width, height);
        float scaleWidth = size * zoom;
        float scaleHeight = size * zoom * ratio;
        x = (x - getWidth() / 2 + scaleWidth / 2 - offsetX * zoom) / scaleWidth * editor.width();
        y = (y - getHeight() / 2 + scaleHeight / 2 - offsetY * zoom) / scaleHeight * editor.height();

        if(editor.drawBlock.size % 2 == 0 && tool != EditorTool.eraser){
            return Tmp.g1.set((int)(x - 0.5f), (int)(y - 0.5f));
        }else{
            return Tmp.g1.set((int)x, (int)y);
        }
    }

    private Vector2 unproject(int x, int y){
        float ratio = 1f / ((float)editor.width() / editor.height());
        float size = Math.min(width, height);
        float scaleWidth = size * zoom;
        float scaleHeight = size * zoom * ratio;
        float px = ((float)x / editor.width()) * scaleWidth + offsetX * zoom - scaleWidth / 2 + getWidth() / 2;
        float py = ((float)(y) / editor.height()) * scaleHeight
        + offsetY * zoom - scaleHeight / 2 + getHeight() / 2;
        return vector2D.set(px, py);
    }

    @Override
    public void draw(){
        float ratio = 1f / ((float)editor.width() / editor.height());
        float size = Math.min(width, height);
        float scaleWidth = size * zoom;
        float scaleHeight = size * zoom * ratio;
        float centerX = x + width / 2 + offsetX * zoom;
        float centerY = y + height / 2 + offsetY * zoom;

        image.setImageSize(editor.width(), editor.height());

        if(!ScissorStack.pushScissors(rectangle.set(x, y, width, height))){
            return;
        }

        Draw.color(Pal.remove);
        Lines.stroke(2f);
        Lines.rect(centerX - scaleWidth / 2 - 1, centerY - scaleHeight / 2 - 1, scaleWidth + 2, scaleHeight + 2);
        if(Core.scene.getKeyboardFocus() != null && isDescendantOf(Core.scene.getKeyboardFocus())){
            editor.renderer().draw(centerX - scaleWidth / 2, centerY - scaleHeight / 2, scaleWidth, scaleHeight);
        }
        Draw.reset();

        if(!ScissorStack.pushScissors(rectangle.set(x, y, width, height))){
            return;
        }

        drawGrid(scaleWidth, scaleHeight, centerX, centerY);

        int brushSizeIndex = setBrushSizeIndex();

        float scaling = zoom * Math.min(width, height) / editor.width();

        Draw.color(Pal.accent);
        Lines.stroke(Unit.dp.scl(2f));

        if((!editor.drawBlock.isMultiblock() || tool == EditorTool.eraser) && tool != EditorTool.fill){
            if(tool == EditorTool.line && drawing){
                Vector2 v1 = unproject(startX, startY).add(x, y);
                float sx = v1.x, sy = v1.y;
                Vector2 v2 = unproject(lastX, lastY).add(x, y);

                Lines.poly(brushPolygons[brushSizeIndex], sx, sy, scaling);
                Lines.poly(brushPolygons[brushSizeIndex], v2.x, v2.y, scaling);
            }

            if((tool.edit || (tool == EditorTool.line && !drawing)) && (!mobile || drawing)){
                Point2 p = project(mouseX, mouseY);
                Vector2 v = unproject(p.x, p.y).add(x, y);
                Lines.poly(brushPolygons[brushSizeIndex], v.x, v.y, scaling);
            }
        }else{
            if((tool.edit || tool == EditorTool.line) && (!mobile || drawing)){
                Point2 p = project(mouseX, mouseY);
                Vector2 v = unproject(p.x, p.y).add(x, y);
                float offset = (editor.drawBlock.size % 2 == 0 ? scaling / 2f : 0f);
                Lines.square(
                v.x + scaling / 2f + offset,
                v.y + scaling / 2f + offset,
                scaling * editor.drawBlock.size / 2f);
            }
        }

        Draw.color(Pal.accent);
        Lines.stroke(Unit.dp.scl(3f));
        Lines.rect(x, y, width, height);
        Draw.reset();

        ScissorStack.popScissors();
        ScissorStack.popScissors();
    }

    private int setBrushSizeIndex() {
        int brushSizeIndex = 0;
        for(int i = 0; i < MapEditor.brushSizes.length; i++){
            if(editor.brushSize == MapEditor.brushSizes[i]){
                brushSizeIndex = i;
                break;
            }
        }
        return brushSizeIndex;
    }

    private void drawGrid(float scaleWidth, float scaleHeight, float centerX, float centerY) {
        if(grid) {
            Draw.color(Color.GRAY);
            image.setBounds(centerX - scaleWidth / 2, centerY - scaleHeight / 2, scaleWidth, scaleHeight);
            image.draw();
            Draw.color();
        }
    }

    private boolean active(){
        return Core.scene.getKeyboardFocus() != null
        && Core.scene.getKeyboardFocus().isDescendantOf(ui.editor)
        && ui.editor.isShown() && tool == EditorTool.zoom &&
        Core.scene.hit(Core.input.mouse().x, Core.input.mouse().y, true) == this;
    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY){
        if(!active()) return false;
        offsetX += deltaX / zoom;
        offsetY += deltaY / zoom;
        return false;
    }

    @Override
    public boolean zoom(float initialDistance, float distance){
        if(!active()) return false;
        float nzoom = distance - initialDistance;
        zoom += nzoom / 10000f / Unit.dp.scl(1f) * zoom;
        clampZoom();
        return false;
    }

    @Override
    public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2){
        return false;
    }

    @Override
    public void pinchStop(){

    }
}
