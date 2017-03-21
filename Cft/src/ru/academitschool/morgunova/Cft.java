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
        boolean isWholeNumbers = true;

        try {
            switch (args[3]) {
                case "-a":
                    isAscending = true;
                    break;
                case "-d":
                    isAscending = false;
                    break;
                default:
                    throw new IncorrectSortingArgumentException("Данный аргумент отсутствует: -a: Сортировка по возрастанию -d: Сортировка по убыванию");
            }

            switch (args[2]) {
                case "-i":
                    isWholeNumbers = true;
                    break;
                case "-s":
                    isWholeNumbers = false;
                    break;
                default:
                    throw new IncorrectTypeArgumentException("Данный аргумент отсутствует: -i: Сортировка целых чисел -s: Сортировка строк");
            }
        } catch (IncorrectSortingArgumentException | IncorrectTypeArgumentException e) {
            System.out.println(e.getMessage());
        }

        try (Scanner scanner = new Scanner(new FileInputStream(args[0]));
             PrintWriter printWriter = new PrintWriter(args[1])) {

            if (isWholeNumbers) {
                ArrayList<Integer> list = new ArrayList<>(100);
                while (scanner.hasNextInt()) {
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

                if (isAscending) {
                    InsertionSort.sort(list, new StringComparator());
                    list.forEach(printWriter::println);
                } else {
                    InsertionSort.sort(list, new StringComparator().reversed());
                    list.forEach(printWriter::println);
                }
            }
        }
    }
}
