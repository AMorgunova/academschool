package ru.academitschool.morgunova.range;

/*xCre0t.d0b..DNS on 27.01.2017.
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

    public String toString() {
        return "Интервал от " + from + " до " + to;
    }

    public boolean isInside(double a) {
        return a >= from && a <= to;
    }

    private static boolean isIntersection(Range range1, Range range2) {
        return range2.from < range1.to && range1.from < range2.to;
    }

    public Range getIntersection(Range range) {
        if (!isIntersection(this, range)) {
            return  null;
        }
        return new Range(Math.max(this.from, range.from), Math.min(this.to, range.to));
    }

    public Range[] getUnion(Range range) {
        if (!isIntersection(this, range)) {
            return new Range[]{new Range(this.from, this.to), new Range(range.from, range.to)};
        }
        return new Range[]{new Range(Math.min(this.from, range.from), Math.max(this.to, range.to))};
    }

    public Range[] getDifference(Range range) {
        if (!isIntersection(this, range)) {
            return new Range[]{new Range(this.from, this.to)};
        } else if (this.to <= range.to && this.from < range.from) {
            return new Range[]{new Range(this.from, range.from)};
        } else if (range.to < this.to && range.from <= this.from) {
            return new Range[]{new Range(range.to, this.to)};
        } else if (this.from < range.from && this.to > range.to) {
            return new Range[]{new Range(this.from, range.from), new Range(range.to, this.to)};
        }
        return new Range[0];
    }
}