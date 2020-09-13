package edu.phystech;

import org.junit.Test;

public class PlainsideTest {
    @Test
    public void changeWidthTest() {
        double testWidth = 10;
        Plainside mock = new Plainside(testWidth) {
            @Override
            public double getArea() {
                return 0;
            }
        };
        mock.setWidth(2*testWidth);
        assert(mock.getWidth() == 2 * testWidth);
    }

    @Test(expected = NegativeValueException.class)
    public void negativeWidthTest() {
        double testWidth = -1;
        Plainside mock = new Plainside(testWidth) {
            @Override
            public double getArea() {
                return 0;
            }
        };
        mock.setWidth(testWidth);
    }
}
