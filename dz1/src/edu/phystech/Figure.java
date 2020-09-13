package edu.phystech;

public interface Figure {
    static void checkIfPositive(double value) {
        if (value < 0) {
            throw new NegativeValueException(value);
        }
    }

    double getArea();
}
