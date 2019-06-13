package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.content.Items.CreateItemFactory;
import io.anuke.mindustry.type.Item;

public class Scrap extends CreateItemFactory {
    public static Item scrap;

    public static Item createScrap() {
        scrap = new Item("scrap", Color.valueOf("777777")) {{

        }};
        return scrap;
    }
}
