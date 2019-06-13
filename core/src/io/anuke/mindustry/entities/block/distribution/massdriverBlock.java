package io.anuke.mindustry.entities.block.distribution;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class massdriverBlock extends MassDriver {
	public massdriverBlock(String name){
		super(name);

            requirements(Category.distribution, ItemStack.with(Items.titanium, 250, Items.silicon, 150, Items.lead, 250, Items.thorium, 100));
            size = 3;
            itemCapacity = 120;
            reloadTime = 200f;
            range = 440f;
            consumes.power(1.75f);
        
	}
}