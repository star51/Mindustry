package io.anuke.mindustry.entities.block.turrets;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.arc.graphics. *;
import io.anuke.mindustry.world.blocks.defense.turrets.*;

public class lancerBlock extends ChargeTurret {
	public lancerBlock(String name){
		super(name);

            requirements(Category.turret, ItemStack.with(Items.copper, 50, Items.lead, 100, Items.silicon, 90));
            range = 155f;
            chargeTime = 50f;
            chargeMaxDelay = 30f;
            chargeEffects = 7;
            shootType = Bullets.lancerLaser;
            recoil = 2f;
            reload = 90f;
            cooldown = 0.03f;
            powerUse = 2.5f;
            shootShake = 2f;
            shootEffect = Fx.lancerLaserShoot;
            smokeEffect = Fx.lancerLaserShootSmoke;
            chargeEffect = Fx.lancerLaserCharge;
            chargeBeginEffect = Fx.lancerLaserChargeBegin;
            heatColor = Color.RED;
            size = 2;
            health = 280 * size * size;
            targetAir = false;
        
	}
}