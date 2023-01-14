package main.java20230114.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Boolean> list1 = new ArrayList<>();
        list1.add(true);
        list1.add(true);
        list1.add(false);

        System.out.println(countIf(list1, true));
        System.out.println(countIf(list1, false));

        List<String> list2 = new ArrayList<>();
        list2.add("abc");
        list2.add("qqq");
        list2.add("iddqd");
        list2.add("iddqd");
        System.out.println(countIf(list2, new String("iddqd")));
    }

    //    Реализовать метод, который считает количество элементов в переданном List
    public static <T> int countIf(List<T> from, T value) {
        int counter = 0;
        for (T element : from) {
            if (element == value) { //element == value
                ++counter;
            }
        }
        return counter;
    }
}

