package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class surgewalllargeBlock extends SurgeWall {
	public surgewalllargeBlock(String name, int wallHealthMultiplier){
		super(name);

            requirements(Category.defense, ItemStack.with(Items.surgealloy, 12 * 4));
            health = 230 * 4 * wallHealthMultiplier;
            size = 2;
        
	}
}