package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class turbinegeneratorBlock extends BurnerGenerator {
	public turbinegeneratorBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.copper, 70, Items.graphite, 50, Items.lead, 80, Items.silicon, 60));
            powerProduction = 6f;
            itemDuration = 40f;
            consumes.liquid(Liquids.water, 0.05f);
            hasLiquids = true;
            size = 2;
        
	}
}