package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

public class Surgealloy {
    public static Item surgealloy;

    public static Item createSurgealloy() {
        surgealloy = new Item("surge-alloy", Color.valueOf("f3e979")) {{
            type = ItemType.material;
        }};
        return surgealloy;
    }
}
