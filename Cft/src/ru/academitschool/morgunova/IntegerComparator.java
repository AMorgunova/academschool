package ru.academitschool.morgunova;

import java.util.Comparator;

/**
 * Created by DNS on 27.02.2017.
 */
public class IntegerComparator implements Comparator <Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
