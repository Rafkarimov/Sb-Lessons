package main.java20230128.question;

import java.util.ArrayList;
import java.util.List;

/*
В чем практическая разница? Что выбрать (учитывая что class ArrayList реализует интерфейс List)
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        foo(listB);
//        foo(listA);
    }
    public static void foo(ArrayList<?> list) {

    }
}
