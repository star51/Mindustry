package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.arc.graphics. *;
import io.anuke.mindustry.world.blocks.production.*;

public class pyratitemixerBlock extends GenericSmelter {
	public pyratitemixerBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.copper, 100, Items.lead, 50));
            flameColor = Color.CLEAR;
            hasItems = true;
            hasPower = true;
            outputItem = new ItemStack(Items.pyratite, 1);

            size = 2;

            consumes.power(0.20f);
            consumes.items(new ItemStack(Items.coal, 1), new ItemStack(Items.lead, 2), new ItemStack(Items.sand, 2));
        
	}
}