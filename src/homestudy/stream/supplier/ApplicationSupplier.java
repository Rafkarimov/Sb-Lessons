package homestudy.stream.supplier;
//противоположность Consumer
import java.util.function.Supplier;

public class ApplicationSupplier {
    public static void main(String[] args) {

        Supplier<Integer> test = () -> {
            return 12;
        };

        System.out.println(test.get());
    }
}
