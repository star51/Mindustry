package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class mendprojectorBlock extends MendProjector {
	public mendprojectorBlock(String name){
		super(name);

            requirements(Category.effect, ItemStack.with(Items.lead, 200, Items.titanium, 50, Items.silicon, 80));
            consumes.power(1.5f);
            size = 2;
            reload = 250f;
            range = 85f;
            healPercent = 14f;
            health = 80 * size * size;
            consumes.item(Items.phasefabric).boost();
        
	}
}