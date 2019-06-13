package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class alloysmelterBlock extends GenericSmelter {
	public alloysmelterBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.silicon, 160, Items.lead, 160, Items.thorium, 140));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.surgealloy, 1);
            craftTime = 75f;
            size = 3;
            hasPower = true;

            consumes.power(4f);
            consumes.items(new ItemStack(Items.titanium, 2), new ItemStack(Items.lead, 4), new ItemStack(Items.silicon, 3), new ItemStack(Items.copper, 3));
        
	}
}