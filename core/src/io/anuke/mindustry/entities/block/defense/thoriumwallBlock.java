package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class thoriumwallBlock extends Wall {
	public thoriumwallBlock(String name, int wallHealthMultiplier){
		super(name);

            requirements(Category.defense, ItemStack.with(Items.thorium, 12));
            health = 200 * wallHealthMultiplier;
        
	}
}