package br.com.thalisson.dagger.domain;

/**
 * Created by Team Fretebras Android on 10/10/16.
 */

public class Engine {
    private int rpm;

    public Engine() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value) {
        rpm += value;
    }

    public void brake() {
        rpm = 0;
    }
}
