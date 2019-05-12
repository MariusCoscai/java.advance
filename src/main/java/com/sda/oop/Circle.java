package com.sda.oop;

public class Circle extends AShape {

    private static final double PI = 3.14;
    // math.PI   -> este definita in java
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius *radius;
    }

    public double getPerimeter() {
        return 2 * PI *radius;
    }
}
