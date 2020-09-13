package edu.phystech;

import org.junit.Test;

public class SquareTest {

    @Test
    public void positiveWidthTest() {
        double testWidth = 10;
        Figure square = new Square(testWidth);
        assert(testWidth * testWidth == square.getArea());
    }

}
