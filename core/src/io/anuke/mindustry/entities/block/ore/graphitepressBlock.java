package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class graphitepressBlock extends GenericCrafter {
	public graphitepressBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.copper, 150, Items.lead, 60));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(Items.graphite, 1);
            craftTime = 90f;
            size = 2;
            hasItems = true;

            consumes.item(Items.coal, 2);
	}
}