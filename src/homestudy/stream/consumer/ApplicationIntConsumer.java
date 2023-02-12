package homestudy.stream.consumer;
//принимает значение и ничего не возвращает, противоположность Supplier

import java.util.function.Consumer;
import java.util.function.IntConsumer;


public class ApplicationIntConsumer {
    public static void main(String[] args) {

        Consumer<Integer> test = (Integer digit) -> {
            System.out.println(digit);
        };

        IntConsumer test2 = (int i) -> {
            System.out.println(2 * i);
        };
    }
}
