package edu.phystech;

import org.junit.Test;

public class RectangleTest {

    @Test
    public void positiveWidthHeightTest() {
        double testWidth = 10;
        double testHeight = 40;
        Figure rect = new Rectangle(testWidth, testHeight);
        assert(testWidth * testHeight == rect.getArea());
    }

    @Test
    public void changeHeightTest() {
        double testWidth = 10;
        double testHeight = 20;
        Rectangle rectangle = new Rectangle(testWidth, testHeight);
        double area = rectangle.getArea();
        rectangle.setHeight(3 * testHeight);
        assert(rectangle.getArea() == 3*area);
    }

    @Test
    public void declaredAsPlainsideLogicTest() {
        double testWidth = 10;
        double testHeight = 20;
        Plainside rectangle = new Rectangle(testWidth, testHeight);
        rectangle.setWidth(0.5 * testWidth);
        assert(rectangle.getArea() == 0.5 * testWidth * testHeight);
    }

    @Test(expected = NegativeValueException.class)
    public void negativeHeightTest() {
        double testWidth = 1;
        double testHeight = -1;
        Figure rect = new Rectangle(testWidth, testHeight);
    }
}
