package main.home044;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Все задачи этого блока необходимо решить, используя стримы:
Дан Set<Set<Integer>>. Необходимо перевести его в Set<Integer>.
 */
public class Task6 {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> set2 = Set.of(6, 7, 8, 9, 10);
        Set<Set<Integer>> setOfSets1 = Set.of(set1, set2); //первый вариант

        Set<Integer> setOfSets2 = Stream.concat(set1.stream(), set2.stream())
                .collect(Collectors.toSet()); // второй вариант

        System.out.println(transformToSet(setOfSets1));
        System.out.println("--------------------------");
        System.out.println(setOfSets2);
    }

    private static Set<Integer> transformToSet(Set<Set<Integer>> input) {
        return input.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }
}
