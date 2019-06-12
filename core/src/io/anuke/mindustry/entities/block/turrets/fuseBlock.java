package io.anuke.mindustry.entities.block.turrets;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.turrets.*;

public class fuseBlock extends ItemTurret {
	public fuseBlock(String name){
		super(name);

            requirements(Category.turret, ItemStack.with(Items.copper, 450, Items.graphite, 450, Items.surgealloy, 250));
            ammo(Items.graphite, Bullets.fuseShot);
            reload = 40f;
            shootShake = 4f;
            range = 110f;
            recoil = 5f;
            restitution = 0.1f;
            size = 3;

            health = 165 * size * size;
        
	}
}