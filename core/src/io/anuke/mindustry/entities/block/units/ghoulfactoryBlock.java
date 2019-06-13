package io.anuke.mindustry.entities.block.units;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class ghoulfactoryBlock extends UnitFactory {
	public ghoulfactoryBlock(String name){
		super(name);

            requirements(Category.units, ItemStack.with(Items.plastanium, 80, Items.titanium, 100, Items.lead, 130, Items.silicon, 220));
            type = UnitTypes.ghoul;
            produceTime = 3600;
            size = 3;
            consumes.power(2f);
            consumes.items(new ItemStack(Items.silicon, 30), new ItemStack(Items.titanium, 30), new ItemStack(Items.plastanium, 20));
        
	}
}