package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class rtggeneratorBlock extends DecayGenerator {
	public rtggeneratorBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.lead, 200, Items.silicon, 150, Items.phasefabric, 50, Items.plastanium, 150, Items.thorium, 100));
            size = 2;
            powerProduction = 3f;
            itemDuration = 220f;
        
	}
}