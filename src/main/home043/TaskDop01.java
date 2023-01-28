package main.home043;

import java.util.Scanner;

/*
Дана строка, состоящая из символов “(“ и “)”
Необходимо написать метод, принимающий эту строку и выводящий результат,
является ли она правильной скобочной последовательностью или нет.
Строка является правильной скобочной последовательностью, если:
● Пустая строка является правильной скобочной последовательностью.
● Пусть S — правильная скобочная последовательность, тогда (S) есть
правильная скобочная последовательность.
● Пусть S1, S2 — правильные скобочные последовательности, тогда S1S2
есть правильная скобочная последовательность.

Входные данные:
(()()())
)(
(()
((()))
Выходные данные:
true
false
false
true
 */
public class TaskDop01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(correctBracketSequence(input));
    }

    private static boolean correctBracketSequence(String input) {
        while (input.contains("()")) {
            input = input.replaceAll("\\(\\)", "");
        }
        return input.length() == 0;
    }
}
