package ru.academitschool.morgunova.range;


/**
 * Created by DNS on 27.01.2017.
 */
public class MainRange {
    public static void main(String[] args) {
        Range range = new Range(14.5, 23.3);
        range.print();

        range.setFrom(20);
        System.out.println("from = " + range.getFrom());
        range.setTo(51.3);
        System.out.println("to = " + range.getTo());

        double a = 25;
        range.isInside(a);
    }
}
