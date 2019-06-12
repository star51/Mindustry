package io.anuke.mindustry.entities.block.liquid;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class liquidtankBlock extends LiquidTank {
	public liquidtankBlock(String name){
		super(name);

            requirements(Category.liquid, ItemStack.with(Items.titanium, 50, Items.metaglass, 50));
            size = 3;
            liquidCapacity = 1500f;
            health = 500;
        
	}
}