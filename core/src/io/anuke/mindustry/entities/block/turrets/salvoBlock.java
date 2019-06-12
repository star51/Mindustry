package io.anuke.mindustry.entities.block.turrets;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.turrets.*;

public class salvoBlock extends BurstTurret {
	public salvoBlock(String name){
		super(name);

            requirements(Category.turret, ItemStack.with(Items.copper, 210, Items.graphite, 190, Items.titanium, 120));
            ammo(
                Items.copper, Bullets.standardCopper,
                Items.graphite, Bullets.standardDense,
                Items.pyratite, Bullets.standardIncendiary,
                Items.silicon, Bullets.standardHoming,
                Items.thorium, Bullets.standardThorium
            );

            size = 2;
            range = 120f;
            reload = 35f;
            restitution = 0.03f;
            ammoEjectBack = 3f;
            cooldown = 0.03f;
            recoil = 3f;
            shootShake = 2f;
            burstSpacing = 4;
            shots = 3;
            ammoUseEffect = Fx.shellEjectBig;
            health = 360;
        
	}
}