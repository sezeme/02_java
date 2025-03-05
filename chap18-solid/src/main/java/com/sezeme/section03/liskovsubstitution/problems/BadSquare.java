package com.sezeme.section03.liskovsubstitution.problems;

public class BadSquare extends BadRectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);      // LSP 위반: 예상치 못한 동작
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);       // LSP 위반: 예상치 못한 동작
        super.setHeight(height);
    }
}
