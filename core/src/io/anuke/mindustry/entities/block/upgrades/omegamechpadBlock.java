package io.anuke.mindustry.entities.block.upgrades;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class omegamechpadBlock extends MechPad {
	public omegamechpadBlock(String name){
		super(name);

            requirements(Category.upgrade, ItemStack.with(Items.lead, 450, Items.graphite, 550, Items.silicon, 650, Items.thorium, 600, Items.surgealloy, 240));
            mech = Mechs.omega;
            size = 3;
            consumes.power(1.2f);
        
	}
}