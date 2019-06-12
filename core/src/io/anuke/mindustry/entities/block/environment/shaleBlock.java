package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.meta.*;
import io.anuke.mindustry.world.blocks.*;

public class shaleBlock extends Floor {
	public shaleBlock(String name){
		super(name);

            variants = 3;
            attributes.set(Attribute.oil, 0.15f);
        
	}
}