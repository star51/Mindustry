package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.content.Items.Items;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

public class Copper extends Items {
    public static Item copper;

    public static Item createCopper() {
        copper = new Item("copper", Color.valueOf("d99d73")){{
            type = ItemType.material;
            hardness = 1;
            cost = 0.5f;
            alwaysUnlocked = true;
        }};
        return copper;
    }
}
