package io.anuke.mindustry.content.Items.ItemList;

import io.anuke.mindustry.content.Items.CreateItemFactory;
import io.anuke.mindustry.type.Item;
import io.anuke.arc.graphics.Color;

public class BlastCompound extends CreateItemFactory {
    public static Item blastCompound;

    public static Item createBlastCompound() {
        blastCompound = new Item("blast-compound", Color.valueOf("ff795e")) {{
            flammability = 0.4f;
            explosiveness = 1.2f;
        }};
        return blastCompound;
    }
}
