package com;

public class WDirection extends Direction {
    public WDirection(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new SDirection('S');
    }

    @Override
    public Direction turnRight() {
        return new NDirection('N');
    }
}
