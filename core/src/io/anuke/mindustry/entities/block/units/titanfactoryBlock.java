package io.anuke.mindustry.entities.block.units;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class titanfactoryBlock extends UnitFactory {
	public titanfactoryBlock(String name){
		super(name);

            requirements(Category.units, ItemStack.with(Items.thorium, 90, Items.lead, 140, Items.silicon, 90));
            type = UnitTypes.titan;
            produceTime = 3400;
            size = 3;
            consumes.power(1.50f);
            consumes.items(new ItemStack(Items.silicon, 20), new ItemStack(Items.thorium, 30));
        
	}
}