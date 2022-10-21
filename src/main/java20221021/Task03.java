package main.java20221021;

import java.util.Scanner;

/*
Задача 3
В гостинице “Астория” есть три типа номера и их стоимость за одну ночь:
● 1 - VIP (125 рублей)
● 2 - Premium (110 рублей)
● 3 - Standart (100 рублей)
На вход подается целое число roomType - тип номера. Вывести на экран стоимость
номера за одну ночь.
Вход Выход
1 Номер VIP: 125 рублей
2 Номер Premium: 110 рублей
3 Номер Standart: 100 рублей
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomType = scanner.nextInt();

        switch (roomType) {
            case 1:
                System.out.println("Номер VIP: 125 рублей");
                break;
            case 2:
                System.out.println("Номер Premium: 110 рублей");
                break;
            case 3:
                System.out.println("Номер Standart: 100 рублей");
                break;
            default:
                System.out.println("Такого номера не существует");
        }
    }
}
