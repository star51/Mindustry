package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class titaniumwallBlock extends Wall {
	public titaniumwallBlock(String name, int wallHealthMultiplier){
		super(name);

            requirements(Category.defense, ItemStack.with(Items.titanium, 12));
            health = 110 * wallHealthMultiplier;
        
	}
}