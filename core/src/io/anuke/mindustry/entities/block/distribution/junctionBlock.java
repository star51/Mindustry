package io.anuke.mindustry.entities.block.distribution;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class junctionBlock extends Junction {
	public junctionBlock(String name){
		super(name);

            requirements(Category.distribution, ItemStack.with(Items.copper, 3), true);
            speed = 26;
            capacity = 15;
            health = 30;
        
	}
}