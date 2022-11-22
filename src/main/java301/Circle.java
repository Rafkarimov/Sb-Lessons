package main.java301;

public class Circle {
    /** Радиус круга */
    private double radius = 1;

    /** Количество созданных объектов */
    private static int numberOfObjects = 0;

    /** Создает круг с радиусом, равным 1 */
    public Circle() {
        numberOfObjects++;
    }

    /** Создает круг с указанным радиусом */
    public Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /** Возвращает радиус */
    public double getRadius() {
        return radius;
    }

    /** Присваивает новый радиус */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /** Возвращает количество объектов */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Возвращает площадь круга */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}