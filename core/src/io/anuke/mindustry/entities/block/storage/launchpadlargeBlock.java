package io.anuke.mindustry.entities.block.storage;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import static io.anuke.mindustry.Vars.world;
import io.anuke.mindustry.world.blocks.storage.*;

public class launchpadlargeBlock extends LaunchPad {
	public launchpadlargeBlock(String name){
		super(name);

            requirements(Category.effect, () -> world.isZone(), ItemStack.with(Items.titanium, 400, Items.silicon, 300, Items.lead, 500, Items.plastanium, 150));
            size = 4;
            itemCapacity = 250;
            launchTime = 60f * 7;
            hasPower = true;
            consumes.power(2f);
        
	}
}