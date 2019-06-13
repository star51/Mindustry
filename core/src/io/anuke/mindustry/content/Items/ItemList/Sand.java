package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.content.Items.CreateItemFactory;
import io.anuke.mindustry.type.Item;

public class Sand extends CreateItemFactory {
    public static Item sand;

    public static Item createSand() {
        sand = new Item("sand", Color.valueOf("f7cba4")) {{

        }};
        return sand;
    }
}
