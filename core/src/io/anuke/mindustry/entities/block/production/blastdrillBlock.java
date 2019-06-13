package io.anuke.mindustry.entities.block.production;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class blastdrillBlock extends Drill {
	public blastdrillBlock(String name){
		super(name);

            requirements(Category.production, ItemStack.with(Items.copper, 130, Items.silicon, 120, Items.titanium, 100, Items.thorium, 100));
            drillTime = 200;
            size = 4;
            drawRim = true;
            hasPower = true;
            tier = 5;
            updateEffect = Fx.pulverizeRed;
            updateEffectChance = 0.03f;
            drillEffect = Fx.mineHuge;
            rotateSpeed = 6f;
            warmupSpeed = 0.01f;

            consumes.power(3f);
            consumes.liquid(Liquids.water, 0.1f).boost();
        
	}
}