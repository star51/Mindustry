package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.meta.*;
import io.anuke.mindustry.world.blocks.*;

public class icesnowBlock extends Floor {
	public icesnowBlock(String name){
		super(name);

            variants = 3;
            attributes.set(Attribute.water, 0.3f);
        
	}
}