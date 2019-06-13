package io.anuke.mindustry.entities.block.production;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class cultivatorBlock extends Cultivator {
	public cultivatorBlock(String name){
		super(name);

            requirements(Category.production, ItemStack.with(Items.copper, 20, Items.lead, 50, Items.silicon, 20));
            outputItem = new ItemStack(Items.sporePod, 1);
            craftTime = 160;
            size = 2;
            hasLiquids = true;
            hasPower = true;
            hasItems = true;

            consumes.power(0.80f);
            consumes.liquid(Liquids.water, 0.15f);
        
	}
}