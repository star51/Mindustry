package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class surgetowerBlock extends PowerNode {
	public surgetowerBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.titanium, 15, Items.lead, 20, Items.silicon, 30, Items.surgealloy, 30));
            size = 2;
            maxNodes = 2;
            laserRange = 30f;
        
	}
}