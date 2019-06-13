package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.arc.graphics.g2d.*;
import io.anuke.arc.Core;
import io.anuke.mindustry.world.blocks.production.*;

public class pulverizerBlock extends GenericCrafter {
	public pulverizerBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.copper, 60, Items.lead, 50));
            outputItem = new ItemStack(Items.sand, 1);
            craftEffect = Fx.pulverize;
            craftTime = 40f;
            updateEffect = Fx.pulverizeSmall;
            hasItems = hasPower = true;

            consumes.item(Items.scrap, 1);
            consumes.power(0.50f);

            int rotatorRegion = reg("-rotator");

            drawIcons = () -> new TextureRegion[]{Core.atlas.find(name), Core.atlas.find(name + "-rotator")};

            drawer = tile -> {
                GenericCrafterEntity entity = tile.entity();

                Draw.rect(region, tile.drawx(), tile.drawy());
                Draw.rect(reg(rotatorRegion), tile.drawx(), tile.drawy(), entity.totalProgress * 2f);
            };
        
	}
}