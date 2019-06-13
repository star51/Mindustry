import io.anuke.arc.function.Consumer;
import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.content.StatusEffects;
import io.anuke.mindustry.type.*;
import io.anuke.mindustry.world.Block;
import org.junit.jupiter.api.*;
import io.anuke.mindustry.core.ContentLoader;
import io.anuke.mindustry.game.Content;
import io.anuke.mindustry.Vars;

import static io.anuke.mindustry.Vars.content;
import static org.junit.jupiter.api.Assertions.*;

public class ContentLoaderTest {
    private ContentLoader contentLoader;

    @BeforeEach
    public void setUp(){
        contentLoader = new ContentLoader();
        content = new ContentLoader();
    }

    @AfterEach
    public void tearDown(){
        contentLoader = null;
        content = null;
    }

    /***
     * Purpose: Fail load() by Null Pointer
     * Original: loaded = false
     * Expected: loaded = false
     *
     */
    @Test
    public void testLoadFail() {
        try{
            contentLoader.load();
        } catch (Exception e) {}
        assertTrue(!contentLoader.getLoaded());
    }

    /***
     * Purpose: Change verbose to true by SetVerbose()
     * Original: verbose = false
     * Expected: verbose = true
     *
     */
    @Test
    public void testSetVerbose(){
        content.setVerbose();
        assertTrue(Vars.content.getVerbose());
    }

    /***
     * Purpose: Change verbose to true by SetVerbose()
     * Original: verbose = false
     * Expected: verbose = true
     *
     */
    @Test
    public void testChangeVerbose() {
    	content.chageVerbose(true);
    	assertTrue(Vars.content.getVerbose());
    }

    /***
     * Purpose: Run load()
     * Original: loaded = false
     * Expected: loaded = true
     *
     */
    @Test
    public void testLoad() {
        content.load();
        assertTrue(content.getLoaded());
    }

    /***
     * Purpose:
     *          Change verbose to true and Run load().
     *          Print Content Information.
     * Original:
     *          loaded = false
     *          verbose = false
     * Expected:
     *          loaded = true;
     *          verbose = true
     *
     */
    @Test
    public void testVerboseLoad(){
        content.setVerbose();
        content.load();
        assertTrue(content.getLoaded());
        assertTrue(content.getVerbose());
    }

    /***
     * Purpose:
     *          Run load() twice and Print log.
     *          After first load(), change loaded to true.
     * Original:
     *          loaded = false
     *          verbose = false
     * Expected:
     *          loaded = true
     *          verbose = false
     *
     */
    @Test
    public void testLoadTwoTimes(){
        content.load();
        content.load();
        assertTrue(content.getLoaded());
        assertTrue(!content.getVerbose());
    }

    /**
     * Purpose: Run getByName().
     *          Return Mech instance of whose name is "alpha-mech"
     * Input:
     *          ContentType.mech,
     *          "alpha-mech"
     * Expected: mech.name = "alpha-mech"
     */
    @Test
    public void testgetByName() {
        content.load();
        Mech mech = content.getByName(ContentType.mech, "alpha-mech");
        assertEquals(mech.name, "alpha-mech");
    }

    /**
     * Purpose: Run getByID().
     *          Return Mech instance whose id is 2
     *Input:
     *          ContentType.mech,
     *          2
     *Expected: mech.name = "tau-mech'
     */
    @Test
    public void getByID(){
        content.load();
        Mech mech = content.getByID(ContentType.mech, 2);
        assertEquals(mech.name,"tau-mech" );
    }

    /**
     * Purpose: input id is negative integer.
     *          Return Null.
     *Input:
     *          ContentType.mech,
     *          -1
     *Expected: mech = null
     */
    @Test
    public void getByIDNegative(){
        content.load();
        Mech mech = content.getByID(ContentType.mech, -1);
        assertNull(mech);
    }

    /**
     * Purpose:
     *          Input id is larger than the number of ContentType.mech
     *          Return Null
     *Input:
     *          ContentType.mech,
     *          12345678
     *Expected: mech = null
     */
    @Test
    public void getByIDOverflow(){
        content.load();
        Mech mech = content.getByID(ContentType.mech, 12345678);
        assertNull(mech);
    }

//    @Test
//    public void testInitialize() {
//    	content.initialize(Content::init);
//    	assertTrue(!content.getLoaded());
//    }
//
//
//    @Test
//    public void testLoadColors() {
//    	content.loadColors();
//    	assertTrue(!content.getLoaded());
//    }
}
