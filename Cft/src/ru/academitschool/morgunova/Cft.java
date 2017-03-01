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
        switch (args[3]) {
            case "-a":
                isAscending = true;
                break;
            case "-d":
                isAscending = false;
                break;
            default:
                //TODO выбросить исключение об остутствии аргумента
                break;
        }

        boolean isWholeNumbers = true;
        switch (args[2]) {
            case "-i":
                isWholeNumbers = true;
                break;
            case "-s":
                isWholeNumbers = false;
                break;
            default:
                //TODO выбросить исключение об остутствии аргумента
                break;
        }

        try (Scanner scanner = new Scanner(new FileInputStream(args[0]));
             PrintWriter printWriter = new PrintWriter(args[1])) {

            if (isWholeNumbers) {
                ArrayList<Integer> list = new ArrayList<>(100);
                while (scanner.hasNextLine()) {
                    list.add(scanner.nextInt());
                }

                if (isAscending) {
                    InsertionSort.sort(list, new IntegerComparator());
                    list.forEach(printWriter::println);
                } else {
                    InsertionSort.sort(list, new IntegerComparator().reversed());
                    list.forEach(printWriter::println);
                }
            } else {
                ArrayList<String> list = new ArrayList<>(100);
                while (scanner.hasNextLine()) {
                    list.add(scanner.nextLine());
                }

                InsertionSort.sort(list, new StringComparator());
                list.forEach(printWriter::println);
            }
        }
    }
}
