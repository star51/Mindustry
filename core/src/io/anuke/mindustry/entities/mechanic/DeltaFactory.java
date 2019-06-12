package io.anuke.mindustry.entities.mechanic;

import io.anuke.mindustry.type.Mech;

public class DeltaFactory implements MechanicFactory {

    @Override
    public Mech createMechanic(String name, boolean flying) {
        return new Delta(name, flying);
    }
}
