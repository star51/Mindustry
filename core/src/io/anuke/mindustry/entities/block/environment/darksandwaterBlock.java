package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.graphics.*;
import io.anuke.mindustry.world.blocks.*;

public class darksandwaterBlock extends Floor {
	public darksandwaterBlock(String name){
		super(name);

            speedMultiplier = 0.8f;
            variants = 0;
            status = StatusEffects.wet;
            statusDuration = 50f;
            liquidDrop = Liquids.water;
            isLiquid = true;
            cacheLayer = CacheLayer.water;
        
	}
}