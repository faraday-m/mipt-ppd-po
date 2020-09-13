package edu.phystech;

public class Rectangle extends Plainside {
    protected double height;

    public Rectangle(double width, double height) {
        super(width);
        this.setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        Figure.checkIfPositive(height);
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
