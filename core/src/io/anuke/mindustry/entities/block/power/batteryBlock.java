package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class batteryBlock extends Battery {
	public batteryBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.copper, 8, Items.lead, 40));
            consumes.powerBuffered(4000f);
        
	}
}