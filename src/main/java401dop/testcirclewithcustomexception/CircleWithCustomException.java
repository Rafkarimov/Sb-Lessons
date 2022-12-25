package main.java401dop.testcirclewithcustomexception;

import main.java401dop.testcirclewithcustomexception.InvalidRadiusException;

public class CircleWithCustomException {
    /** Радиус круга */
    private double radius;

    /** Количество созданных объектов */
    private static int numberOfObjects = 0;

    /** Создает круг с радиусом, равным 1 */
    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }

    /**  Создает круг с указанным радиусом */
    public CircleWithCustomException(double newRadius)
            throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
    }

    /** Возвращает радиус */
    public double getRadius() {
        return radius;
    }

    /** Присваивает новый радиус */
    public void setRadius(double newRadius)
            throws InvalidRadiusException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }

    /** Возвращает numberOfObjects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Возвращает площадь круга */
    public double findArea() {
        return radius * radius * 3.14159;
    }
}