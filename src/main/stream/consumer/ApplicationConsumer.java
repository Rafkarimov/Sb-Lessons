package main.stream.consumer;
//принимает значение и ничего не возвращает, противоположность Supplier

import java.util.function.Consumer;


public class ApplicationConsumer {
    public static void main(String[] args) {

        Consumer<String> test = (String str) -> {
            System.out.println(str);
        };

        test.accept("Hello World!");
    }
}
