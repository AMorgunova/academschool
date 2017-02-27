package ru.academitschool.morgunova;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by DNS on 27.02.2017.
 */
public class InsertionSort {
    public static <T> void sort(ArrayList<T> list, Comparator<T> comparator) {
        for (int i = 1; i < list.size(); i++) {
            T temp = list.get(i);
            int j;
            for (j = i - 1; j >= 0 && (comparator.compare(list.get(j), temp) > 0); j--) {
                list.set((j + 1), list.get(j));
            }
            list.set((j + 1), temp);
        }
    }
}
