package main.home012;

import java.util.Scanner;

/*
1 балл) За каждый год работы Петя получает на ревью оценку. На вход подаются оценки Пети за последние три года
(три целых положительных числа).
Если последовательность оценок строго монотонно убывает, то вывести "Петя, пора трудиться"
В остальных случаях вывести "Петя молодец!"
Входные данные:
10 5 2
4 20 15
5 5 5
Выходные данные:
Петя, пора трудиться
Петя молодец!
Петя молодец!
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estimation1 = scanner.nextInt();
        int estimation2 = scanner.nextInt();
        int estimation3 = scanner.nextInt();

        if (estimation1 > estimation2 && estimation2 > estimation3) {
            System.out.println("Петя, пора трудиться");
        } else {
            System.out.println("Петя молодец!");
        }
    }
}
