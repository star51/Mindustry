package io.anuke.mindustry.entities.block.liquid;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class rotarypumpBlock extends Pump {
	public rotarypumpBlock(String name){
		super(name);

            requirements(Category.liquid, ItemStack.with(Items.copper, 140, Items.lead, 100, Items.silicon, 40, Items.titanium, 70));
            pumpAmount = 0.8f;
            consumes.power(0.15f);
            liquidCapacity = 30f;
            hasPower = true;
            size = 2;
        
	}
}