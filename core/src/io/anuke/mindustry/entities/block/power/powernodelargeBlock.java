package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class powernodelargeBlock extends PowerNode {
	public powernodelargeBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.titanium, 10, Items.lead, 20, Items.silicon, 6));
            size = 2;
            maxNodes = 6;
            laserRange = 9.5f;
        
	}
}