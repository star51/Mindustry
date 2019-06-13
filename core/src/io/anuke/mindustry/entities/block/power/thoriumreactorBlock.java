package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class thoriumreactorBlock extends NuclearReactor {
	public thoriumreactorBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.lead, 600, Items.silicon, 400, Items.graphite, 300, Items.thorium, 300, Items.metaglass, 100));
            size = 3;
            health = 700;
            powerProduction = 14f;
            consumes.item(Items.thorium);
            heating = 0.02f;
            consumes.liquid(Liquids.cryofluid, 0.1f).update(false);
        
	}
}