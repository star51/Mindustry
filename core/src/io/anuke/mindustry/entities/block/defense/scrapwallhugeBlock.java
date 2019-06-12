package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class scrapwallhugeBlock extends Wall {
	public scrapwallhugeBlock(String name, int wallHealthMultiplier){
		super(name);

            health = 60 * 9 * wallHealthMultiplier;
            size = 3;
            variants = 3;
        
	}
}