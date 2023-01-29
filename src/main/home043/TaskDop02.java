package main.home043;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*
Дана строка, состоящая из символов “(“, “)”, “{”, “}”, “[“, “]”
Необходимо написать метод, принимающий эту строку и выводящий результат,
является ли она правильной скобочной последовательностью или нет.
Условия для правильной скобочной последовательности те, же что и в задаче 1,
но дополнительно:
● Открывающие скобки должны быть закрыты однотипными
закрывающими скобками.
● Каждой закрывающей скобке соответствует открывающая скобка того же
типа.
Входные данные:
{()[]()}
{)(}
[}
[{(){}}][()]{}
Выходные данные:
true
false
false
true
 */
public class TaskDop02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("первый вариант решения задания: " + correctBracketSequence(input));
        System.out.println("---------------------");
        System.out.println("второй вариант решения задания: " + correctBracketSequence1(input));
    }

    private static boolean correctBracketSequence(String input) {
        while (input.contains("()") || input.contains("[]") || input.contains("{}")) {
            input = input.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        return (input.length() == 0);
    }

    private static boolean correctBracketSequence1(String input) { // второй вариант решения
        Deque<Character> deque = new LinkedList<>();
        for (char ch: input.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty()
                        && ((deque.peekFirst() == '{' && ch == '}')
                        || (deque.peekFirst() == '[' && ch == ']')
                        || (deque.peekFirst() == '(' && ch == ')'))) {
                    deque.removeFirst();
                } else {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
