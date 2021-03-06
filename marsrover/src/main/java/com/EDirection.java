package com;

public class EDirection extends Direction {
    public EDirection(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new NDirection('N');
    }

    @Override
    public Direction turnRight() {
        return new SDirection('S');
    }
}
