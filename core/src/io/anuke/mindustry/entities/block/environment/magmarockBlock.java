package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.*;
import io.anuke.mindustry.world.meta.*;
import io.anuke.mindustry.world.blocks.*;

public class magmarockBlock extends Floor {
	public magmarockBlock(String name, Block ignarock){
		super(name);

            attributes.set(Attribute.heat, 0.75f);
            updateEffect = Fx.magmasmoke;
            blendGroup = ignarock;
        
	}
}