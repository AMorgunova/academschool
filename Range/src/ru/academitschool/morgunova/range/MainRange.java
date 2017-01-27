package ru.academitschool.morgunova.range;

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
    }
}
