package io.anuke.mindustry.content;

import io.anuke.mindustry.entities.mechanic.*;
import io.anuke.mindustry.game.ContentList;
import io.anuke.mindustry.type.Mech;

public class Mechs implements ContentList{
    public static Mech alpha, delta, tau, omega, dart, javelin, trident, glaive;

    public static Mech starter;

    MechanicFactory mechanicFactory;

    @Override
    public void load(){
        setMechanicFactory(new AlphaFactory());
        alpha = mechanicFactory.createMechanic("alpha-mech", false);

        setMechanicFactory(new DeltaFactory());
        delta = mechanicFactory.createMechanic("delta-mech", false);

        setMechanicFactory(new TauFactory());
        tau = mechanicFactory.createMechanic("tau-mech", false);

        setMechanicFactory(new OmegaFactory());
        omega = mechanicFactory.createMechanic("omega-mech", false);

        setMechanicFactory(new DartFactory());
        dart = mechanicFactory.createMechanic("dart-ship", true);

        setMechanicFactory(new JavelinFactory());
        javelin = mechanicFactory.createMechanic("javelin-ship", true);

        setMechanicFactory(new TridentFactory());
        trident = mechanicFactory.createMechanic("trident-ship", true);

        setMechanicFactory(new GlaiveFactory());
        glaive = mechanicFactory.createMechanic("glaive-ship", true);

        starter = dart;
    }

    public void setMechanicFactory(MechanicFactory mechanicFactory) {
        this.mechanicFactory = mechanicFactory;
    }
}
