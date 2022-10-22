package main.home01;

import java.util.Scanner;

/*
На вход подается бюджет мероприятия – n тугриков. Бюджет на одного гостя – k
тугриков. Вычислите и выведите, сколько гостей можно пригласить на
мероприятие
вводные данные:
14185 72
85177 89
выходные данные:
197 957
 */
public class homeWork09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int guest = n / k;
        System.out.println(guest);
    }
}
