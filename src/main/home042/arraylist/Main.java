package main.home042.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//Реализовать метод, который на вход принимает ArrayList<T>, а возвращает
//набор уникальных элементов этого массива. Решить используя коллекции.

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        list.add("Hi");
        list.add("Good buy");
        list.add("Good buy");

        list1.add(5);
        list1.add(5);
        list1.add(6);

        ListToSet<String> listToSet = new ListToSet<>();
        Set<String> result = listToSet.getSetFromList(list);
        System.out.println(result);

        ListToSet<Integer> listToSet1 = new ListToSet<>();
        Set<Integer> result1 = listToSet1.getSetFromList(list1);
        System.out.println(result1);
    }
}
