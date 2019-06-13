package io.anuke.mindustry.entities.block.distribution;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class phaseconveyorBlock extends ItemBridge {
	public phaseconveyorBlock(String name){
		super(name);

            requirements(Category.distribution, ItemStack.with(Items.phasefabric, 10, Items.silicon, 15, Items.lead, 20, Items.graphite, 20));
            range = 12;
            hasPower = true;
            consumes.power(0.30f);
        
	}
}