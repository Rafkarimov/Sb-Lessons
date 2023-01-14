package main.java20230114.task10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java", "Herbert Schildt");
        List<Integer> list1 = Arrays.asList(10, 9, 10, 10);

        Book book2 = new Book("Introduction to Algorithms", "Thomas H. Cormen");
        List<Integer> list2 = Arrays.asList(9, 10, 8, 10);

        Book book3 = new Book("The Art of Computer Programming", "Donald Knuth");
        List<Integer> list3 = Arrays.asList(8, 9, 8, 7);


        Map<Book, List<Integer>> map = new HashMap<>();
        map.put(book1, list1);
        map.put(book2, list2);
        map.put(book3, list3);

        map.entrySet().forEach(System.out::println);
//        for (Map.Entry<Book, List<Integer>> entry : map.entrySet()) {
//            System.out.println(entry);
//        } // одно и тоже, что и с верхняя строчка
//        System.out.println(map);

        System.out.println(map.get(new Book("Introduction to Algorithms", "Thomas H. Cormen")));

    }

}

