package br.com.thalisson.dagger.domain;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

public class LandingGear {
    private String landingGear;

    public LandingGear() {
        this.landingGear = "manual";
    }

    public void setLandingGearAutomatic() {
        this.landingGear = "automatic";
    }

    public void setLandingGearManual() {
        this.landingGear = "manual";
    }

    public String getLandingGear() {
        return this.landingGear;
    }
}
