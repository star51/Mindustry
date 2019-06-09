package io.anuke.mindustry.editor;

import io.anuke.arc.Core;
import io.anuke.arc.graphics.Color;
import io.anuke.arc.graphics.g2d.Draw;
import io.anuke.arc.graphics.g2d.TextureRegion;
import io.anuke.arc.math.Mathf;
import io.anuke.arc.math.geom.Point2;
import io.anuke.mindustry.game.Team;
import io.anuke.mindustry.graphics.IndexedRenderer;

public class TileStrategy extends RenderStrategy{
    private static TileStrategy tileStrategy;

    private int indexWall;
    private int indexDecal;

    private TileStrategy() {
        super();
        indexWall = 0;
        indexDecal = 0;
    }

    public static TileStrategy getInstance(MapEditor editor, IndexedRenderer[][] chunks,
                                                        int windowX, int windowY, int chunkSize){
        if (tileStrategy == null) {
            tileStrategy = new TileStrategy();
        }
        preprocessing(tileStrategy, editor, chunks, windowX, windowY, chunkSize);
        Point2 chunkStart = tileStrategy.getChunkStartPoint();
        final int indexWall = chunkStart.x + chunkStart.y;
        final int indexDecal = chunkStart.x + chunkStart.y + tileStrategy.getChunkArea();
        tileStrategy.setIndexWall(indexWall);
        tileStrategy.setIndexDecal(indexDecal);
        return tileStrategy;
    }

    private TextureRegion getSyntheticTexture() {
        Team team = tile.getTeam();
        mesh.setColor(team.color);
        return getRegionInstance("block-border-editor");
    }

    private TextureRegion getNaturalTexture() {
        final boolean isWallSynthetic = wall.synthetic();
        final boolean isAirBlock = getIsAirBlock(wall);
        final boolean isTileOverlay = tile.overlay() != null;
        TextureRegion textureRegion;
        if(!isWallSynthetic && !isAirBlock) {
            textureRegion = getBlockTexture();
            offset.setX(getMeshOffset(textureRegion.getWidth()));
            offset.setY(getMeshOffset(textureRegion.getHeight()));
        } else if (isAirBlock && isTileOverlay) {
            textureRegion = getTileOverlayTexture();
        } else {
            textureRegion = getRegionInstance("clear-editor");
        }

        return textureRegion;
    }

    private TextureRegion getBlockTexture() {
        final boolean isEditorIconExist = Core.atlas.isFound(wall.editorIcon());
        return getEditorIcon(wall, isEditorIconExist);
    }

    private TextureRegion getTileOverlayTexture() {
        final int editorVariantRegionLength = tile.overlay().editorVariantRegions().length;
        final int randomValue = getRandomValue(indexWall, editorVariantRegionLength);
        return tile.overlay().editorVariantRegions()[randomValue];
    }

    @Override
    public void renderRegion() {
        TextureRegion textureRegion;

        final float offsetSize = -Mathf.floor((float)(wall.size / 3.0)) * tileSize;
        offset.setPoint(offsetSize, offsetSize);

        if (wall.update || wall.destructible) {
            textureRegion = getSyntheticTexture();
        } else {
            textureRegion = getNaturalTexture();
        }

        region.setX(windowPoint.x * tileSize + offset.getX());
        region.setY(windowPoint.y * tileSize + offset.getY());
        region.setHeight(textureRegion.getWidth() * Draw.scl);
        region.setWidth(textureRegion.getHeight() * Draw.scl);

        drawMesh(textureRegion, indexDecal, false);
        mesh.setColor(Color.WHITE);
    }

    public void setIndexWall(int indexWall) {
        this.indexWall = indexWall;
    }

    public void setIndexDecal(int indexDecal) {
        this.indexDecal = indexDecal;
    }
}
