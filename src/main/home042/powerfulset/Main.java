package main.home042.powerfulset;
/*
Реализовать класс PowerfulSet, в котором должны быть следующие методы:
a. public <T> Set<T> intersection(Set<T> set1, Set<T> set2) — возвращает
пересечение двух наборов. Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}.
Вернуть {1, 2}
b. public <T> Set<T> union(Set<T> set1, Set<T> set2) — возвращает
объединение двух наборов. Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}.
Вернуть {0, 1, 2, 3, 4}
c. public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2) —
возвращает элементы первого набора без тех, которые находятся также
и во втором наборе. Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}. Вернуть {3}
 */

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PowerfulSet<Integer> powerfulSet = new PowerfulSet<>();
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(0, 1, 2, 4));
        Set<Integer> result = powerfulSet.intersection(set1, set2);
        System.out.println(result);

        Set<Integer> set3 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set4 = new HashSet<>(Set.of(0, 1, 2, 4));
        Set<Integer> result2 = powerfulSet.union(set3, set4);
        System.out.println(result2);

        Set<Integer> set5 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set6 = new HashSet<>(Set.of(0, 1, 2, 4));
        Set<Integer> result3 = powerfulSet.relativeComplement(set5, set6);
        System.out.println(result3);
    }
}
