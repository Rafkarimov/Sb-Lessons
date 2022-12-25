package main.java401dop.testcirclewithcustomexception;

public class InvalidRadiusException extends Exception {
    private double radius;

    /** Создает исключение */
    public InvalidRadiusException(double radius) {
        super("Недопустимый радиус: " + radius);
        this.radius = radius;
    }

    /** Возвращает радиус */
    public double getRadius() {
        return radius;
    }
}
