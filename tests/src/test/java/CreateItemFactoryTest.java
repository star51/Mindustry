import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.content.Items.CreateItemFactory;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreateItemFactoryTest {
    public static Item scrap, copper, lead, graphite, coal, titanium, thorium, silicon, plastanium, phasefabric, surgealloy,
            sporePod, sand, blastCompound, pyratite, metaglass;

    public static Item testScrap, testCopper, testLead, testGraphite, testCoal, testTitanium, testThorium, testSilicon, testPlastanium,
            testPhasefabric, testSurgealloy, testSporePod, testSand, testBlastCompound, testPyratite, testMetaglass;

    CreateItemFactory itemFactory = new CreateItemFactory();

    @Test
    public void testCopper() {
        copper = new Item("copper", Color.valueOf("d99d73")){{
            type = ItemType.material;
            hardness = 1;
            cost = 0.5f;
            alwaysUnlocked = true;
        }};
        testCopper = itemFactory.createItem("copper");

        assertEquals(testCopper,copper);
    }

    @Test
    public void testLead() {
        lead = new Item("lead", Color.valueOf("8c7fa9")){{
            type = ItemType.material;
            hardness = 1;
            cost = 0.7f;
        }};

        testLead = itemFactory.createItem("lead");

        assertEquals(testLead,lead);
    }

    @Test
    public void testMetaglass() {
        metaglass = new Item("metaglass", Color.valueOf("ebeef5")){{
            type = ItemType.material;
            cost = 1.5f;
        }};
        testMetaglass = itemFactory.createItem("metaglass");

        assertEquals(testMetaglass,metaglass);
    }

    @Test
    public void testGraphite() {
        graphite = new Item("graphite", Color.valueOf("b2c6d2")){{
            type = ItemType.material;
            cost = 1f;
        }};
        testGraphite = itemFactory.createItem("graphite");

        assertEquals(testGraphite,graphite);
    }

    @Test
    public void testSand() {
        sand = new Item("sand", Color.valueOf("f7cba4")){{

        }};
        testSand = itemFactory.createItem("sand");

        assertEquals(testSand,sand);
    }

    @Test
    public void testCoal() {
        coal = new Item("coal", Color.valueOf("272727")){{
            explosiveness = 0.4f;
            flammability = 1f;
            hardness = 2;
        }};
        testCoal = itemFactory.createItem("coal");

        assertEquals(testCoal,coal);
    }

    @Test
    public void testTitanium() {
        titanium = new Item("titanium", Color.valueOf("8da1e3")){{
            type = ItemType.material;
            hardness = 3;
            cost = 1f;
        }};
        testTitanium = itemFactory.createItem("titanium");

        assertEquals(testTitanium,titanium);
    }

    @Test
    public void testThorium() {
        thorium = new Item("thorium", Color.valueOf("f9a3c7")){{
            type = ItemType.material;
            explosiveness = 0.2f;
            hardness = 4;
            radioactivity = 1f;
            cost = 1.1f;
        }};
        testThorium = itemFactory.createItem("thorium");

        assertEquals(testThorium,thorium);
    }

    @Test
    public void testScrap() {
        scrap = new Item("scrap", Color.valueOf("777777")){{

        }};
        testScrap= itemFactory.createItem("scrap");

        assertEquals(testScrap,scrap);
    }

    @Test
    public void testSilicon() {
        silicon = new Item("silicon", Color.valueOf("53565c")){{
            type = ItemType.material;
            cost = 0.8f;
        }};
        testSilicon = itemFactory.createItem("silicon");

        assertEquals(testSilicon,silicon);
    }

    @Test
    public void testPlastanium() {
        plastanium = new Item("plastanium", Color.valueOf("cbd97f")){{
            type = ItemType.material;
            flammability = 0.1f;
            explosiveness = 0.2f;
            cost = 1.3f;
        }};
        testPlastanium = itemFactory.createItem("plastanium");

        assertEquals(testPlastanium,plastanium);
    }

    @Test
    public void testPhasefabric() {
        phasefabric = new Item("phase-fabric", Color.valueOf("f4ba6e")){{
            type = ItemType.material;
            cost = 1.3f;
            radioactivity = 0.6f;
        }};
        testPhasefabric = itemFactory.createItem("phase-fabric");

        assertEquals(testPhasefabric,phasefabric);
    }

    @Test
    public void testSurgealloy() {
        surgealloy = new Item("surge-alloy", Color.valueOf("f3e979")){{
            type = ItemType.material;
        }};
        testSurgealloy = itemFactory.createItem("surge-alloy");

        assertEquals(testSurgealloy,surgealloy);
    }

    @Test
    public void testSporePod() {
        sporePod = new Item("spore-pod", Color.valueOf("7457ce")){{
            flammability = 1.05f;
        }};
        testSporePod = itemFactory.createItem("spore-pod");

        assertEquals(testSporePod,sporePod);
    }


    @Test
    public void testBlastCompound() {
        blastCompound = new Item("blast-compound", Color.valueOf("ff795e")){{
            flammability = 0.4f;
            explosiveness = 1.2f;
        }};
        testBlastCompound = itemFactory.createItem("blast-compound");

        assertEquals(testBlastCompound,blastCompound);
    }


    @Test
    public void testPyratite() {
        pyratite = new Item("pyratite", Color.valueOf("ffaa5f")){{
            flammability = 1.4f;
            explosiveness = 0.4f;
        }};
        testPyratite = itemFactory.createItem("pyratite");

        assertEquals(testPyratite,pyratite);
    }
}