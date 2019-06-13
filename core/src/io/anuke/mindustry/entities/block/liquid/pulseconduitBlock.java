package io.anuke.mindustry.entities.block.liquid;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class pulseconduitBlock extends Conduit {
	public pulseconduitBlock(String name){
		super(name);

            requirements(Category.liquid, ItemStack.with(Items.titanium, 1, Items.metaglass, 2));
            liquidCapacity = 16f;
            liquidFlowFactor = 4.9f;
            health = 90;
        
	}
}