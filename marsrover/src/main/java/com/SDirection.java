package com;

public class SDirection extends Direction implements ChangeDirection{
    public SDirection(char direction) {
        super(direction);
    }
    @Override
    public Direction turnLeft(){
        return new EDirection('E');
    }
    @Override
    public Direction turnRight(){
        return new WDirection('W');
    }
}
