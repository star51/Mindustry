package io.anuke.mindustry.entities.block.distribution;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class routerBlock extends Router {
	public routerBlock(String name){
		super(name);

            requirements(Category.distribution, ItemStack.with(Items.copper, 6));

        
	}
}