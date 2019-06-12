package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.meta.*;
import io.anuke.mindustry.world.blocks.*;

public class sporemossBlock extends Floor {
	public sporemossBlock(String name){
		super(name);

            variants = 3;
            attributes.set(Attribute.spores, 0.3f);
        
	}
}