package io.anuke.mindustry.entities.block.turrets;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.turrets.*;

public class swarmerBlock extends BurstTurret {
	public swarmerBlock(String name){
		super(name);

            requirements(Category.turret, ItemStack.with(Items.graphite, 70, Items.titanium, 70, Items.plastanium, 90, Items.silicon, 60));
            ammo(
                Items.blastCompound, Bullets.missileExplosive,
                Items.pyratite, Bullets.missileIncendiary,
                Items.surgealloy, Bullets.missileSurge
            );
            reload = 50f;
            shots = 4;
            burstSpacing = 5;
            inaccuracy = 10f;
            range = 140f;
            xRand = 6f;
            size = 2;
            health = 300 * size * size;
        
	}
}