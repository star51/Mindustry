package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class coalcentrifugeBlock extends GenericCrafter {
	public coalcentrifugeBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.titanium, 40, Items.graphite, 80, Items.lead, 60));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.coal, 1);
            craftTime = 30f;
            size = 2;
            hasPower = hasItems = hasLiquids = true;

            consumes.liquid(Liquids.oil, 0.09f);
            consumes.power(0.5f);
        
	}
}