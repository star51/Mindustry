package io.anuke.mindustry.entities.block.turrets;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.consumers.*;
import io.anuke.mindustry.world.blocks.defense.turrets.*;

public class meltdownBlock extends LaserTurret {
	public meltdownBlock(String name){
		super(name);

            requirements(Category.turret, ItemStack.with(Items.copper, 500, Items.lead, 700, Items.graphite, 600, Items.surgealloy, 650, Items.silicon, 650));
            shootType = Bullets.meltdownLaser;
            shootEffect = Fx.shootBigSmoke2;
            shootCone = 40f;
            recoil = 4f;
            size = 4;
            shootShake = 2f;
            range = 190f;
            reload = 50f;
            firingMoveFract = 0.5f;
            shootDuration = 220f;
            powerUse = 14f;

            health = 200 * size * size;
            consumes.add(new ConsumeLiquidFilter(liquid -> liquid.temperature <= 0.5f && liquid.flammability < 0.1f, 0.5f)).update(false);
        
	}
}