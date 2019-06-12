package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class solarpanelBlock extends SolarGenerator {
	public solarpanelBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.lead, 20, Items.silicon, 30));
            powerProduction = 0.06f;
        
	}
}