package main.java20221028.regexp;
/*
   Проверить номер карты и PIN код
    На вход подается две строки: первая содержит номер карты, вторая — пинкод.
    Проверить, что первая состоит из 16 цифр,
    разделенных пробелом (вид XXXX XXXX XXXX XXXX, где X - цифра) и
    проверить, что вторая состоит из 4 цифр. Вывести true, если все ок, иначе false.

    Выход                   Выход
    12345678 n345 3994      false
    12345

    1234 5678 9123 2322     true
    1234

 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String card = scanner.nextLine();
        String pin = scanner.next();

        boolean isCardValid = card.matches("([0-9]{4} ){3}[0-9]{4}");
        boolean isPinValid = pin.matches("[\\d]{4}");

        System.out.println(isPinValid && isCardValid);
    }
}
