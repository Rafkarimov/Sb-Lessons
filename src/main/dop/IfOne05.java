package main.dop;

import java.util.Scanner;

/*
6.9
Трехзначное положительное число называется «четно-красивым», если каждая из его цифр - четная. Напишите класс,
который принимает с клавиатуры трехзначное число и проверяет, является ли оно «четнокрасивым». В соответствии
с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
Обратите внимание: задание имеет решение с использованием одного оператора if и без составного условия!
 */
public class IfOne05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = num / 100;
        int num2 = num / 10 % 10;
        int num3 = num % 100 % 10;
        System.out.print(num1);
        System.out.print(num2);
        System.out.println(num3);

        if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0 && num1 > 0 && num2 > 0 && num3 > 0) {
            System.out.println("Число является четнокрасивым");
        } else {
            System.out.println("Число не является четнокрасивым");
        }
    }
}
