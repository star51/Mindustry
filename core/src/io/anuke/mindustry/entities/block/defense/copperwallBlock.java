package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class copperwallBlock extends Wall {
	public copperwallBlock(String name, int wallHealthMultiplier){
		super(name);

            requirements(Category.defense, ItemStack.with(Items.copper, 12));
            health = 80 * wallHealthMultiplier;
        
	}
}