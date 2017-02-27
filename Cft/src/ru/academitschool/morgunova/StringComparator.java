package ru.academitschool.morgunova;

import java.util.Comparator;

/**
 * Created by DNS on 27.02.2017.
 */
public class StringComparator implements Comparator <String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
