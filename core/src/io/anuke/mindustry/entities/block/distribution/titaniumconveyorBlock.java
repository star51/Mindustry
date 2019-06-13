package io.anuke.mindustry.entities.block.distribution;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class titaniumconveyorBlock extends Conveyor {
	public titaniumconveyorBlock(String name){
		super(name);

            requirements(Category.distribution, ItemStack.with(Items.copper, 2, Items.lead, 1, Items.titanium, 1));
            health = 65;
            speed = 0.08f;
        
	}
}