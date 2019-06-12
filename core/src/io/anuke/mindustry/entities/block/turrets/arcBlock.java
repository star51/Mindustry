package io.anuke.mindustry.entities.block.turrets;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.arc.graphics. *;
import io.anuke.mindustry.world.blocks.defense.turrets.*;

public class arcBlock extends PowerTurret {
	public arcBlock(String name){
		super(name);

            requirements(Category.turret, ItemStack.with(Items.copper, 70, Items.lead, 70));
            shootType = Bullets.arc;
            reload = 24f;
            shootCone = 40f;
            rotatespeed = 8f;
            powerUse = 0.9f;
            targetAir = false;
            range = 95f;
            shootEffect = Fx.lightningShoot;
            heatColor = Color.RED;
            recoil = 1f;
            size = 1;
            health = 260;
        
	}
}