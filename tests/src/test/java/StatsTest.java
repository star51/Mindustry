import io.anuke.mindustry.game.Stats;
import io.anuke.mindustry.maps.zonegen.DesertWastesGenerator;
import io.anuke.mindustry.type.Zone;
import org.junit.Test;

import static io.anuke.mindustry.content.Items.Items.copper;

public class StatsTest {
    private Stats stats = new Stats();
    private Zone zone = new Zone("desertWastes", new DesertWastesGenerator(260, 260));  // conditionwave = 20
    private Stats.RankResult rankResult;

    @Test
    public void launchOverTrueTest() {
        stats.wavesLasted = 21;
        rankResult = stats.calculateRank(zone, true);
        stats.itemsDelivered.put(copper, 130);
        System.out.println(rankResult.rank);
        System.out.println(rankResult.modifier);
    }

    @Test
    public void launchOverNonItemTest() {
        stats.wavesLasted = 21;
        rankResult = stats.calculateRank(zone, true);
        stats.itemsDelivered.put(copper, 0);
        System.out.println(rankResult.rank);
        System.out.println(rankResult.modifier);
    }

    @Test
    public void launchUnderTest() {
        stats.wavesLasted = 19;
        rankResult = stats.calculateRank(zone, false);
        stats.itemsDelivered.put(copper, 130);
        System.out.println(rankResult.rank);
        System.out.println(rankResult.modifier);
    }

    @Test
    public void launchUnderNonItemTest() {
        stats.wavesLasted = 19;
        rankResult = stats.calculateRank(zone, false);
        stats.itemsDelivered.put(copper, 0);
        System.out.println(rankResult.rank);
        System.out.println(rankResult.modifier);
    }

    @Test
    public void launchSameTest() {
        stats.wavesLasted = 20;
        rankResult = stats.calculateRank(zone, true);
        stats.itemsDelivered.put(copper, 130);
        System.out.println(rankResult.rank);
        System.out.println(rankResult.modifier);
    }

    @Test
    public void launchSameNonItemTest() {
        stats.wavesLasted = 20;
        rankResult = stats.calculateRank(zone, true);
        stats.itemsDelivered.put(copper, 0);
        System.out.println(rankResult.rank);
        System.out.println(rankResult.modifier);
    }
}