package io.anuke.mindustry.content.Items;

import io.anuke.mindustry.content.Items.ItemList.*;
import io.anuke.mindustry.type.Item;

public class CreateItemFactory extends ItemFactory {

    @Override
    public Item createItem(String name) {
        switch(name) {
            case "copper" : return Copper.createCopper();
            case "lead" : return Lead.createLead();
            case "metaglass" : return Metaglass.createMetaglass();
            case "graphite" : return Graphite.createGraphite();
            case "sand" : return Sand.createSand();
            case "coal" : return Coal.createCoal();
            case "titanium" : return Titanium.createTitanium();
            case "thorium" : return Thorium.createThorium();
            case "scrap" : return Scrap.createScrap();
            case "silicon" : return Silicon.createSilicon();
            case "plastanium" : return Plastanium.createPlastanium();
            case "phase-fabric" : return Phasefabric.createPhasefabric();
            case "surge-alloy" : return Surgealloy.createSurgealloy();
            case "spore-pod" : return SporePod.createSporePod();
            case "blast-compound" : return BlastCompound.createBlastCompound();
            case "pyratite" : return Pyratite.createPyratite();
        }
        return null;
    }
}
