package com.sda.oop;

public class Rectangle extends AShape {

    private double bigSide;

    public double getBigSide() {
        return bigSide;
    }

    public double getSmallSide() {
        return smallSide;
    }

    public Rectangle(double bigSide, double smallSide) {
        this.bigSide = bigSide;
        this.smallSide = smallSide;
    }

    private double smallSide;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public double getArea() {
        return bigSide * smallSide;
    }

    @Override
    public double getPerimeter() {
        return 2 * bigSide + 2 * smallSide;
    }
}
