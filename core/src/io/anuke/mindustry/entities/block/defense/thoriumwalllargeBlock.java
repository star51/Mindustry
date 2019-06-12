package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class thoriumwalllargeBlock extends Wall {
	public thoriumwalllargeBlock(String name, int wallHealthMultiplier){
		super(name);

            requirements(Category.defense, ItemStack.with(Items.thorium, 12 * 4));
            health = 200 * wallHealthMultiplier * 4;
            size = 2;
        
	}
}