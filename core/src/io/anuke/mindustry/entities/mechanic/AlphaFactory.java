package io.anuke.mindustry.entities.mechanic;

import io.anuke.mindustry.type.Mech;

public class AlphaFactory implements MechanicFactory{
    @Override
    public Mech createMechanic(String name, boolean flying) {
        return new Alpha(name, flying);
    }
}
