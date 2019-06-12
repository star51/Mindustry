package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.arc.graphics.g2d.*;
import io.anuke.arc.Core;
import io.anuke.mindustry.world.Tile;
import io.anuke.mindustry.world.blocks.*;

public class airBlock extends Floor {
	public airBlock(String name){
		super(name);

        alwaysReplace = true;
        hasShadow = false;
	}

    public void draw(Tile tile){}
    public void load(){}
    public void init(){}
    public boolean isHidden(){
        return true;
    }

    public TextureRegion[] variantRegions(){
        if(variantRegions == null){
            variantRegions = new TextureRegion[]{Core.atlas.find("clear")};
        }
        return variantRegions;
    }
}