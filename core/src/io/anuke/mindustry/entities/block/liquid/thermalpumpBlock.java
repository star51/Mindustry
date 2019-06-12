package io.anuke.mindustry.entities.block.liquid;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class thermalpumpBlock extends Pump {
	public thermalpumpBlock(String name){
		super(name);

            requirements(Category.liquid, ItemStack.with(Items.copper, 160, Items.lead, 130, Items.silicon, 60, Items.titanium, 80, Items.thorium, 70));
            pumpAmount = 1.95f;
            consumes.power(0.30f);
            liquidCapacity = 40f;
            hasPower = true;
            size = 3;
        
	}
}