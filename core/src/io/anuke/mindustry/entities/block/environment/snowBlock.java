package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.meta.*;
import io.anuke.mindustry.world.blocks.*;

public class snowBlock extends Floor {
	public snowBlock(String name){
		super(name);

            attributes.set(Attribute.water, 0.2f);
        
	}
}