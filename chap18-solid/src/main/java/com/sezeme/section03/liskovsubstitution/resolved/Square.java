package com.sezeme.section03.liskovsubstitution.resolved;

public class Square implements Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int)Math.pow(side, 2);
    }
}
