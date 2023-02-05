package main.home044;

import java.util.List;

/*
Все задачи этого блока необходимо решить, используя стримы:
На вход подается список строк. Необходимо вывести количество непустых строк в
списке.
Например, для List.of("abc", "", "", "def", "qqq") результат равен 3.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(countNotBlankStrings(List.of("abc", "", "", "def", "qqq")));
    }

    private static long countNotBlankStrings(List<String> input) {
        return input.stream()
                .filter(str -> !str.isBlank())
                .count();
    }
}
