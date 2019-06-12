package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.*;
import io.anuke.mindustry.world.blocks.*;

public class cratersBlock extends Floor {
	public cratersBlock(String name, Block stone){
		super(name);

            variants = 3;
            blendGroup = stone;
        
	}
}