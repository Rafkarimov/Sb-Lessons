package main.home011;

import java.util.Scanner;

/*
На вход подается количество километров count. Переведите километры в мили
(1 миля = 1,60934 км) и выведите количество миль.
Входные данные:
7 143
Выходные данные:
4.349609156548647 88.85630134092237
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double mile = count / 1.60934;

        System.out.println(mile);
    }
}
