package io.anuke.mindustry.entities.block.ore;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.production.*;

public class separatorBlock extends Separator {
	public separatorBlock(String name){
		super(name);

            requirements(Category.crafting, ItemStack.with(Items.copper, 60, Items.titanium, 50));
            results = ItemStack.with(
                Items.copper, 5,
                Items.lead, 3,
                Items.graphite, 2,
                Items.titanium, 2
            );
            hasPower = true;
            craftTime = 35f;
            spinnerLength = 1.5f;
            spinnerRadius = 3.5f;
            spinnerThickness = 1.5f;
            spinnerSpeed = 3f;
            size = 2;

            consumes.power(1f);
            consumes.liquid(Liquids.slag, 0.07f);
        
	}
}