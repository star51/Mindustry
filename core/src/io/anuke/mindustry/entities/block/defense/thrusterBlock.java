package io.anuke.mindustry.entities.block.defense;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.blocks.defense.*;

public class thrusterBlock extends Wall {
	public thrusterBlock(String name, int wallHealthMultiplier){
		super(name);

            health = 55 * 16 * wallHealthMultiplier;
            size = 4;
        
	}
}