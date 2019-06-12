package io.anuke.mindustry.entities.block.units;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class crawlerfactoryBlock extends UnitFactory {
	public crawlerfactoryBlock(String name){
		super(name);

            requirements(Category.units, ItemStack.with(Items.lead, 100, Items.silicon, 80));
            type = UnitTypes.crawler;
            produceTime = 1200;
            size = 2;
            consumes.power(0.4f);
            consumes.items(new ItemStack(Items.blastCompound, 10));
        
	}
}