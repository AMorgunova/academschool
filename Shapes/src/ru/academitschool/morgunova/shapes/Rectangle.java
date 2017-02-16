package ru.academitschool.morgunova.shapes;

import ru.academitschool.morgunova.Shape;

/**
 * Created by DNS on 12.02.2017.
 */
public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
