package homestudy.stream.predicat;
//рассмотрим BiPredicate
import java.util.function.BiPredicate;

public class ApplicationBiPredicate {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> test = (Integer leftDigit, Integer rightDigit) -> {
            if (leftDigit + rightDigit >= 7) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(test.test(10, 2));
        System.out.println(test.test(5, 1));
    }
}
