package io.anuke.mindustry.entities.block.units;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class phantomfactoryBlock extends UnitFactory {
	public phantomfactoryBlock(String name){
		super(name);

            requirements(Category.units, ItemStack.with(Items.titanium, 90, Items.thorium, 80, Items.lead, 110, Items.silicon, 210));
            type = UnitTypes.phantom;
            produceTime = 7300;
            size = 2;
            maxSpawn = 2;
            consumes.power(2f);
            consumes.items(new ItemStack(Items.silicon, 70), new ItemStack(Items.lead, 80), new ItemStack(Items.titanium, 80));
        
	}
}