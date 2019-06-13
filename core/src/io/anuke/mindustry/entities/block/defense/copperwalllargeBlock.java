package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class copperwalllargeBlock extends Wall {
	public copperwalllargeBlock(String name, int wallHealthMultiplier){
		super(name);

            requirements(Category.defense, ItemStack.with(Items.copper, 12 * 4));
            health = 80 * 4 * wallHealthMultiplier;
            size = 2;
        
	}
}