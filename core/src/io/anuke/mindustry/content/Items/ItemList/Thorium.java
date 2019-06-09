package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

public class Thorium {
    public static Item thorium;

    public static Item createThorium() {
        thorium = new Item("thorium", Color.valueOf("f9a3c7")) {{
            type = ItemType.material;
            explosiveness = 0.2f;
            hardness = 4;
            radioactivity = 1f;
            cost = 1.1f;
        }};
        return thorium;
    }
}
