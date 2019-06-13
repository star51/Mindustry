package io.anuke.mindustry.entities.block.upgrades;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class deltamechpadBlock extends MechPad {
	public deltamechpadBlock(String name){
		super(name);

            requirements(Category.upgrade, ItemStack.with(Items.lead, 350, Items.titanium, 350, Items.copper, 400, Items.silicon, 450, Items.thorium, 300));
            mech = Mechs.delta;
            size = 2;
            consumes.power(0.7f);
        
	}
}