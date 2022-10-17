package main.java104;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        final int SMS_PER_METER = 100; // 1 метр содержит 100 см
        double weight, heightMetr, heightSantimetr, height, bmi;

        Scanner input = new Scanner(System.in);

        // Получить вес в килограммах
        System.out.print("Введите вес в килограммах: ");
        weight = input.nextDouble();

        // Получить рост в метрах
        System.out.print("Введите рост в метрах: ");
        heightMetr = input.nextDouble();

        // Получить рост в метрах
        System.out.print("Введите рост в сантиметрах: ");
        heightSantimetr = input.nextDouble();

        //получаем рост в сантиметрах для расчета по формуле
        height = (heightMetr * 100) + heightSantimetr;

        // Вычислить BMI
        bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);

        // Отобразить и интерпретировать BMI
        System.out.println("BMI равно " + bmi);
        if (bmi < 18.5)
            System.out.println("Недостаточный вес");
        else if (bmi < 25)
            System.out.println("Норма");
        else if (bmi < 30)
            System.out.println("Избыточный вес");
        else
            System.out.println("Ожирение");
    }
}
