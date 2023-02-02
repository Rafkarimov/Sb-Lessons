package main.stream.predicat;

import java.util.ArrayList;
import java.util.List;

//создание своего предиката - функциональный интерфейс
interface MyPredicate<T> {
    boolean test(T t);
}

//class MyPredicateClass {
//    List<String> strings = new ArrayList<>();
//    strings.add("a");
//    strings.add("abbb");
//    strings.add("avvvv");
//    MyPredicate<String> predicate = new MyPredicate<String>() {
//        @Override
//        public boolean test(String s) {
//            return s.length() > 2; посчитать строки длиной больше 2
//        }
//    };
//    for(
//    String s:strings) //вывести на экран все строки которые удовлетворяют условию предиката
//
//    {
//        if (predicate.test(s))
//            System.out.println(s);
//    }
//}

