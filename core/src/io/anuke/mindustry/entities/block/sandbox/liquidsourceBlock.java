package io.anuke.mindustry.entities.block.sandbox;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import static io.anuke.mindustry.Vars.state;
import io.anuke.mindustry.world.blocks.sandbox.*;

public class liquidsourceBlock extends LiquidSource {
	public liquidsourceBlock(String name){
		super(name);

            requirements(Category.liquid, () -> state.rules.infiniteResources, ItemStack.with());
            alwaysUnlocked = true;
        
	}
}