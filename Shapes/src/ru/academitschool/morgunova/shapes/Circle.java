package ru.academitschool.morgunova.shapes;

import ru.academitschool.morgunova.Shape;

/**
 * Created by DNS on 12.02.2017.
 */
public class Circle implements Shape {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double getWidth() {
        return radius / 2;
    }

    @Override
    public double getHeight() {
        return radius / 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
