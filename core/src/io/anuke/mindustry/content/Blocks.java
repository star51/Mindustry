package io.anuke.mindustry.content;

import io.anuke.arc.Core;
import io.anuke.arc.function.BooleanProvider;
import io.anuke.arc.graphics.Color;
import io.anuke.arc.graphics.g2d.*;
import io.anuke.arc.math.Mathf;
import io.anuke.mindustry.Vars;
import io.anuke.mindustry.entities.block.BlockFactory;
import io.anuke.mindustry.game.ContentList;
import io.anuke.mindustry.graphics.*;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.Tile;
import io.anuke.mindustry.world.blocks.*;
import io.anuke.mindustry.world.blocks.defense.*;
import io.anuke.mindustry.world.blocks.defense.turrets.*;
import io.anuke.mindustry.world.blocks.distribution.*;
import io.anuke.mindustry.world.blocks.power.*;
import io.anuke.mindustry.world.blocks.production.*;
import io.anuke.mindustry.world.blocks.sandbox.*;
import io.anuke.mindustry.world.blocks.storage.*;
import io.anuke.mindustry.world.blocks.units.*;
import io.anuke.mindustry.world.consumers.ConsumeLiquidFilter;
import io.anuke.mindustry.world.meta.Attribute;
import io.anuke.mindustry.world.modules.LiquidModule;

import static io.anuke.mindustry.Vars.state;
import static io.anuke.mindustry.Vars.world;

public class Blocks implements ContentList{
    public static Block

    //environment
    air, spawn, deepwater, water, taintedWater, tar, stone, craters, charr, sand, darksand, ice, snow, darksandTaintedWater,
    holostone, rocks, sporerocks, icerocks, cliffs, sporePine, pine, shrubs, whiteTree, whiteTreeDead, sporeCluster,
    iceSnow, sandWater, darksandWater, duneRocks, sandRocks, moss, sporeMoss, shale, shaleRocks, shaleBoulder, grass, salt,
    metalFloor, metalFloorDamaged, metalFloor2, metalFloor3, metalFloor5, ignarock, magmarock, hotrock, snowrocks, rock, snowrock, saltRocks,
    darkPanel1, darkPanel2, darkPanel3, darkPanel4, darkPanel5, darkPanel6, darkMetal,
    pebbles, tendrils,

    //ores
    oreCopper, oreLead, oreScrap, oreCoal, oreTitanium, oreThorium,

    //crafting
    siliconSmelter, kiln, graphitePress, plastaniumCompressor, multiPress, phaseWeaver, surgeSmelter, pyratiteMixer, blastMixer, cryofluidMixer,
    melter, separator, sporePress, pulverizer, incinerator, coalCentrifuge,

    //sandbox
    powerVoid, powerSource, itemSource, liquidSource, itemVoid,

    //defense
    scrapWall, scrapWallLarge, scrapWallHuge, scrapWallGigantic, thruster, //ok, these names are getting ridiculous, but at least I don't have humongous walls yet
    copperWall, copperWallLarge, titaniumWall, titaniumWallLarge, thoriumWall, thoriumWallLarge, door, doorLarge,
    phaseWall, phaseWallLarge, surgeWall, surgeWallLarge, mender, mendProjector, overdriveProjector, forceProjector, shockMine,

    //transport
    conveyor, titaniumConveyor, distributor, junction, itemBridge, phaseConveyor, sorter, router, overflowGate, massDriver,

    //liquids
    mechanicalPump, rotaryPump, thermalPump, conduit, pulseConduit, liquidRouter, liquidTank, liquidJunction, bridgeConduit, phaseConduit,

    //power
    combustionGenerator, thermalGenerator, turbineGenerator, differentialGenerator, rtgGenerator, solarPanel, largeSolarPanel, thoriumReactor,
    impactReactor, battery, batteryLarge, powerNode, powerNodeLarge, surgeTower,

    //production
    mechanicalDrill, pneumaticDrill, laserDrill, blastDrill, waterExtractor, oilExtractor, cultivator,

    //storage
    coreShard, coreFoundation, coreNucleus, vault, container, unloader, launchPad, launchPadLarge,

    //turrets
    duo, scatter, scorch, hail, arc, wave, lancer, swarmer, salvo, fuse, ripple, cyclone, spectre, meltdown,

