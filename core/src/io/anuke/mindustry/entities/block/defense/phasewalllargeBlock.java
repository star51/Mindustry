package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class phasewalllargeBlock extends DeflectorWall {
	public phasewalllargeBlock(String name, int wallHealthMultiplier){
		super(name);

            requirements(Category.defense, ItemStack.with(Items.phasefabric, 12 * 4));
            health = 150 * 4 * wallHealthMultiplier;
            size = 2;
        
	}
}