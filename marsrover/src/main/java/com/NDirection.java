package com;

public class NDirection extends Direction implements ChangeDirection{
    public NDirection(char direction) {
        super(direction);
    }
    @Override
    public Direction turnLeft(){
        return new WDirection('W');
    }
    @Override
    public Direction turnRight(){
        return new EDirection('E');
    }
}
