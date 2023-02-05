package main.home044;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/*
Все задачи этого блока необходимо решить, используя стримы:
Дан Set<Set<Integer>>. Необходимо перевести его в Set<Integer>.
 */
public class Task6 {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> set2 = Set.of(6, 7, 8, 9, 10);
        Set<Set<Integer>> setOfSets = Set.of(set1, set2);

        System.out.println(transformToSet(setOfSets));
    }

    private static Set<Integer> transformToSet(Set<Set<Integer>> input) {
        return input.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }
}
