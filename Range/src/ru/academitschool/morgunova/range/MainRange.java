package ru.academitschool.morgunova.range;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DNS on 27.01.2017.
 */
public class MainRange {
    public static void main(String[] args) {
        Range range = new Range(14.5, 23.3);
        range.print();

        System.out.printf("Длина интервала: %.2f%n", range.getLength());

        range.setFrom(20);
        System.out.println("from = " + range.getFrom());
        range.setTo(51.3);
        System.out.println("to = " + range.getTo());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double a = scanner.nextDouble();
        if (range.isInside(a)) {
            System.out.println("Данное число принадлежит диапазону");
        } else {
            System.out.println("Данное число не принадлежит диапазону");
        }

        Range range1 = new Range(25, 70);
        Range range2 = new Range(35, 100);
        Range range3 = new Range(150, 200);
        Range intersection = range1.getIntersection(range2);
        System.out.printf("Интервал от %.2f до %.2f%n", intersection.getFrom(), intersection.getTo());

        double[] unification = range.getUnification(range3, range2);
        System.out.println(Arrays.toString(unification));



    }
}
