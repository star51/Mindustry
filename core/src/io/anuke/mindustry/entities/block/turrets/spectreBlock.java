package io.anuke.mindustry.entities.block.turrets;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.consumers.*;
import io.anuke.mindustry.world.blocks.defense.turrets.*;

public class spectreBlock extends DoubleTurret {
	public spectreBlock(String name){
		super(name);

            requirements(Category.turret, ItemStack.with(Items.copper, 700, Items.graphite, 600, Items.surgealloy, 500, Items.plastanium, 350, Items.thorium, 500));
            ammo(
                Items.graphite, Bullets.standardDenseBig,
                Items.pyratite, Bullets.standardIncendiaryBig,
                Items.thorium, Bullets.standardThoriumBig
            );
            reload = 6f;
            coolantMultiplier = 0.5f;
            restitution = 0.1f;
            ammoUseEffect = Fx.shellEjectBig;
            range = 200f;
            inaccuracy = 3f;
            recoil = 3f;
            xRand = 3f;
            shotWidth = 4f;
            shootShake = 2f;
            shots = 2;
            size = 4;
            shootCone = 24f;

            health = 155 * size * size;
            consumes.add(new ConsumeLiquidFilter(liquid -> liquid.temperature <= 0.5f && liquid.flammability < 0.1f, 2f)).update(false).optional(true, false);
        
	}
}