package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class titaniumwalllargeBlock extends Wall {
	public titaniumwalllargeBlock(String name, int wallHealthMultiplier){
		super(name);

            requirements(Category.defense, ItemStack.with(Items.titanium, 12 * 4));
            health = 110 * wallHealthMultiplier * 4;
            size = 2;
        
	}
}