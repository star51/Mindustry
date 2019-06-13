package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.arc.graphics.g2d.*;
import io.anuke.arc.graphics. *;
import io.anuke.arc.Core;
import io.anuke.arc.math.*;
import io.anuke.mindustry.world.blocks.production.*;

public class sporepressBlock extends GenericCrafter {
	public sporepressBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.lead, 70, Items.silicon, 60));
            liquidCapacity = 60f;
            craftTime = 20f;
            outputLiquid = new LiquidStack(Liquids.oil, 6f);
            size = 2;
            health = 320;
            hasLiquids = true;
            hasPower = true;
            craftEffect = Fx.none;

            consumes.item(Items.sporePod, 1);
            consumes.power(0.60f);

            int[] frameRegions = new int[3];
            for(int i = 0; i < 3; i++){
                frameRegions[i] = reg("-frame" + i);
            }

            int liquidRegion = reg("-liquid");
            int topRegion = reg("-top");

            drawIcons = () -> new TextureRegion[]{Core.atlas.find(name), Core.atlas.find(name + "-top")};

            drawer = tile -> {
                GenericCrafterEntity entity = tile.entity();

                Draw.rect(region, tile.drawx(), tile.drawy());
                Draw.rect(reg(frameRegions[(int)Mathf.absin(entity.totalProgress, 5f, 2.999f)]), tile.drawx(), tile.drawy());
                Draw.color(Color.CLEAR, tile.entity.liquids.current().color, tile.entity.liquids.total() / liquidCapacity);
                Draw.rect(reg(liquidRegion), tile.drawx(), tile.drawy());
                Draw.color();
                Draw.rect(reg(topRegion), tile.drawx(), tile.drawy());
            };
        
	}
}