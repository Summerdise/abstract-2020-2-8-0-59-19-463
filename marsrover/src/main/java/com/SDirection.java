package com;

public class SDirection extends Direction {
    public SDirection(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new EDirection('E');
    }

    @Override
    public Direction turnRight() {
        return new WDirection('W');
    }
}
