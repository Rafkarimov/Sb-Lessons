package main.java301;

/*
Задание №1: Класс Rectangle
По примеру класса Circle, создайте класс Rectangle для представления прямоугольника. Класс Rectangle должен содержать:

Два поля данных типа double с именами width и height, задающими ширину и высоту прямоугольника. Значение по умолчанию: -1 как для ширины, так и для высоты.
Безаргументный конструктор, создающий прямоугольник с указанными по умолчанию значениями.
Конструктор, создающий прямоугольник с указанными шириной и высотой.
Метод с именем getArea(), возвращающий площадь этого прямоугольника.
Метод с именем getPerimeter(), возвращающий периметр.
Нарисуйте (на бумаге или в графическом редакторе) UML-диаграмму класса Rectangle, а затем реализуйте этот класс.
Напишите клиент этого класса — программу, которая создает два объекта типа Rectangle: первый — с шириной 4 и высотой 40,
 а второй - с шириной 3.5 и высотой 35.9. Программа также должна отображать ширину, высоту, площадь и периметр
 каждого прямоугольника в указанном порядке.
 */
public class Rectangle {
    double width = -1;
    double height = -1;
    public Rectangle(double width, double height) {
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        Rectangle rectangle1 = new Rectangle(4, 40);
    }
    public static void main(String[] args) {


        System.out.println("Ширина 1 прямоугольника равна: " + rectangle1.width +
                "Высота 1 прямоугольника равна: " + rectangle1.height +
                "Площадь 1 прямоугольника равна: " + rectangle1.getArea(width, height) +
                "Периметр 1 прямоугольника равна: " + rectangle1.getPerimeter(width, height));
        System.out.println("Ширина 2 прямоугольника равна: " + rectangle2.width +
                "Высота 2 прямоугольника равна: " + rectangle2.height +
                "Площадь 2 прямоугольника равна: " + rectangle2.getArea(width, height) +
                "Периметр 2 прямоугольника равна: " + rectangle2.getPerimeter(width, height));
    }


    private double getArea(double width, double height) {
        return width * height;
    }

    private double getPerimeter(double width, double height) {
        return 2 * (width + height);
    }
}


