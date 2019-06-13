package io.anuke.mindustry.content.Items;

import io.anuke.mindustry.game.ContentList;
import io.anuke.mindustry.type.Item;

public class Items implements ContentList {
    public static Item scrap, copper, lead, graphite, coal, titanium, thorium, silicon, plastanium, phasefabric, surgealloy,
    sporePod, sand, blastCompound, pyratite, metaglass;

    CreateItemFactory itemCreateFactory = new CreateItemFactory();

    @Override
    public void load(){
        copper = itemCreateFactory.createItem("copper");
        lead = itemCreateFactory.createItem("lead");
        metaglass = itemCreateFactory.createItem("metaglass");
        graphite = itemCreateFactory.createItem("graphite");
        sand = itemCreateFactory.createItem("sand");
        coal = itemCreateFactory.createItem("coal");
        titanium = itemCreateFactory.createItem("titanium");
        thorium = itemCreateFactory.createItem("thorium");
        scrap = itemCreateFactory.createItem("scrap");
        silicon = itemCreateFactory.createItem("silicon");
        plastanium = itemCreateFactory.createItem("plastanium");
        phasefabric = itemCreateFactory.createItem("phase-fabric");
        surgealloy = itemCreateFactory.createItem("surge-alloy");
        sporePod = itemCreateFactory.createItem("spore-pod");
        blastCompound = itemCreateFactory.createItem("blast-compound");
        pyratite = itemCreateFactory.createItem("pyratite");
    }
}
