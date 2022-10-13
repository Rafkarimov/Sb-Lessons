package main.java102;

public class ComputeArea {
    public static void main(String[] args) {
        double radius; // радиус круга - объявление переменной
        double area; // площадь круга - объявление переменной

        // Получить радиус круга
        radius = 20; // радиус круга - присвоение значения

        // Вычислить площадь круга
        area = 3.14159 * radius * radius;

        // Отобразить площадь круга
        System.out.println("Площадь круга с радиусом " +
                radius + " равна " + area + ".");
    }
}