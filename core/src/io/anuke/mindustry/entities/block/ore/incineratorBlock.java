package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class incineratorBlock extends Incinerator {
	public incineratorBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.graphite, 10, Items.lead, 30));
            health = 90;
            consumes.power(0.50f);
        
	}
}