package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class scrapwalllargeBlock extends Wall {
	public scrapwalllargeBlock(String name, int wallHealthMultiplier){
		super(name);

            health = 60 * 4 * wallHealthMultiplier;
            size = 2;
            variants = 4;
        
	}
}