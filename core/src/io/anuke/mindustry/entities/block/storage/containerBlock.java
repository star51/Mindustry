package io.anuke.mindustry.entities.block.storage;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.storage.*;

public class containerBlock extends Vault {
	public containerBlock(String name){
		super(name);

            requirements(Category.effect, ItemStack.with(Items.titanium, 200));
            size = 2;
            itemCapacity = 300;
        
	}
}