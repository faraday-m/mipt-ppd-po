package edu.phystech;

import org.junit.Test;

public class CircleTest {

    @Test
    public void positiveRadiusTest() {
        double testRadius = 10;
        Figure circle = new Circle(testRadius);
        assert(testRadius * testRadius * Math.PI == circle.getArea());
    }

    @Test
    public void changeRadiusTest() {
        double testRadius = 10;
        Circle circle = new Circle(testRadius);
        double area = circle.getArea();
        circle.setRadius(2 * testRadius);
        assert(circle.getArea() == 4*area);
    }

    @Test(expected = NegativeValueException.class)
    public void negativeRadiusTest() {
        double testRadius = -1;
        Circle circle = new Circle(testRadius);
    }

}
