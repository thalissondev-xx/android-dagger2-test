package br.com.thalisson.dagger.domain;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

public class Car2 extends Car {
    public Car2() {
        super();
    }

    @Override
    public void increaseSpeed(int value) {
        super.increaseSpeed(value + 20);
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}
