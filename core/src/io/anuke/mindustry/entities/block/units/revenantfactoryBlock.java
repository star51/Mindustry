package io.anuke.mindustry.entities.block.units;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class revenantfactoryBlock extends UnitFactory {
	public revenantfactoryBlock(String name){
		super(name);

            requirements(Category.units, ItemStack.with(Items.plastanium, 300, Items.titanium, 400, Items.lead, 300, Items.silicon, 400, Items.surgealloy, 100));
            type = UnitTypes.revenant;
            produceTime = 8000;
            size = 4;
            consumes.power(3f);
            consumes.items(new ItemStack(Items.silicon, 80), new ItemStack(Items.titanium, 80), new ItemStack(Items.plastanium, 50));
        
	}
}