package br.com.thalisson.dagger.domain;

import javax.inject.Inject;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

public class Airplane {
    @Inject
    LandingGear landingGear;

    @Inject
    public Airplane() {}

    public void setAutomatic() {
        landingGear.setLandingGearAutomatic();
    }

    public void setManual() {
        landingGear.setLandingGearManual();
    }

    public String getLandingGear() {
        return landingGear.getLandingGear();
    }
}
