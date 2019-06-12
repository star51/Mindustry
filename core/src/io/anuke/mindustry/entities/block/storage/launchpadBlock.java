package io.anuke.mindustry.entities.block.storage;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import static io.anuke.mindustry.Vars.world;
import io.anuke.mindustry.world.blocks.storage.*;

public class launchpadBlock extends LaunchPad {
	public launchpadBlock(String name){
		super(name);

            requirements(Category.effect, () -> world.isZone(), ItemStack.with(Items.copper, 500, Items.silicon, 150, Items.lead, 200));
            size = 3;
            itemCapacity = 100;
            launchTime = 60f * 8;
            hasPower = true;
            consumes.power(1f);
        
	}
}