package ru.academitschool.morgunova;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by DNS on 15.02.2017.
 */
public class Cft {

    public static void main(String[] args) throws IOException {
        if (args.length != 4) {
            System.out.println("Недостаточное количество аргументов");
            return;
        }

        boolean isAscending = true;
        if (args[3].equals("-a")) {
            isAscending = true;
        } else if (args[3].equals("-d")) {
            isAscending = false;
        } else {
            //TODO выбросить исключение об остутствии аргумента
        }

        boolean isWholeNumbers = true;
        if (args[2].equals("-i")) {
            isWholeNumbers = true;
        } else if (args[2].equals("-s")) {
            isAscending = false;
        } else {
            //TODO выбросить исключение об остутствии аргумента
        }

        try (Scanner scanner = new Scanner(new FileInputStream(args[0]));
             PrintWriter printWriter = new PrintWriter(args[1])) {

            {
                ArrayList<Integer> list = new ArrayList<>(100);
                while (scanner.hasNextLine()) {
                    list.add(scanner.nextInt());
                }

                if (isAscending) {
                    InsertionSort.sort(list, new IntegerComparator());
                    for (Integer e : list) {
                        printWriter.println(e);
                    }
                } else {
                    InsertionSort.sort(list, new IntegerComparator().reversed());
                    for (Integer e : list) {
                        printWriter.println(e);
                    }
                }
            }
        }

    }
}
