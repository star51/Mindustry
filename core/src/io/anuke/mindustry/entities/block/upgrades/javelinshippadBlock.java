package io.anuke.mindustry.entities.block.upgrades;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class javelinshippadBlock extends MechPad {
	public javelinshippadBlock(String name){
		super(name);

            requirements(Category.upgrade, ItemStack.with(Items.lead, 350, Items.silicon, 450, Items.titanium, 500, Items.plastanium, 400, Items.phasefabric, 200));
            mech = Mechs.javelin;
            size = 2;
            consumes.power(0.8f);
        
	}
}