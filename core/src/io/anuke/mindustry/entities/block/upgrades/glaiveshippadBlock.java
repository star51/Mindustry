package io.anuke.mindustry.entities.block.upgrades;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.units.*;

public class glaiveshippadBlock extends MechPad {
	public glaiveshippadBlock(String name){
		super(name);

            requirements(Category.upgrade, ItemStack.with(Items.lead, 450, Items.silicon, 650, Items.titanium, 700, Items.plastanium, 600, Items.surgealloy, 200));
            mech = Mechs.glaive;
            size = 3;
            consumes.power(1.2f);
        
	}
}