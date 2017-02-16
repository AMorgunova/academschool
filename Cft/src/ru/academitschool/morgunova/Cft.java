package ru.academitschool.morgunova;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by DNS on 15.02.2017.
 */
public class Cft {

    public static int[] sortInserts(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        try (PrintWriter printWriter = new PrintWriter("out.txt");
             Scanner scanner = new Scanner(new FileInputStream("in.txt"))) {
            ArrayList<String> list = new ArrayList<String>();

            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                list.add(s);
            }

            String[] str = list.toArray(new String[list.size()]);
            int[] num = new int[str.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(str[i]);
            }

            for (int e : sortInserts(num)) {
                printWriter.println(e);
            }
        }
    }
}

