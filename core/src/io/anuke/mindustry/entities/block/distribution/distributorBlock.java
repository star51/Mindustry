package io.anuke.mindustry.entities.block.distribution;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class distributorBlock extends Router {
	public distributorBlock(String name){
		super(name);

            requirements(Category.distribution, ItemStack.with(Items.lead, 8, Items.copper, 8));
            size = 2;
        
	}
}