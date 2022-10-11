package main.java;

import java.util.Scanner; // класс Scanner находится в пакете java.util package

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159; // число Пи

        double radius; // радиус круга
        double area; // площадь круга

        Scanner input = new Scanner(System.in);

        // Получить радиус круга
        System.out.print("Введите радиус круга: ");
        radius = input.nextDouble();

        // Вычислить площадь круга
        area = PI * radius * radius;

        // Отобразить площадь круга
        System.out.println("Площадь круга с радиусом " +
                radius + " равна " + area + ".");
    }
}
