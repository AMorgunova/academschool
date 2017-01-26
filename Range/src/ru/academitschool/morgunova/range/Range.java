package ru.academitschool.morgunova.range;

import java.io.PrintStream;

/**
 * Created by DNS on 27.01.2017.
 */
public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public void print() {
        System.out.println("Интервал от " + from + " до " + to);
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public boolean isInside(double a) {
        return a >= from && a <= to;
    }
}
