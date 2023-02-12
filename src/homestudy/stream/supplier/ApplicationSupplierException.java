package homestudy.stream.supplier;

import java.util.function.Supplier;

public class ApplicationSupplierException {
    public static void main(String[] args) {

        Supplier<Exception> test = () -> {
            return new Exception("Some problem happened");
        };

        System.out.println(test.get()); // вывели на экран как объект

        Exception ex = test.get();
        throw  new RuntimeException(ex); //Возврат экспекшен
    }
}
