package io.anuke.mindustry.entities.block;

import io.anuke.mindustry.entities.block.environment.*;
import io.anuke.mindustry.entities.block.defense.*;
import io.anuke.mindustry.entities.block.distribution.*;
import io.anuke.mindustry.entities.block.liquid.*;
import io.anuke.mindustry.entities.block.ore.*;
import io.anuke.mindustry.entities.block.power.*;
import io.anuke.mindustry.entities.block.production.*;
import io.anuke.mindustry.entities.block.sandbox.*;
import io.anuke.mindustry.entities.block.storage.*;
import io.anuke.mindustry.entities.block.turrets.*;
import io.anuke.mindustry.entities.block.units.*;
import io.anuke.mindustry.entities.block.upgrades.*;

import io.anuke.mindustry.world.Block;

public class BlockFactory {
    static int wallHealthMultiplier = 4;

    public static Block createBlock(String name) {
        return createBlock(name, null);
    }

    public static Block createBlock(String name, Block paramBlock) {
        Block block = null;

        switch(name) {
            case "air":
                block = new airBlock(name);
            case "spawn":
                block = new spawnBlock(name);
            case "deepwater":
                block = new deepwaterBlock(name);
            case "water":
                block = new waterBlock(name);
            case "tainted-water":
                block = new taintedwaterBlock(name);
            case "darksand-tainted-water":
                block = new darksandtaintedwaterBlock(name);
            case "sand-water":
                block = new sandwaterBlock(name);
            case "darksand-water":
                block = new darksandwaterBlock(name);
            case "tar":
                block = new tarBlock(name);
            case "stone":
                block = new stoneBlock(name);
            case "craters":
                block = new cratersBlock(name, paramBlock);
            case "char":
                block = new charBlock(name, paramBlock);
            case "ignarock":
                block = new ignarockBlock(name);
            case "hotrock":
                block = new hotrockBlock(name, paramBlock);
            case "magmarock":
                block = new magmarockBlock(name, paramBlock);
            case "sand":
                block = new sandBlock(name);
            case "darksand":
                block = new darksandBlock(name);
            case "holostone":
                block = new holostoneBlock(name);
            case "grass":
                block = new grassBlock(name);
            case "salt":
                block = new saltBlock(name);
            case "snow":
                block = new snowBlock(name);
            case "ice":
                block = new iceBlock(name);
            case "ice-snow":
                block = new icesnowBlock(name);
            case "cliffs":
                block = new cliffsBlock(name);
            case "rocks":
                block = new rocksBlock(name);
            case "sporerocks":
                block = new sporerocksBlock(name);
            case "rock":
                block = new rockBlock(name);
            case "snowrock":
                block = new snowrockBlock(name);
            case "icerocks":
                block = new icerocksBlock(name);
            case "snowrocks":
                block = new snowrocksBlock(name);
            case "dunerocks":
                block = new dunerocksBlock(name);
            case "sandrocks":
                block = new sandrocksBlock(name);
            case "saltrocks":
                block = new saltrocksBlock(name);
            case "spore-pine":
                block = new sporepineBlock(name);
            case "pine":
                block = new pineBlock(name);
            case "shrubs":
                block = new shrubsBlock(name);
            case "white-tree-dead":
                block = new whitetreedeadBlock(name);
            case "white-tree":
                block = new whitetreeBlock(name);
            case "spore-cluster":
                block = new sporeclusterBlock(name);
            case "shale":
                block = new shaleBlock(name);
            case "shalerocks":
                block = new shalerocksBlock(name);
            case "shale-boulder":
                block = new shaleboulderBlock(name);
            case "moss":
                block = new mossBlock(name);
            case "spore-moss":
                block = new sporemossBlock(name);
            case "metal-floor":
                block = new metalfloorBlock(name);
            case "metal-floor-damaged":
                block = new metalfloordamagedBlock(name);
            case "metal-floor-2":
                block = new metalfloor2Block(name);
            case "metal-floor-3":
                block = new metalfloor3Block(name);
            case "metal-floor-5":
                block = new metalfloor5Block(name);
            case "dark-panel-1":
                block = new darkpanel1Block(name);
            case "dark-panel-2":
                block = new darkpanel2Block(name);
            case "dark-panel-3":
                block = new darkpanel3Block(name);
            case "dark-panel-4":
                block = new darkpanel4Block(name);
            case "dark-panel-5":
                block = new darkpanel5Block(name);
            case "dark-panel-6":
                block = new darkpanel6Block(name);
            case "dark-metal":
                block = new darkmetalBlock(name);
            case "pebbles":
                block = new pebblesBlock(name);
            case "tendrils":
                block = new tendrilsBlock(name);
            case "graphite-press":
                block = new graphitepressBlock(name);
            case "multi-press":
                block = new multipressBlock(name);
            case "silicon-smelter":
                block = new siliconsmelterBlock(name);
            case "kiln":
                block = new kilnBlock(name);
            case "plastanium-compressor":
                block = new plastaniumcompressorBlock(name);
            case "phase-weaver":
                block = new phaseweaverBlock(name);
            case "alloy-smelter":
                block = new alloysmelterBlock(name);
            case "cryofluidmixer":
                block = new cryofluidmixerBlock(name);
            case "blast-mixer":
                block = new blastmixerBlock(name);
            case "pyratite-mixer":
                block = new pyratitemixerBlock(name);
            case "melter":
                block = new melterBlock(name);
            case "separator":
                block = new separatorBlock(name);
            case "spore-press":
                block = new sporepressBlock(name);
            case "pulverizer":
                block = new pulverizerBlock(name);
            case "coal-centrifuge":
                block = new coalcentrifugeBlock(name);
            case "incinerator":
                block = new incineratorBlock(name);
            case "power-source":
                block = new powersourceBlock(name);
            case "item-source":
                block = new itemsourceBlock(name);
            case "item-void":
                block = new itemvoidBlock(name);
            case "liquid-source":
                block = new liquidsourceBlock(name);
            case "scrap-wall-large":
                block = new scrapwalllargeBlock(name, wallHealthMultiplier);
            case "scrap-wall-huge":
                block = new scrapwallhugeBlock(name, wallHealthMultiplier);
            case "scrap-wall-gigantic":
                block = new scrapwallgiganticBlock(name, wallHealthMultiplier);
            case "thruster":
                block = new thrusterBlock(name, wallHealthMultiplier);
            case "copper-wall":
                block = new copperwallBlock(name, wallHealthMultiplier);
            case "copper-wall-large":
                block = new copperwalllargeBlock(name, wallHealthMultiplier);
            case "titanium-wall":
                block = new titaniumwallBlock(name, wallHealthMultiplier);
            case "titanium-wall-large":
                block = new titaniumwalllargeBlock(name, wallHealthMultiplier);
            case "thorium-wall":
                block = new thoriumwallBlock(name, wallHealthMultiplier);
            case "thorium-wall-large":
                block = new thoriumwalllargeBlock(name, wallHealthMultiplier);
            case "phase-wall":
                block = new phasewallBlock(name, wallHealthMultiplier);
            case "phase-wall-large":
                block = new phasewalllargeBlock(name, wallHealthMultiplier);
            case "surge-wall":
                block = new surgewallBlock(name, wallHealthMultiplier);
            case "surge-wall-large":
                block = new surgewalllargeBlock(name, wallHealthMultiplier);
            case "door":
                block = new doorBlock(name, wallHealthMultiplier);
            case "door-large":
                block = new doorlargeBlock(name, wallHealthMultiplier);
            case "mender":
                block = new menderBlock(name);
            case "mend-projector":
                block = new mendprojectorBlock(name);
            case "overdrive-projector":
                block = new overdriveprojectorBlock(name);
            case "force-projector":
                block = new forceprojectorBlock(name);
            case "shock-mine":
                block = new shockmineBlock(name);
            case "titanium-conveyor":
                block = new titaniumconveyorBlock(name);
            case "junction":
                block = new junctionBlock(name);
            case "bridge-conveyor":
                block = new bridgeconveyorBlock(name);
            case "phase-conveyor":
                block = new phaseconveyorBlock(name);
            case "sorter":
                block = new sorterBlock(name);
            case "router":
                block = new routerBlock(name);
            case "distributor":
                block = new distributorBlock(name);
            case "overflow-gate":
                block = new overflowgateBlock(name);
            case "mass-driver":
                block = new massdriverBlock(name);
            case "rotary-pump":
                block = new rotarypumpBlock(name);
            case "thermal-pump":
                block = new thermalpumpBlock(name);
            case "conduit":
                block = new conduitBlock(name);
            case "pulse-conduit":
                block = new pulseconduitBlock(name);
            case "liquid-router":
                block = new liquidrouterBlock(name);
            case "liquid-tank":
                block = new liquidtankBlock(name);
            case "liquid-junction":
                block = new liquidjunctionBlock(name);
            case "bridge-conduit":
                block = new bridgeconduitBlock(name);
            case "phase-conduit":
                block = new phaseconduitBlock(name);
            case "power-node-large":
                block = new powernodelargeBlock(name);
            case "surge-tower":
                block = new surgetowerBlock(name);
            case "battery":
                block = new batteryBlock(name);
            case "battery-large":
                block = new batterylargeBlock(name);
            case "combustion-generator":
                block = new combustiongeneratorBlock(name);
            case "thermal-generator":
                block = new thermalgeneratorBlock(name);
            case "turbine-generator":
                block = new turbinegeneratorBlock(name);
            case "differential-generator":
                block = new differentialgeneratorBlock(name);
            case "rtg-generator":
                block = new rtggeneratorBlock(name);
            case "solar-panel":
                block = new solarpanelBlock(name);
            case "solar-panel-large":
                block = new solarpanellargeBlock(name);
            case "thorium-reactor":
                block = new thoriumreactorBlock(name);
            case "impact-reactor":
                block = new impactreactorBlock(name);
            case "pneumatic-drill":
                block = new pneumaticdrillBlock(name);
            case "laser-drill":
                block = new laserdrillBlock(name);
            case "blast-drill":
                block = new blastdrillBlock(name);
            case "water-extractor":
                block = new waterextractorBlock(name);
            case "cultivator":
                block = new cultivatorBlock(name);
            case "oil-extractor":
                block = new oilextractorBlock(name);
            case "core-foundation":
                block = new corefoundationBlock(name);
            case "core-nucleus":
                block = new corenucleusBlock(name);
            case "vault":
                block = new vaultBlock(name);
            case "container":
                block = new containerBlock(name);
            case "unloader":
                block = new unloaderBlock(name);
            case "launch-pad":
                block = new launchpadBlock(name);
            case "launch-pad-large":
                block = new launchpadlargeBlock(name);
            case "scatter":
                block = new scatterBlock(name);
            case "scorch":
                block = new scorchBlock(name);
            case "hail":
                block = new hailBlock(name);
            case "wave":
                block = new waveBlock(name);
            case "lancer":
                block = new lancerBlock(name);
            case "arc":
                block = new arcBlock(name);
            case "swarmer":
                block = new swarmerBlock(name);
            case "salvo":
                block = new salvoBlock(name);
            case "ripple":
                block = new rippleBlock(name);
            case "cyclone":
                block = new cycloneBlock(name);
            case "fuse":
                block = new fuseBlock(name);
            case "spectre":
                block = new spectreBlock(name);
            case "meltdown":
                block = new meltdownBlock(name);
            case "phantom-factory":
                block = new phantomfactoryBlock(name);
            case "wraith-factory":
                block = new wraithfactoryBlock(name);
            case "ghoul-factory":
                block = new ghoulfactoryBlock(name);
            case "revenant-factory":
                block = new revenantfactoryBlock(name);
            case "dagger-factory":
                block = new daggerfactoryBlock(name);
            case "crawler-factory":
                block = new crawlerfactoryBlock(name);
            case "titan-factory":
                block = new titanfactoryBlock(name);
            case "fortress-factory":
                block = new fortressfactoryBlock(name);
            case "repair-point":
                block = new repairpointBlock(name);
            case "delta-mech-pad":
                block = new deltamechpadBlock(name);
            case "tau-mech-pad":
                block = new taumechpadBlock(name);
            case "omega-mech-pad":
                block = new omegamechpadBlock(name);
            case "javelin-ship-pad":
                block = new javelinshippadBlock(name);
            case "trident-ship-pad":
                block = new tridentshippadBlock(name);
            case "glaive-ship-pad":
                block = new glaiveshippadBlock(name);
        }

        return block;
    }
}
