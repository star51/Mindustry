package io.anuke.mindustry.entities.block.environment;

import io.anuke.mindustry.content.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.graphics.*;
import io.anuke.mindustry.world.blocks.*;

public class taintedwaterBlock extends Floor {
	public taintedwaterBlock(String name){
		super(name);

            speedMultiplier = 0.17f;
            variants = 0;
            status = StatusEffects.wet;
            statusDuration = 140f;
            drownTime = 120f;
            liquidDrop = Liquids.water;
            isLiquid = true;
            cacheLayer = CacheLayer.water;
        
	}
}