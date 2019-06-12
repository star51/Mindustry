package io.anuke.mindustry.entities.mechanic;

import io.anuke.mindustry.type.Mech;

public class DartFactory implements MechanicFactory {
    @Override
    public Mech createMechanic(String name, boolean flying) {
        return new Dart(name, flying);
    }
}
