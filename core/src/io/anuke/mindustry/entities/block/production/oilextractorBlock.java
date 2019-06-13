package io.anuke.mindustry.entities.block.production;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.meta.*;
import io.anuke.mindustry.world.blocks.production.*;

public class oilextractorBlock extends Fracker {
	public oilextractorBlock(String name){
		super(name);

            requirements(Category.production, ItemStack.with(Items.copper, 300, Items.graphite, 350, Items.lead, 230, Items.thorium, 230, Items.silicon, 150));
            result = Liquids.oil;
            updateEffect = Fx.pulverize;
            liquidCapacity = 50f;
            updateEffectChance = 0.05f;
            pumpAmount = 0.25f;
            size = 3;
            liquidCapacity = 30f;
            attribute = Attribute.oil;

            consumes.item(Items.sand);
            consumes.power(3f);
            consumes.liquid(Liquids.water, 0.15f);
        
	}
}