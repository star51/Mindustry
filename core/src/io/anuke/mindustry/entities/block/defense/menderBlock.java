package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class menderBlock extends MendProjector {
	public menderBlock(String name){
		super(name);

            requirements(Category.effect, ItemStack.with(Items.lead, 60, Items.copper, 50));
            consumes.power(0.3f);
            size = 1;
            reload = 200f;
            range = 40f;
            healPercent = 4f;
            phaseBoost = 4f;
            phaseRangeBoost = 20f;
            health = 80;
            consumes.item(Items.silicon).boost();
        
	}
}