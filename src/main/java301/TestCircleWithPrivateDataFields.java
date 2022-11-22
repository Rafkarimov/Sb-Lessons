package main.java301;

public class TestCircleWithPrivateDataFields {
    /** Метод main */
    public static void main(String[] args) {
        // Создать круг с радиусом, равным 5
        Circle myCircle = new Circle(5.0);
        System.out.println("Площадь круга с радиусом "
                + myCircle.getRadius() + " равна " + myCircle.getArea());

        // Увеличить радиус созданного круга на 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("Площадь круга с радиусом "
                + myCircle.getRadius() + " равна " + myCircle.getArea());

        System.out.println("Количество созданных объектов равно "
                + Circle.getNumberOfObjects());
    }
}
