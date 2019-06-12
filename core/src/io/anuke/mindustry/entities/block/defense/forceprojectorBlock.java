package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class forceprojectorBlock extends ForceProjector {
	public forceprojectorBlock(String name){
		super(name);

            requirements(Category.effect, ItemStack.with(Items.lead, 200, Items.titanium, 150, Items.silicon, 250));
            size = 3;
            consumes.item(Items.phasefabric).boost();
            consumes.power(3f);
        
	}
}