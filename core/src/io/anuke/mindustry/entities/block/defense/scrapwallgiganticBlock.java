package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class scrapwallgiganticBlock extends Wall {
	public scrapwallgiganticBlock(String name, int wallHealthMultiplier){
		super(name);

            health = 60 * 16 * wallHealthMultiplier;
            size = 4;
        
	}
}