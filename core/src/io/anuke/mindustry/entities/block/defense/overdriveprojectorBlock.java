package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class overdriveprojectorBlock extends OverdriveProjector {
	public overdriveprojectorBlock(String name){
		super(name);

            requirements(Category.effect, ItemStack.with(Items.lead, 200, Items.titanium, 150, Items.silicon, 150, Items.plastanium, 60));
            consumes.power(3.50f);
            size = 2;
            consumes.item(Items.phasefabric).boost();
        
	}
}