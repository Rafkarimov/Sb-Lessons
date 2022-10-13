package main.java103;

import java.util.Scanner; // Scanner находится в пакете java.util

import static java.lang.Math.cbrt;

public class ComputeAverageGeo {
    public static void main(String[] args) {
        double number1, number2, number3, num, average; // объявление переменных

        Scanner input = new Scanner(System.in); // создание объекта типа Scanner

        // Получить три числа
//        System.out.print("Введите три числа, разделенные пробелами: ");
        System.out.println("Введите первое число: "); //Вот так правильнее
        number1 = input.nextDouble();
        System.out.println("Введите второе число: ");
        number2 = input.nextDouble();
        System.out.println("Введите третье число: ");
        number3 = input.nextDouble();

        average = cbrt(number1 * number2 * number3); // формула среднегеометрического корня используя метод Math.cbrt

        // Отобразить среднее геометрическое трех чисел
        System.out.println("Среднее геометрическое " + number1 + " " + number2
                + " " + number3 + " равно " + average + ".");
    }
}