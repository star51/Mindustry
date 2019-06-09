package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

public class Lead {
    public static Item lead;

    public static Item createLead() {
        lead = new Item("lead", Color.valueOf("8c7fa9")) {{
            type = ItemType.material;
            hardness = 1;
            cost = 0.7f;
        }};
        return lead;
    }
}
