package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.arc.graphics.g2d.*;
import io.anuke.mindustry.world.modules.LiquidModule;
import io.anuke.arc.Core;
import io.anuke.mindustry.world.blocks.production.*;

public class cryofluidmixerBlock extends LiquidConverter {
	public cryofluidmixerBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.lead, 130, Items.silicon, 80, Items.thorium, 90));
            outputLiquid = new LiquidStack(Liquids.cryofluid, 0.1f);
            craftTime = 60f;
            size = 2;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;
            outputsLiquid = true;

            consumes.power(1f);
            consumes.item(Items.titanium);
            consumes.liquid(Liquids.water, 0.1f);

            int liquidRegion = reg("-liquid"), topRegion = reg("-top"), bottomRegion = reg("-bottom");

            drawIcons = () -> new TextureRegion[]{Core.atlas.find(name + "-bottom"), Core.atlas.find(name + "-top")};

            drawer = tile -> {
                LiquidModule mod = tile.entity.liquids;

                int rotation = rotate ? tile.rotation() * 90 : 0;

                Draw.rect(reg(bottomRegion), tile.drawx(), tile.drawy(), rotation);

                if(mod.total() > 0.001f){
                    Draw.color(outputLiquid.liquid.color);
                    Draw.alpha(mod.get(outputLiquid.liquid) / liquidCapacity);
                    Draw.rect(reg(liquidRegion), tile.drawx(), tile.drawy(), rotation);
                    Draw.color();
                }

                Draw.rect(reg(topRegion), tile.drawx(), tile.drawy(), rotation);
            };
        
	}
}