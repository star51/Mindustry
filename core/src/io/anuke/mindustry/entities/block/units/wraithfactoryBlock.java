package io.anuke.mindustry.entities.block.units;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class wraithfactoryBlock extends UnitFactory {
	public wraithfactoryBlock(String name){
		super(name);

            requirements(Category.units, ItemStack.with(Items.titanium, 60, Items.lead, 80, Items.silicon, 90));
            type = UnitTypes.wraith;
            produceTime = 1800;
            size = 2;
            consumes.power(1f);
            consumes.items(new ItemStack(Items.silicon, 10), new ItemStack(Items.titanium, 10));
        
	}
}