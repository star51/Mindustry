package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.*;
import io.anuke.mindustry.world.blocks.*;

public class charBlock extends Floor {
	public charBlock(String name, Block stone){
		super(name);

            blendGroup = stone;
        
	}
}