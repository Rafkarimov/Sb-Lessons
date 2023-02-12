package homestudy.stream.streams;

import java.util.stream.Stream;

public class AppForEach {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        stream.forEach((Integer digit) -> {
            System.out.println(digit); // тоже самое stream.forEach(System.out::println);
        }); // вывести на экран forEach() принимает Consumer
    }
}
