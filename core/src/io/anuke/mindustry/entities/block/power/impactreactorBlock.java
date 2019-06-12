package io.anuke.mindustry.entities.block.power;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.power.*;

public class impactreactorBlock extends ImpactReactor {
	public impactreactorBlock(String name){
		super(name);

            requirements(Category.power, ItemStack.with(Items.lead, 1000, Items.silicon, 600, Items.graphite, 800, Items.thorium, 200, Items.surgealloy, 500, Items.metaglass, 500));
            size = 4;
            health = 900;
            powerProduction = 130f;
            itemDuration = 90f;
            consumes.power(25f);
            consumes.item(Items.blastCompound);
            consumes.liquid(Liquids.cryofluid, 0.25f);
        
	}
}