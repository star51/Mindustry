package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

public class Metaglass {
    public static Item metaglass;

    public static Item createMetaglass() {
        metaglass = new Item("metaglass", Color.valueOf("ebeef5")) {{
            type = ItemType.material;
            cost = 1.5f;
        }};
        return metaglass;
    }
}
