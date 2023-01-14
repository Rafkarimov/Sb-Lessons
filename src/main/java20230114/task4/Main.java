package main.java20230114.task4;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("WORLD");
        set.add("java");
        set.add("_learning");
        set.add("MY");
        set.add("hello");

        System.out.print("HashSet: ");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.print("\nTreeSet: ");
        TreeSet<String> set1 = convertHashSet(set);
        for (String s : set1) {
            System.out.print(s + " ");
        }
    }

    //    Создать метод, переводящий из HashSet в TreeSet. Вывести оба варианта.
    public static <T> TreeSet<T> convertHashSet(HashSet<T> from) {
        TreeSet<T> toReturn = new TreeSet<>();
        for (T element : from) {
            toReturn.add(element);
        }
        return toReturn;
    }
}


