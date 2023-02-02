package main.stream.predicat;

import java.util.function.Predicate;

public class ApplicationPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test1 = new Predicate<Integer>() {// реализуется с помощью анонимного класса
            @Override
            public boolean test(Integer digit) {
                if (digit >= 7){
                   return true;
                } else {
                    return false;
                }
            }
        };

        System.out.println(test1.test(10));
        System.out.println(test1.test(5));
    }
}
