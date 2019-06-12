package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.*;
import io.anuke.mindustry.world.meta.*;
import io.anuke.mindustry.world.blocks.*;

public class hotrockBlock extends Floor {
	public hotrockBlock(String name, Block ignarock){
		super(name);

            attributes.set(Attribute.heat, 0.5f);
            blendGroup = ignarock;
        
	}
}