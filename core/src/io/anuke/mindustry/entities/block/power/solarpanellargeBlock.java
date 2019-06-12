package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class solarpanellargeBlock extends SolarGenerator {
	public solarpanellargeBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.lead, 200, Items.silicon, 290, Items.phasefabric, 30));
            size = 3;
            powerProduction = 0.9f;
        
	}
}