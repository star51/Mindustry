package io.anuke.mindustry.entities.block.liquid;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.distribution.*;

public class phaseconduitBlock extends LiquidBridge {
	public phaseconduitBlock(String name){
		super(name);

            requirements(Category.liquid, ItemStack.with(Items.phasefabric, 10, Items.silicon, 15, Items.metaglass, 40, Items.titanium, 20));
            range = 12;
            hasPower = true;
            consumes.power(0.30f);
        
	}
}