package ru.academitschool.morgunova.main;

import ru.academitschool.morgunova.range.Range;

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
        Range range3 = new Range(5, 10);
        Range range4 = new Range(7, 15);
        Range range5 = new Range(3, 13);
        Range range6 = new Range(3, 16);
        Range range7 = new Range(1, 13);
        Range range8 = new Range(1, 13);

        Range intersection = range1.getIntersection(range2);
        System.out.println(range.getIntersection(range1).toString());
        System.out.printf("Интервал от %.2f до %.2f%n", intersection.getFrom(), intersection.getTo());
        System.out.println();

        System.out.println(Arrays.toString(range1.getUnion(range2)));
        System.out.println(Arrays.toString(range3.getUnion(range4)));
        System.out.println(Arrays.toString(range1.getUnion(range3)));
        System.out.println();

        System.out.println(Arrays.toString(range3.getDifference(range4)));
        System.out.println(Arrays.toString(range4.getDifference(range3)));
        System.out.println(Arrays.toString(range3.getDifference(range5)));
        System.out.println(Arrays.toString(range5.getDifference(range3)));
        System.out.println(Arrays.toString(range3.getDifference(range6)));
        System.out.println(Arrays.toString(range6.getDifference(range3)));
        System.out.println(Arrays.toString(range6.getDifference(range7)));
        System.out.println(Arrays.toString(range7.getDifference(range6)));
        System.out.println(Arrays.toString(range7.getDifference(range8)));
        System.out.println(Arrays.toString(range1.getDifference(range3)));
    }
}
