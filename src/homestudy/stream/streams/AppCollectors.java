package homestudy.stream.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppCollectors {
    public static void main(String[] args) {

        List<String> list = Stream.of(1, 2, 3, 4, 5)
                .filter(digit -> digit > 2)
                .map(digit -> "newStr" + digit)
                .toList(); //сохранить в коллекцию, .collect(Collectors.toList()) - Тоже самое
        list.forEach(System.out::println);
    }
}
