package edu.phystech;

/*
* Нельзя наследовать Rectangle или Square друг от друга.
* При наследовании Square от Rectangle, квадрат приобретает методы getHeight()/setHeight().
* Если метод getArea не переопределен, квадрат будет вести себя как прямоугольник.
* Если метод переопределён, наличие этих методов в паблике просто неконсистентно.
*
* При наследовании Rectangle от Square нарушается принцип подстановки Лисков:
* логика работы программы будет изменяться при подмене любого квадрата на прямоугольник -
* площадь фигуры не будет равна площади ширины.
*
* Поэтому для сохранения иерархии создал абстрактный класс, отвечающий за свойство "ширина",
* которое есть и у квадрата, и у прямоугольника. Так разделяется логика вычисления площади,
* а классы фигур не приобретают лишние атрибуты.
* */
public abstract class Plainside implements Figure {
    protected double width;

    protected Plainside(double width) {
        this.setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        Figure.checkIfPositive(width);
        this.width = width;
    }
}
