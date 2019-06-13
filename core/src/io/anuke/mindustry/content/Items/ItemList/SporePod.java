package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.content.Items.CreateItemFactory;
import io.anuke.mindustry.type.Item;

public class SporePod extends CreateItemFactory {
    public static Item sporePod;

    public static Item createSporePod() {
        sporePod = new Item("spore-pod", Color.valueOf("7457ce")) {{
            flammability = 1.05f;
        }};
        return sporePod;
    }
}
