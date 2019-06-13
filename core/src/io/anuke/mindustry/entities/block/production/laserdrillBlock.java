package io.anuke.mindustry.entities.block.production;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class laserdrillBlock extends Drill {
	public laserdrillBlock(String name){
		super(name);

            requirements(Category.production, ItemStack.with(Items.copper, 70, Items.graphite, 90, Items.silicon, 60, Items.titanium, 50));
            drillTime = 280;
            size = 3;
            hasPower = true;
            tier = 4;
            updateEffect = Fx.pulverizeMedium;
            drillEffect = Fx.mineBig;

            consumes.power(1.10f);
            consumes.liquid(Liquids.water, 0.08f).boost();
        
	}
}