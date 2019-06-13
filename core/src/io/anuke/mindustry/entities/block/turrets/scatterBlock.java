package io.anuke.mindustry.entities.block.turrets;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.turrets.*;

public class scatterBlock extends BurstTurret {
	public scatterBlock(String name){
		super(name);

            requirements(Category.turret, ItemStack.with(Items.copper, 170, Items.lead, 90));
            ammo(
                Items.scrap, Bullets.flakScrap,
                Items.lead, Bullets.flakLead
            );
            reload = 16f;
            range = 175f;
            size = 2;
            burstSpacing = 5f;
            shots = 2;
            targetGround = false;

            recoil = 2f;
            rotatespeed = 15f;
            inaccuracy = 17f;
            shootCone = 35f;

            health = 260 * size * size;
        
	}
}