package main.java20230114.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        На вход подаются два сета, вывести уникальные элементы,
//        которые встречаются и в первом и во втором.
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(0);
//        list1.add(0);
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        System.out.println("set:" + set1);
//        System.out.println("list:" + list1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(3);
        set2.add(2);
        set2.add(2);

        set1.retainAll(set2);

        for (Integer elem : set1) {
            System.out.println(elem);
        }
    }
}

