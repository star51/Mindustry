package io.anuke.mindustry.entities.block.storage;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.storage.*;

public class corefoundationBlock extends CoreBlock {
	public corefoundationBlock(String name){
		super(name);

            requirements(Category.effect, () -> false, ItemStack.with(Items.titanium, 3000, Items.silicon, 2000));

            health = 2000;
            itemCapacity = 9000;
            size = 4;
        
	}
}