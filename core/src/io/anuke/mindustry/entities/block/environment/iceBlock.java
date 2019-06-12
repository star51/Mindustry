package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.meta.*;
import io.anuke.mindustry.world.blocks.*;

public class iceBlock extends Floor {
	public iceBlock(String name){
		super(name);

            //TODO fix drag/speed
            dragMultiplier = 1f;
            speedMultiplier = 1f;
            attributes.set(Attribute.water, 0.4f);
        
	}
}