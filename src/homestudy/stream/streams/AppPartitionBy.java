package homestudy.stream.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppPartitionBy {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.add(3); // нельзя чтоб были дубли в Map, для этого вводиться merge

        Map<Boolean, List<Integer>> newMap = list.stream()
                .collect(Collectors.partitioningBy((Integer digit) -> { // разбиваем на 2 одинаковые
                    // категории {false=[3, 4, 3], true=[0, 1, 2]}
                    if (digit <= 2) {
                        return true;
                    } else {
                        return false;
                    }
                }));

        System.out.println(list);
        System.out.println(newMap);
    }
}
