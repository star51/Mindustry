package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class blastmixerBlock extends GenericCrafter {
	public blastmixerBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.lead, 60, Items.titanium, 40));
            hasItems = true;
            hasPower = true;
            outputItem = new ItemStack(Items.blastCompound, 1);
            size = 2;

            consumes.items(new ItemStack(Items.pyratite, 1), new ItemStack(Items.sporePod, 1));
            consumes.power(0.40f);
        
	}
}