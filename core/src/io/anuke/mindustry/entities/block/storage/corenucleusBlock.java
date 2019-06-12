package io.anuke.mindustry.entities.block.storage;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.storage.*;

public class corenucleusBlock extends CoreBlock {
	public corenucleusBlock(String name){
		super(name);

            requirements(Category.effect, () -> false, ItemStack.with(Items.titanium, 8000, Items.silicon, 4000, Items.surgealloy, 2000));

            health = 4000;
            itemCapacity = 13000;
            size = 5;
        
	}
}