    //units
    spiritFactory, phantomFactory, wraithFactory, ghoulFactory, revenantFactory, daggerFactory, crawlerFactory, titanFactory,
    fortressFactory, repairPoint,

    //upgrades
    dartPad, deltaPad, tauPad, omegaPad, javelinPad, tridentPad, glaivePad;

    @Override
    public void load(){
        //region environment

        air = BlockFactory.createBlock("air");

        //create special blockpart variants
        for(int dx = 0; dx < BlockPart.maxSize; dx++){
            for(int dy = 0; dy < BlockPart.maxSize; dy++){
                int fx = dx - BlockPart.maxSize/2, fy = dy - BlockPart.maxSize/2;
                if(fx != 0 || fy != 0){
                    new BlockPart(fx, fy);
                }
            }
        }

        spawn = BlockFactory.createBlock("spawn");

        //Registers build blocks
        //no reference is needed here since they can be looked up by name later
        for(int i = 1; i <= BuildBlock.maxSize; i++){
            new BuildBlock(i);
        }

        deepwater = BlockFactory.createBlock("deepwater");

        water = BlockFactory.createBlock("water");

        taintedWater = BlockFactory.createBlock("tainted-water");

        darksandTaintedWater = BlockFactory.createBlock("darksand-tainted-water");

        sandWater = BlockFactory.createBlock("sand-water");

        darksandWater = BlockFactory.createBlock("darksand-water");

        tar = BlockFactory.createBlock("tar");

        stone = BlockFactory.createBlock("stone");

        craters = BlockFactory.createBlock("craters");

        charr = BlockFactory.createBlock("char");

        ignarock = BlockFactory.createBlock("ignarock");

        hotrock = BlockFactory.createBlock("hotrock");

        magmarock = BlockFactory.createBlock("magmarock");

        sand = BlockFactory.createBlock("sand");

        darksand = BlockFactory.createBlock("darksand");

        holostone = BlockFactory.createBlock("holostone");

        grass = BlockFactory.createBlock("grass");

        salt = BlockFactory.createBlock("salt");

        snow = BlockFactory.createBlock("snow");

        ice = BlockFactory.createBlock("ice");

        iceSnow = BlockFactory.createBlock("ice-snow");

        cliffs = BlockFactory.createBlock("cliffs");

        rocks = BlockFactory.createBlock("rocks");

        sporerocks = BlockFactory.createBlock("sporerocks");

        rock = BlockFactory.createBlock("rock");

        snowrock = BlockFactory.createBlock("snowrock");

        icerocks = BlockFactory.createBlock("icerocks");

        snowrocks = BlockFactory.createBlock("snowrocks");

        duneRocks = BlockFactory.createBlock("dunerocks");

        sandRocks = BlockFactory.createBlock("sandrocks");

        saltRocks = BlockFactory.createBlock("saltrocks");

        sporePine = BlockFactory.createBlock("spore-pine");

        pine = BlockFactory.createBlock("pine");

        shrubs = BlockFactory.createBlock("shrubs");

        whiteTreeDead = BlockFactory.createBlock("white-tree-dead");

        whiteTree = BlockFactory.createBlock("white-tree");

        sporeCluster = BlockFactory.createBlock("spore-cluster");

        shale = BlockFactory.createBlock("shale");

        shaleRocks = BlockFactory.createBlock("shalerocks");

        shaleBoulder = BlockFactory.createBlock("shale-boulder");

        moss = BlockFactory.createBlock("moss");

        sporeMoss = BlockFactory.createBlock("spore-moss");

        metalFloor = BlockFactory.createBlock("metal-floor");

        metalFloorDamaged = BlockFactory.createBlock("metal-floor-damaged");

        metalFloor2 = BlockFactory.createBlock("metal-floor-2");

        metalFloor3 = BlockFactory.createBlock("metal-floor-3");

        metalFloor5 = BlockFactory.createBlock("metal-floor-5");

        darkPanel1 = BlockFactory.createBlock("dark-panel-1");
        darkPanel2 = BlockFactory.createBlock("dark-panel-2");
        darkPanel3 = BlockFactory.createBlock("dark-panel-3");
        darkPanel4 = BlockFactory.createBlock("dark-panel-4");
        darkPanel5 = BlockFactory.createBlock("dark-panel-5");
        darkPanel6 = BlockFactory.createBlock("dark-panel-6");

        darkMetal = BlockFactory.createBlock("dark-metal");

        oreScrap = new OreBlock(Items.scrap);
        oreCoal = new OreBlock(Items.coal);
        oreTitanium = new OreBlock(Items.titanium);
        oreThorium = new OreBlock(Items.thorium);

        //endregion
        //region crafting

        graphitePress = BlockFactory.createBlock("graphite-press");

        multiPress = BlockFactory.createBlock("multi-press");

        siliconSmelter = BlockFactory.createBlock("silicon-smelter");

        kiln = BlockFactory.createBlock("kiln");

        plastaniumCompressor = BlockFactory.createBlock("plastanium-compressor");

        phaseWeaver = BlockFactory.createBlock("phase-weaver");

        surgeSmelter = BlockFactory.createBlock("alloy-smelter");

        cryofluidMixer = BlockFactory.createBlock("cryofluidmixer");

        blastMixer = BlockFactory.createBlock("blast-mixer");

        pyratiteMixer = BlockFactory.createBlock("pyratite-mixer");

        melter = BlockFactory.createBlock("melter");

        separator = BlockFactory.createBlock("separator");

        sporePress = BlockFactory.createBlock("spore-press");

        pulverizer = BlockFactory.createBlock("pulverizer");

        coalCentrifuge = BlockFactory.createBlock("coal-centrifuge");

        incinerator = BlockFactory.createBlock("incinerator");

        //endregion
        //region sandbox

        powerVoid = BlockFactory.createBlock("power-void");
        powerSource = BlockFactory.createBlock("power-source");
        itemSource = BlockFactory.createBlock("item-source");
        itemVoid = BlockFactory.createBlock("item-void");
        liquidSource = BlockFactory.createBlock("liquid-source");

        //endregion
        //region defense

        scrapWall = BlockFactory.createBlock("scrap-wall");

        scrapWallLarge = BlockFactory.createBlock("scrap-wall-large");

        scrapWallHuge = BlockFactory.createBlock("scrap-wall-huge");

        scrapWallGigantic = BlockFactory.createBlock("scrap-wall-gigantic");

        thruster = BlockFactory.createBlock("thruster");

        copperWall = BlockFactory.createBlock("copper-wall");

        copperWallLarge = BlockFactory.createBlock("copper-wall-large");

        titaniumWall = BlockFactory.createBlock("titanium-wall");

        titaniumWallLarge = BlockFactory.createBlock("titanium-wall-large");

        thoriumWall = BlockFactory.createBlock("thorium-wall");

        thoriumWallLarge = BlockFactory.createBlock("thorium-wall-large");

        phaseWall = BlockFactory.createBlock("phase-wall");

        phaseWallLarge = BlockFactory.createBlock("phase-wall-large");

        surgeWall = BlockFactory.createBlock("surge-wall");

        surgeWallLarge = BlockFactory.createBlock("surge-wall-large");

        door = BlockFactory.createBlock("door");

        doorLarge = BlockFactory.createBlock("door-large");

        mender = BlockFactory.createBlock("mender");

        mendProjector = BlockFactory.createBlock("mend-projector");

        overdriveProjector = BlockFactory.createBlock("overdrive-projector");

        forceProjector = BlockFactory.createBlock("force-projector");

        shockMine = BlockFactory.createBlock("shock-mine");

        //endregion
        //region distribution

        conveyor = BlockFactory.createBlock("conveyor");

        titaniumConveyor = BlockFactory.createBlock("titanium-conveyor");

        junction = BlockFactory.createBlock("junction");

        itemBridge = BlockFactory.createBlock("bridge-conveyor");

        phaseConveyor = BlockFactory.createBlock("phase-conveyor");

        sorter = BlockFactory.createBlock("sorter");

        router = BlockFactory.createBlock("router");

        distributor = BlockFactory.createBlock("distributor");

        overflowGate = BlockFactory.createBlock("overflow-gate");

        massDriver = BlockFactory.createBlock("mass-driver");

        //endregion
        //region liquid

        mechanicalPump = BlockFactory.createBlock("mechanical-pump");

        rotaryPump = BlockFactory.createBlock("rotary-pump");

        thermalPump = BlockFactory.createBlock("thermal-pump");

        conduit = BlockFactory.createBlock("conduit");

        pulseConduit = BlockFactory.createBlock("pulse-conduit");

        liquidRouter = BlockFactory.createBlock("liquid-router");

        liquidTank = BlockFactory.createBlock("liquid-tank");

        liquidJunction = BlockFactory.createBlock("liquid-junction");

        bridgeConduit = BlockFactory.createBlock("bridge-conduit");

        phaseConduit = BlockFactory.createBlock("phase-conduit");

        //endregion
        //region power

        powerNode = BlockFactory.createBlock("power-node");

        powerNodeLarge = BlockFactory.createBlock("power-node-large");

        surgeTower = BlockFactory.createBlock("surge-tower");

        battery = BlockFactory.createBlock("battery");

        batteryLarge = BlockFactory.createBlock("battery-large");

        combustionGenerator = BlockFactory.createBlock("combustion-generator");

        thermalGenerator = BlockFactory.createBlock("thermal-generator");

        turbineGenerator = BlockFactory.createBlock("turbine-generator");

        differentialGenerator = BlockFactory.createBlock("differential-generator");

        rtgGenerator = BlockFactory.createBlock("rtg-generator");

        solarPanel = BlockFactory.createBlock("solar-panel");

        largeSolarPanel = BlockFactory.createBlock("solar-panel-large");

        thoriumReactor = BlockFactory.createBlock("thorium-reactor");

        impactReactor = BlockFactory.createBlock("impact-reactor");

        //endregion power
        //region production

        mechanicalDrill = BlockFactory.createBlock("mechanical-drill");

        pneumaticDrill = BlockFactory.createBlock("pneumatic-drill");

        laserDrill = BlockFactory.createBlock("laser-drill");

        blastDrill = BlockFactory.createBlock("blast-drill");

        waterExtractor = BlockFactory.createBlock("water-extractor");

        cultivator = BlockFactory.createBlock("cultivator");

        oilExtractor = BlockFactory.createBlock("oil-extractor");

        //endregion
        //region storage

        coreShard = BlockFactory.createBlock("core-shard");

        coreFoundation = BlockFactory.createBlock("core-foundation");

        coreNucleus = BlockFactory.createBlock("core-nucleus");

        vault = BlockFactory.createBlock("vault");

        container = BlockFactory.createBlock("container");

        unloader = BlockFactory.createBlock("unloader");

        launchPad = BlockFactory.createBlock("launch-pad");

        launchPadLarge = BlockFactory.createBlock("launch-pad-large");

        //endregion
        //region turrets

        duo = BlockFactory.createBlock("duo");

        scatter = BlockFactory.createBlock("scatter");

        scorch = BlockFactory.createBlock("scorch");

        hail = BlockFactory.createBlock("hail");

        wave = BlockFactory.createBlock("wave");

        lancer = BlockFactory.createBlock("lancer");

        arc = BlockFactory.createBlock("arc");

        swarmer = BlockFactory.createBlock("swarmer");

        salvo = BlockFactory.createBlock("salvo");

        ripple = BlockFactory.createBlock("ripple");

        cyclone = BlockFactory.createBlock("cyclone");

        fuse = BlockFactory.createBlock("fuse");

        spectre = BlockFactory.createBlock("spectre");

        meltdown = BlockFactory.createBlock("meltdown");

        //endregion
        //region units

        spiritFactory = BlockFactory.createBlock("spirit-factory");

        phantomFactory = BlockFactory.createBlock("phantom-factory");

        wraithFactory = BlockFactory.createBlock("wraith-factory");

        ghoulFactory = BlockFactory.createBlock("ghoul-factory");

        revenantFactory = BlockFactory.createBlock("revenant-factory");

        daggerFactory = BlockFactory.createBlock("dagger-factory");

        crawlerFactory = BlockFactory.createBlock("crawler-factory");

        titanFactory = BlockFactory.createBlock("titan-factory");

        fortressFactory = BlockFactory.createBlock("fortress-factory");

        repairPoint = BlockFactory.createBlock("repair-point");

        //endregion
        //region upgrades

        dartPad = BlockFactory.createBlock("dart-mech-pad");

        deltaPad = BlockFactory.createBlock("delta-mech-pad");

        tauPad = BlockFactory.createBlock("tau-mech-pad");

        omegaPad = BlockFactory.createBlock("omega-mech-pad");

        javelinPad = BlockFactory.createBlock("javelin-ship-pad");

        tridentPad = BlockFactory.createBlock("trident-ship-pad");

        glaivePad = BlockFactory.createBlock("glaive-ship-pad");

        //endregion
    }
}
