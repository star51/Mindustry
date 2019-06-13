package io.anuke.mindustry.entities.block.liquid;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class conduitBlock extends Conduit {
	public conduitBlock(String name){
		super(name);

            requirements(Category.liquid, ItemStack.with(Items.metaglass, 1));
            health = 45;
        
	}
}