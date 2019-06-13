package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class shockmineBlock extends ShockMine {
	public shockmineBlock(String name){
		super(name);

            requirements(Category.effect, ItemStack.with(Items.lead, 50, Items.silicon, 25));
            hasShadow = false;
            health = 40;
            damage = 11;
            tileDamage = 7f;
            length = 10;
            tendrils = 5;
        
	}
}