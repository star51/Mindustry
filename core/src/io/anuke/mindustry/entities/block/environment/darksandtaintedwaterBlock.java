package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.graphics.*;
import io.anuke.mindustry.world.blocks.*;

public class darksandtaintedwaterBlock extends Floor {
	public darksandtaintedwaterBlock(String name){
		super(name);

            speedMultiplier = 0.75f;
            variants = 0;
            status = StatusEffects.wet;
            statusDuration = 60f;
            liquidDrop = Liquids.water;
            isLiquid = true;
            cacheLayer = CacheLayer.water;
        
	}
}