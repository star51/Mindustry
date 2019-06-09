package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

public class Silicon {
    public static Item silicon;

    public static Item createSilicon() {
        silicon = new Item("silicon", Color.valueOf("53565c")) {{
            type = ItemType.material;
            cost = 0.8f;
        }};
        return silicon;
    }
}
