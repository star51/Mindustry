package io.anuke.mindustry.entities.block.production;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.meta.*;
import io.anuke.mindustry.world.blocks.production.*;

public class waterextractorBlock extends SolidPump {
	public waterextractorBlock(String name){
		super(name);

            requirements(Category.production, ItemStack.with(Items.copper, 50, Items.graphite, 50, Items.lead, 40));
            result = Liquids.water;
            pumpAmount = 0.13f;
            size = 2;
            liquidCapacity = 30f;
            rotateSpeed = 1.4f;
            attribute = Attribute.water;

            consumes.power(0.90f);
        
	}
}