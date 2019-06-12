package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class differentialgeneratorBlock extends SingleTypeGenerator {
	public differentialgeneratorBlock(String name){
		super(true, false, name);

            requirements(Category.power, ItemStack.with(Items.copper, 140, Items.titanium, 100, Items.lead, 200, Items.silicon, 130, Items.metaglass, 100));
            powerProduction = 16f;
            itemDuration = 50f;
            hasLiquids = true;
            size = 3;

            consumes.item(Items.pyratite).optional(true, false);
            consumes.liquid(Liquids.cryofluid, 0.2f);
        
	}
}