package io.anuke.mindustry.entities.block.distribution;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class bridgeconveyorBlock extends BufferedItemBridge {
	public bridgeconveyorBlock(String name){
		super(name);

            requirements(Category.distribution, ItemStack.with(Items.lead, 8, Items.copper, 8));
            range = 4;
            speed = 70f;
            bufferCapacity = 15;
        
	}
}