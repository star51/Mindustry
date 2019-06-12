package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.arc.graphics. *;
import io.anuke.mindustry.world.blocks.production.*;

public class siliconsmelterBlock extends GenericSmelter {
	public siliconsmelterBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.copper, 60, Items.lead, 50));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.silicon, 1);
            craftTime = 40f;
            size = 2;
            hasPower = true;
            hasLiquids = false;
            flameColor = Color.valueOf("ffef99");

            consumes.items(new ItemStack(Items.coal, 1), new ItemStack(Items.sand, 2));
            consumes.power(0.50f);
        
	}
}