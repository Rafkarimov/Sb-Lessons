package homestudy.stream.streams;

import java.util.stream.Stream;

public class AppMap1 {
    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5)
                .filter((Integer digit) -> {
                    if (digit > 2) {
                        return true;
                    } else {
                        return false;
                    }
                }).map((Integer digit) -> {
                    return "newStr" + digit;
                })
                .forEach(System.out::println);
    }
}
