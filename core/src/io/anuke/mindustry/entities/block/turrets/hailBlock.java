package io.anuke.mindustry.entities.block.turrets;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.turrets.*;

public class hailBlock extends ArtilleryTurret {
	public hailBlock(String name){
		super(name);

            requirements(Category.turret, ItemStack.with(Items.copper, 80, Items.graphite, 35));
            ammo(
                Items.graphite, Bullets.artilleryDense,
                Items.silicon, Bullets.artilleryHoming,
                Items.pyratite, Bullets.artlleryIncendiary
            );
            reload = 60f;
            recoil = 2f;
            range = 230f;
            inaccuracy = 1f;
            shootCone = 10f;
            health = 260;
        
	}
}