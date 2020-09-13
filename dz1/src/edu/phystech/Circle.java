package edu.phystech;

public class Circle implements Figure {
    private double radius;

    private Circle() {}

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public void setRadius(double radius) {
        Figure.checkIfPositive(radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
