package ru.academitschool.morgunova.range;

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
        System.out.printf("Интервал от %.2f до %.2f%n", from, to);
    }

    public double getLength() {
        return this.to - this.from;
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

    public Range getIntersection(Range range) {
        if (range.from <= this.to && range.from > this.from) {
            return new Range(range.from, this.to);
        } else if (this.from <= range.to && this.from > range.from) {
            return new Range(this.from, range.to);
        } else if (range.from >= this.from && range.to <= this.to) {
            return new Range(range.from, range.to);
        } else if (this.from >= range.from && this.to <= range.to) {
            return new Range(this.from, this.to);
        }
        return null;
    }

    public double[] getUnification(Range range1, Range range2) {
        if (range2.from <= range1.to && range2.from > range1.from) {
            return new double[]{range1.from, range2.to};
        } else if (range1.from <= range2.to && range1.from > range2.from) {
            return new double[]{range2.from, range1.to};
        } else if (range2.from >= range1.from && range2.to <= range1.to) {
            return new double[]{range1.from, range1.to};
        } else if (range1.from >= range2.from && range1.to <= range2.to) {
            return new double[]{range2.from, range2.to};
        }
        return new double[]{range1.from, range1.to, range2.from, range2.to};
    }

}


