package io.anuke.mindustry.entities.block.storage;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.storage.*;

public class vaultBlock extends Vault {
	public vaultBlock(String name){
		super(name);

            requirements(Category.effect, ItemStack.with(Items.titanium, 500, Items.thorium, 250));
            size = 3;
            itemCapacity = 1000;
        
	}
}