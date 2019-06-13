package io.anuke.mindustry.entities.block.units;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class repairpointBlock extends RepairPoint {
	public repairpointBlock(String name){
		super(name);

            requirements(Category.units, ItemStack.with(Items.lead, 30, Items.copper, 30, Items.silicon, 30));
            repairSpeed = 0.1f;
            powerUse = 1f;
        
	}
}