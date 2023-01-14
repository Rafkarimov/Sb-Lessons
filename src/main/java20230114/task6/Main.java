package main.java20230114.task6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//удалить в List все нечетные
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        Iterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Integer elem = iterator.next();
            if (elem % 2 != 0) {
                iterator.remove();
            }
        }

//        list.removeIf(elem -> elem % 2 != 0);
//        list.forEach(System.out::println);

        System.out.println(list);
    }
}

