package io.anuke.mindustry.entities.block.turrets;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.turrets.*;

public class scorchBlock extends ItemTurret {
	public scorchBlock(String name){
		super(name);

            requirements(Category.turret, ItemStack.with(Items.copper, 50, Items.graphite, 45));
            ammo(
                Items.coal, Bullets.basicFlame,
                Items.pyratite, Bullets.pyraFlame
            );
            recoil = 0f;
            reload = 4f;
            range = 60f;
            shootCone = 50f;
            targetAir = false;
            ammoUseEffect = Fx.none;
            health = 400;
        
	}
}