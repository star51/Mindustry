package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class thermalgeneratorBlock extends ThermalGenerator {
	public thermalgeneratorBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.copper, 80, Items.graphite, 70, Items.lead, 100, Items.silicon, 70, Items.metaglass, 80));
            powerProduction = 1.8f;
            generateEffect = Fx.redgeneratespark;
            size = 2;
        
	}
}