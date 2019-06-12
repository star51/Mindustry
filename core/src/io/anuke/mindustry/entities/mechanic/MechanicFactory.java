package io.anuke.mindustry.entities.mechanic;

import io.anuke.mindustry.type.Mech;

public interface MechanicFactory {
    public Mech createMechanic(String name, boolean flying);
}
