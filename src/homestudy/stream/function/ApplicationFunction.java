package homestudy.stream.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class ApplicationFunction {
    public static void main(String[] args) {

        Function<Integer, String> test = (Integer digit) -> {
            return String.valueOf(digit);
        }; //интеджер преобразуется в стринг

        System.out.println("result=" + test.apply(20));

    }
}
