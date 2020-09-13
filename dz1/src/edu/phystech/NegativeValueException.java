package edu.phystech;

public class NegativeValueException extends RuntimeException {
    public NegativeValueException(double parameter) {
        super(String.format("The value %f is lower than zero", parameter));
    }
}
