package io.anuke.mindustry.editor;

import io.anuke.arc.Core;
import io.anuke.arc.graphics.g2d.Draw;
import io.anuke.arc.graphics.g2d.TextureRegion;
import io.anuke.arc.math.geom.Point2;
import io.anuke.mindustry.graphics.IndexedRenderer;
import io.anuke.mindustry.world.blocks.BlockPart;

public class MeshStrategy extends RenderStrategy{
    private static MeshStrategy meshStrategy;
    private int indexWall;

    private MeshStrategy() {
        super();
        indexWall = 0;
    }

    public static MeshStrategy getInstance(MapEditor editor, IndexedRenderer[][] chunks,
                                                        int windowX, int windowY, int chunkSize){
        if (meshStrategy == null) {
            meshStrategy = new MeshStrategy();
        }
        preprocessing(meshStrategy, editor, chunks, windowX, windowY, chunkSize);
        Point2 chunkStart = meshStrategy.getChunkStartPoint();
        final int indexWall = chunkStart.x + chunkStart.y;
        meshStrategy.setIndexWall(indexWall);
        return meshStrategy;
    }

    @Override
    public void renderRegion() {
        TextureRegion textureRegion;
        final boolean isAirBlock = getIsAirBlock(wall);
        final boolean isBlockPart = (wall.synthetic() || wall instanceof BlockPart);
        boolean needsRotate = false;

        region.setX(windowPoint.x * tileSize);
        region.setY(windowPoint.y * tileSize);
        region.setWidth(tileSize);
        region.setHeight(tileSize);
        if (!isAirBlock && isBlockPart) {
            final boolean isEditorIconExist = Core.atlas.isFound(wall.editorIcon());
            float offsetX = wall.offset();
            float offsetY = wall.offset();
            needsRotate = wall.rotate;
            textureRegion = getEditorIcon(wall, isEditorIconExist);

            if (!needsRotate) {
                offsetX += getMeshOffset(textureRegion.getWidth());
                offsetY += getMeshOffset(textureRegion.getHeight());
            }
            region.setX(region.getX() + offsetX);
            region.setY(region.getY() + offsetY);
            region.setWidth(textureRegion.getWidth() * Draw.scl);
            region.setHeight(textureRegion.getHeight() * Draw.scl);
        } else {
            final int editorVariantRegionLength = tile.floor().editorVariantRegions().length;
            final int randomValue = getRandomValue(indexWall, editorVariantRegionLength);
            textureRegion = tile.floor().editorVariantRegions()[randomValue];
        }
        drawMesh(textureRegion, indexWall, needsRotate);
    }

    public void setIndexWall(int indexWall) {
        this.indexWall = indexWall;
    }
}
