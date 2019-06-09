package io.anuke.mindustry.content.Items.ItemList;
import io.anuke.arc.graphics.Color;
import io.anuke.mindustry.type.Item;

public class Coal {
    public static Item coal;

    public static Item createCoal() {
        coal = new Item("coal", Color.valueOf("272727")) {{
            explosiveness = 0.4f;
            flammability = 1f;
            hardness = 2;
        }};
        return coal;
    }
}
