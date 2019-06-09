package io.anuke.mindustry.content.Items.ItemList;
import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

public class Graphite {
    public static Item graphite;

    public static Item createGraphite() {
        graphite = new Item("graphite", Color.valueOf("b2c6d2")) {{
            type = ItemType.material;
            cost = 1f;
        }};
        return graphite ;
    }
}
