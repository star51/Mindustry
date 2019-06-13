package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.world.blocks.*;

public class darksandBlock extends Floor {
	public darksandBlock(String name){
		super(name);

            itemDrop = Items.sand;
            playerUnmineable = true;
        
	}
}