package io.anuke.mindustry.entities.block.upgrades;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class taumechpadBlock extends MechPad {
	public taumechpadBlock(String name){
		super(name);

            requirements(Category.upgrade, ItemStack.with(Items.lead, 250, Items.titanium, 250, Items.copper, 250, Items.silicon, 250));
            mech = Mechs.tau;
            size = 2;
            consumes.power(1f);
        
	}
}