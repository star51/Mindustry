package io.anuke.mindustry.entities.block.liquid;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class bridgeconduitBlock extends LiquidExtendingBridge {
	public bridgeconduitBlock(String name){
		super(name);

            requirements(Category.liquid, ItemStack.with(Items.titanium, 8, Items.metaglass, 8));
            range = 4;
            hasPower = false;
        
	}
}