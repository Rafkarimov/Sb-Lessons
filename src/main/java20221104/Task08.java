package main.java20221104;

import java.util.Scanner;

/*
 Запросить у пользователя число строго больше 0.
    Повторять ввод до тех пор, пока не будет введено корректное число.
    Вывести “Отлично”, когда ввели корректное число.

 */
public class Task08 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Введите положительное число больше 0: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Введите положительное число больше 0: ");
            n = sc.nextInt();
        }
        System.out.println("Отлично");
    }
}
