package io.anuke.mindustry.entities.block.sandbox;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import static io.anuke.mindustry.Vars.state;
import io.anuke.mindustry.world.blocks.sandbox.*;

public class itemsourceBlock extends ItemSource {
	public itemsourceBlock(String name){
		super(name);

            requirements(Category.distribution, () -> state.rules.infiniteResources, ItemStack.with());
            alwaysUnlocked = true;
        
	}
}