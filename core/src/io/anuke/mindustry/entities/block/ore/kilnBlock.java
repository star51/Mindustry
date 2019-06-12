package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.arc.graphics. *;
import io.anuke.mindustry.world.blocks.production.*;

public class kilnBlock extends GenericSmelter {
	public kilnBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.copper, 120, Items.graphite, 60, Items.lead, 60));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.metaglass, 1);
            craftTime = 30f;
            size = 2;
            hasPower = hasItems = true;
            flameColor = Color.valueOf("ffc099");

            consumes.items(new ItemStack(Items.lead, 1), new ItemStack(Items.sand, 1));
            consumes.power(0.60f);
        
	}
}