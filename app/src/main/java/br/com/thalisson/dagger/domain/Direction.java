package br.com.thalisson.dagger.domain;

/**
 * Created by Team Fretebras Android on 11/10/16.
 */

public class Direction {
    private String direction;

    public Direction() {
        this.direction = "forward";
    }

    public void directionToLeft() {
        this.direction = "to left";
    }

    public void directionToRight() {
        this.direction = "to right";
    }

    public void directionToForward() {
        this.direction = "forward";
    }

    public String getDirection() {
        return this.direction;
    }
}
