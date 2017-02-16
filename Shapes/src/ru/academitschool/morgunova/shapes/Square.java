package ru.academitschool.morgunova.shapes;

import ru.academitschool.morgunova.Shape;

/**
 * Created by DNS on 12.02.2017.
 */
public class Square implements Shape {

    double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return width;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }
}
