package main.java301;

public class AlternativeCircle {
    /** Метод main */
    public static void main(String[] args) {
        // Создать круг 1 с радиусом 1
        AlternativeCircle circle1 = new AlternativeCircle();
        System.out.println("Площадь круга с радиусом "
                + circle1.radius + " равна " + circle1.getArea());

        // Создать круг 2 с радиусом 25
        AlternativeCircle circle2 = new AlternativeCircle(25);
        System.out.println("Площадь круга с радиусом "
                + circle2.radius + " равна " + circle2.getArea());

        // Создать круг 3 с радиусом 125
        AlternativeCircle circle3 = new AlternativeCircle(125);
        System.out.println("Площадь круга с радиусом "
                + circle3.radius + " равна " + circle3.getArea());

        // Изменить радиус круга
        circle2.radius = 100;
        System.out.println("Площадь круга с радиусом "
                + circle2.radius + " равна " + circle2.getArea());
    }

    double radius;

    /** Создает круг с радиусом, равным 1 */
    AlternativeCircle() {
        radius = 1;
    }

    /** Создает круг с указанным радиусом */
    AlternativeCircle(double newRadius) {
        radius = newRadius;
    }

    /** Возвращает площадь этого круга */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /** Возвращает периметр этого круга */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Присваивает новый радиус этому кругу */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
