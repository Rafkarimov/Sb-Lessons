package homestudy.stream.predicat;

import java.util.function.Predicate;

public class ApplicationLamda {
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

        Predicate<Integer> test2 = (Integer digit) -> {
            if (digit >= 7) {
                return true;
            }else
                return false;
        }; // эквивалент анонимному классу, но это не одно и тоже

        System.out.println(test1.test(10));
        System.out.println(test2.test(5));
    }
}
