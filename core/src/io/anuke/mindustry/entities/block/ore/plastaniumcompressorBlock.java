package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.arc.graphics.g2d.*;
import io.anuke.arc.math.*;
import io.anuke.mindustry.world.blocks.production.*;

public class plastaniumcompressorBlock extends GenericCrafter {
	public plastaniumcompressorBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.silicon, 160, Items.lead, 230, Items.graphite, 120, Items.titanium, 160));
            hasItems = true;
            liquidCapacity = 60f;
            craftTime = 60f;
            outputItem = new ItemStack(Items.plastanium, 1);
            size = 2;
            health = 320;
            hasPower = hasLiquids = true;
            craftEffect = Fx.formsmoke;
            updateEffect = Fx.plasticburn;

            consumes.liquid(Liquids.oil, 0.25f);
            consumes.power(3f);
            consumes.item(Items.titanium, 2);

            int topRegion = reg("-top");

            drawer = tile -> {
                Draw.rect(region, tile.drawx(), tile.drawy());

                GenericCrafterEntity entity = tile.entity();

                Draw.alpha(Mathf.absin(entity.totalProgress, 3f, 0.9f) * entity.warmup);
                Draw.rect(reg(topRegion), tile.drawx(), tile.drawy());
                Draw.reset();
            };
        
	}
}