package br.com.thalisson.dagger.domain;

import javax.inject.Inject;

/**
 * Created by Team Fretebras Android on 10/10/16.
 */

public class Car {
    public static final String SPEED = "br.com.thiengo.daggerexample.domain.Car.SPEED";

    @Inject
    Engine engine;

    @Inject
    Direction direction;

    @Inject
    public Car() { }

    public void increaseSpeed(int value) {
        engine.accelerate(value);
    }

    public void stop() {
        engine.brake();
    }

    public int getSpeed() {
        return engine.getRpm();
    }

    public String getDirection() {
        return direction.getDirection();
    }

    public void turnLeft() {
        direction.directionToLeft();
    }

    public void turnRight() {
        direction.directionToRight();
    }
}