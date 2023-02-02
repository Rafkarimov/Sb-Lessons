package main.stream.predicat;

import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {

        Predicate<Integer> test1 = new Predicate<Integer>() {// реализуется с помощью анонимного класса
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        System.out.println(test1.test(10));
        System.out.println(test1.test(5));
    }
}
