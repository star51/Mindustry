package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

public class Titanium {
    public static Item titanium;

    public static Item createTitanium() {
        titanium = new Item("titanium", Color.valueOf("8da1e3")) {{
            type = ItemType.material;
            hardness = 3;
            cost = 1f;
        }};
        return titanium;
    }
}
