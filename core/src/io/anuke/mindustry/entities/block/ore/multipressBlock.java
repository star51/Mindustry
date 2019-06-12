package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class multipressBlock extends GenericCrafter {
	public multipressBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.titanium, 200, Items.silicon, 50, Items.lead, 200, Items.graphite, 100));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(Items.graphite, 2);
            craftTime = 30f;
            size = 3;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;

            consumes.power(2f);
            consumes.item(Items.coal, 4);
            consumes.liquid(Liquids.water, 0.1f);
        
	}
}