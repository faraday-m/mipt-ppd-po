package edu.phystech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter circle radius");
        Figure circle = new Circle(sc.nextDouble());
        System.out.println("Enter rectangle width and height separated with space");
        Figure rect = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter square width");
        Figure square = new Square(sc.nextDouble());

        StringBuilder result = new StringBuilder();
        result.append("Area of circle = ").append(circle.getArea())
              .append("\nArea of rect = ").append(rect.getArea())
              .append("\nArea of square = ").append(square.getArea());
        System.out.println(result);
    }
}
