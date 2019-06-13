package io.anuke.mindustry.entities.block.liquid;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class liquidrouterBlock extends LiquidRouter {
	public liquidrouterBlock(String name){
		super(name);

            requirements(Category.liquid, ItemStack.with(Items.titanium, 4, Items.metaglass, 4));
            liquidCapacity = 20f;
        
	}
}