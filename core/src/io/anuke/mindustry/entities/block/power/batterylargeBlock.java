package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class batterylargeBlock extends Battery {
	public batterylargeBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.titanium, 40, Items.lead, 80, Items.silicon, 40));
            size = 3;
            consumes.powerBuffered(50000f);
        
	}
}