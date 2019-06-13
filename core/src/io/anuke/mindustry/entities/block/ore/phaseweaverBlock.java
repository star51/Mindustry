package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.Vars;
import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.graphics.Pal;
import io.anuke.mindustry.type.*;
import io.anuke.arc.graphics.g2d.*;
import io.anuke.arc.Core;
import io.anuke.arc.math.*;
import io.anuke.mindustry.world.blocks.production.*;

public class phaseweaverBlock extends GenericCrafter {
	public phaseweaverBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.silicon, 260, Items.lead, 240, Items.thorium, 150));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.phasefabric, 1);
            craftTime = 120f;
            size = 2;
            hasPower = true;

            consumes.items(new ItemStack(Items.thorium, 4), new ItemStack(Items.sand, 10));
            consumes.power(5f);

            int bottomRegion = reg("-bottom"), weaveRegion = reg("-weave");

            drawIcons = () -> new TextureRegion[]{Core.atlas.find(name + "-bottom"), Core.atlas.find(name)};

            drawer = tile -> {
                GenericCrafterEntity entity = tile.entity();

                Draw.rect(reg(bottomRegion), tile.drawx(), tile.drawy());
                Draw.rect(reg(weaveRegion), tile.drawx(), tile.drawy(), entity.totalProgress);

                Draw.color(Pal.accent);
                Draw.alpha(entity.warmup);

                Lines.lineAngleCenter(
                tile.drawx() + Mathf.sin(entity.totalProgress, 6f, Vars.tilesize / 3f * size),
                tile.drawy(),
                90,
                size * Vars.tilesize / 2f);

                Draw.reset();

                Draw.rect(region, tile.drawx(), tile.drawy());
            };
        
	}
}