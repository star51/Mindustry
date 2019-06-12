package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.*;

public class sandBlock extends Floor {
	public sandBlock(String name){
		super(name);

            itemDrop = Items.sand;
            playerUnmineable = true;
        
	}
}