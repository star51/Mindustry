package io.anuke.mindustry.entities.block.units;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class daggerfactoryBlock extends UnitFactory {
	public daggerfactoryBlock(String name){
		super(name);

            requirements(Category.units, ItemStack.with(Items.lead, 90, Items.silicon, 70));
            type = UnitTypes.dagger;
            produceTime = 1700;
            size = 2;
            consumes.power(0.50f);
            consumes.items(new ItemStack(Items.silicon, 10));
        
	}
}