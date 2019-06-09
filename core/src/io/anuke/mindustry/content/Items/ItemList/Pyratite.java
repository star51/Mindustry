package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.type.Item;

public class Pyratite {
    public static Item pyratite;

    public static Item createPyratite() {
        pyratite = new Item("pyratite", Color.valueOf("ffaa5f")) {{
            flammability = 1.4f;
            explosiveness = 0.4f;
        }};
        return pyratite;
    }

}
