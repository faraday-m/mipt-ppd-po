package edu.phystech;

public class Square extends Plainside {

    public Square(double width) {
        super(width);
    }

    public double getArea() {
        return width * width;
    }

}
