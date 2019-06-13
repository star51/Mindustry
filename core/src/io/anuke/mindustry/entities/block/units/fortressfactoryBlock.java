package io.anuke.mindustry.entities.block.units;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class fortressfactoryBlock extends UnitFactory {
	public fortressfactoryBlock(String name){
		super(name);

            requirements(Category.units, ItemStack.with(Items.thorium, 200, Items.lead, 220, Items.silicon, 150, Items.surgealloy, 100, Items.phasefabric, 50));
            type = UnitTypes.fortress;
            produceTime = 5000;
            size = 3;
            maxSpawn = 3;
            consumes.power(2f);
            consumes.items(new ItemStack(Items.silicon, 40), new ItemStack(Items.thorium, 50));
        
	}
}