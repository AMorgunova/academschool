package ru.academitschool.morgunova.main;

import ru.academitschool.morgunova.shapes.Circle;
import ru.academitschool.morgunova.shapes.Rectangle;
import ru.academitschool.morgunova.shapes.Square;
import ru.academitschool.morgunova.shapes.Triangle;

import java.lang.reflect.Array;

/**
 * Created by DNS on 10.02.2017.
 */
public class MainShapes {
    public static double getMaxArea(double[] shapes) {
        double max = shapes[0];

        for (double e : shapes) {
            if (e > max) {
                return e;
            }
        }
        return max;
    }

    Square square = new Square(3);
    Square square1 = new Square(5);
    Circle circle = new Circle(2);
    Circle circle1 = new Circle(6);
    Rectangle rectangle = new Rectangle(2, 5);
    Rectangle rectangle1 = new Rectangle(3, 5);
    Triangle triangle = new Triangle(2, 4, 6, 1, 4, 1);

}
