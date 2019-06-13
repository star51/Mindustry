package io.anuke.mindustry.entities.block.storage;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.storage.*;

public class unloaderBlock extends Unloader {
	public unloaderBlock(String name){
		super(name);

            requirements(Category.effect, ItemStack.with(Items.titanium, 50, Items.silicon, 60));
            speed = 7f;
        
	}
}