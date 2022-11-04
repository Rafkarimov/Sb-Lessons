package main.java20221104;

import java.util.Scanner;

/*
 Пользователь вводит символ.
    Повторять ввод до тех пор, пока не будет введена цифра.
    Вывести “Отлично”, когда ввели цифру.

 */
public class Task09 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        //через сравнение
//        char c;
//
//        do {
//            System.out.println("Введите цифру");
//            c = sc.next().charAt(0);
//        } while (c < '0' || c > '9');
//        System.out.println("Отлично");

        //Через регульные выражения

        String s;
        do{
            System.out.println("Введите цифру");
            s = sc.next();
        }while (!s.matches("[0-9]"));

        //priver
        //[0-9] только для p - первый символ
    }

}
