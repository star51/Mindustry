package io.anuke.mindustry.entities.block.production;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class pneumaticdrillBlock extends Drill {
	public pneumaticdrillBlock(String name){
		super(name);

            requirements(Category.production, ItemStack.with(Items.copper, 60, Items.graphite, 50));
            tier = 3;
            drillTime = 480;
            size = 2;
            drawMineItem = true;
            consumes.liquid(Liquids.water, 0.06f).boost();
        
	}
}