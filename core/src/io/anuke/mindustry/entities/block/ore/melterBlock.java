package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class melterBlock extends GenericCrafter {
	public melterBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.copper, 60, Items.lead, 70, Items.graphite, 90));
            health = 200;
            outputLiquid = new LiquidStack(Liquids.slag, 2f);
            craftTime = 10f;
            hasLiquids = hasPower = true;

            consumes.power(1f);
            consumes.item(Items.scrap, 1);
        
	}
}