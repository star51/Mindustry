package io.anuke.mindustry.editor;

import io.anuke.arc.Core;
import io.anuke.arc.graphics.g2d.Draw;
import io.anuke.arc.graphics.g2d.TextureAtlas;
import io.anuke.arc.graphics.g2d.TextureRegion;
import io.anuke.arc.math.Mathf;
import io.anuke.arc.math.geom.Point2;
import io.anuke.arc.math.geom.Rectangle;
import io.anuke.mindustry.content.Blocks;
import io.anuke.mindustry.graphics.IndexedRenderer;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.Tile;

import static io.anuke.mindustry.Vars.tilesize;

public abstract class Render {
    protected Point2 windowPoint;
    protected Point2 gridPoint;
    protected Point2 chunkStartPoint;

    protected FloatPoint offset;

    protected int chunkArea;
    protected int tileSize;

    protected IndexedRenderer mesh;
    protected Tile tile;


    protected Block wall;

    protected MapEditor editor;
    protected IndexedRenderer[][] chunks;
    protected Rectangle region;

    protected Render() {
        windowPoint = new Point2();
        gridPoint = new Point2();
        chunkStartPoint = new Point2();
        offset = new FloatPoint();
        region = new Rectangle();

        chunkArea = 0;
        tileSize = tilesize;

        mesh = null;
        tile = null;
        wall = null;

        editor = null;
        chunks = null;
    }

    protected static void preprocessing(Render strategy, MapEditor editor,
                                        IndexedRenderer[][] chunks,
                                        int windowX, int windowY, int chunkSize) {
        final int chunkStartX = (windowX % chunkSize);
        final int chunkStartY = (windowY % chunkSize) * chunkSize;

        strategy.setEditor(editor);
        strategy.setChunks(chunks);

        strategy.setGridPoint(windowX/chunkSize, windowY/chunkSize);
        strategy.setWindowPoint(windowX, windowY);
        strategy.setChunkStartPoint(chunkStartX, chunkStartY);
        strategy.offset.setPoint(0, 0);
        strategy.region.set(0, 0, 0, 0);

        strategy.setChunkArea(chunkSize * chunkSize);

        strategy.setTile(strategy.getWindowPoint());
        strategy.setMesh(strategy.getGridPoint());

        strategy.setWall(strategy.getTile().block());
    }

    public abstract void renderRegion();

    protected void drawMesh(TextureRegion textureRegion, int index, boolean needsRotate) {
        if(needsRotate){
            final float rotationDegree = tile.rotation() * 90 - 90;
            mesh.draw(index, textureRegion,
                      region.x,
                      region.y,
                      region.width,
                      region.height,
                      rotationDegree);
        }else{
            mesh.draw(index, textureRegion,
                      region.x,
                      region.y,
                      region.width,
                      region.height);
        }
    }

    protected int getRandomValue(int index, int length) {
        return Mathf.randomSeed(index, 0, length - 1);
    }

    protected boolean getIsAirBlock(Block block) {
        return block.equals(Blocks.air);
    }

    protected TextureAtlas.AtlasRegion getRegionInstance(String name) {
        return Core.atlas.find(name);
    }

    protected float getMeshOffset(float size) {
        return ((tilesize - size * Draw.scl) / 2f);
    }

    protected TextureRegion getEditorIcon(Block wall, boolean isEditorIconExist) {
        return (isEditorIconExist ? wall.editorIcon() : getRegionInstance("clear-editor"));
    }

    public void setWindowPoint(int x, int y) {
        this.windowPoint.set(x, y);
    }

    public Point2 getWindowPoint() {
        return this.windowPoint;
    }

    public void setGridPoint(int x, int y) {
        this.gridPoint.set(x, y);
    }

    public Point2 getGridPoint() {
        return  this.gridPoint;
    }

    public void setChunkStartPoint(int x, int y) {
        this.chunkStartPoint.set(x, y);
    }

    public Point2 getChunkStartPoint() {
        return this.chunkStartPoint;
    }

    public void setChunkArea(int chunkArea) {
        this.chunkArea = chunkArea;
    }

    public int getChunkArea() {
        return this.chunkArea;
    }

    public void setTile(Point2 point) {
        this.tile = editor.tiles()[point.x][point.y];
    }

    public Tile getTile() {
        return this.tile;
    }

    public void setMesh(Point2 point) {
        this.mesh = chunks[point.x][point.y];
    }

    public void setWall(Block wall) {
        this.wall = wall;
    }

    public void setEditor(MapEditor editor) {
        this.editor = editor;
    }

    public void setChunks(IndexedRenderer[][] chunks) {
        this.chunks = chunks;
    }

    protected class FloatPoint{
        private float x;
        private float y;

        public  FloatPoint() {

        }

        public void setPoint(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public float getY() {
            return y;
        }

        public void setX(float x) {
            this.x = x;
        }

        public void setY(float y) {
            this.y = y;
        }
    }
}
