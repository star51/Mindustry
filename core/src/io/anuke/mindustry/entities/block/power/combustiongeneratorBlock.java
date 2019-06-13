package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class combustiongeneratorBlock extends BurnerGenerator {
	public combustiongeneratorBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.copper, 50, Items.lead, 30));
            powerProduction = 1f;
            itemDuration = 60f;
        
	}
}