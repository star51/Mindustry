package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

public class Plastanium {
    public static Item plastanium;

    public static Item createPlastanium() {
        plastanium = new Item("plastanium", Color.valueOf("cbd97f")) {{
            type = ItemType.material;
            flammability = 0.1f;
            explosiveness = 0.2f;
            cost = 1.3f;
        }};
        return plastanium;
    }
}
