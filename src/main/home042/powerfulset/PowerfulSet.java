package main.home042.powerfulset;

import java.util.Set;

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
public class PowerfulSet<T> {
    public <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        set1.retainAll(set2);
        return set1;
    }

    public <T> Set<T> union(Set<T> set1, Set<T> set2) {
        set1.addAll(set2);
        return set1;
    }

    public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2) {
        set1.removeAll(set2);
        return set1;
    }
}
