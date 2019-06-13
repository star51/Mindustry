package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.content.Items.CreateItemFactory;
import io.anuke.mindustry.type.Item;
import io.anuke.mindustry.type.ItemType;

public class Phasefabric extends CreateItemFactory {
    public static Item phasefabric;

    public static Item createPhasefabric() {
        phasefabric = new Item("phase-fabric", Color.valueOf("f4ba6e")) {{
            type = ItemType.material;
            cost = 1.3f;
            radioactivity = 0.6f;
        }};
        return phasefabric;
    }
}
