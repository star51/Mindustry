package io.anuke.mindustry.entities.block.turrets;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.turrets.*;

public class cycloneBlock extends ItemTurret {
	public cycloneBlock(String name){
		super(name);

            requirements(Category.turret, ItemStack.with(Items.copper, 400, Items.titanium, 250, Items.plastanium, 160));
            ammo(
                Items.blastCompound, Bullets.flakExplosive,
                Items.plastanium, Bullets.flakPlastic,
                Items.surgealloy, Bullets.flakSurge
            );
            xRand = 4f;
            reload = 6f;
            range = 200f;
            size = 3;
            recoil = 3f;
            rotatespeed = 10f;
            inaccuracy = 10f;
            shootCone = 30f;

            health = 145 * size * size;
        
	}
}