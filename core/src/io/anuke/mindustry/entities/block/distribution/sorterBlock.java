package io.anuke.mindustry.entities.block.distribution;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class sorterBlock extends Sorter {
	public sorterBlock(String name){
		super(name);

            requirements(Category.distribution, ItemStack.with(Items.lead, 4, Items.copper, 4));

        
	}
}