package main.java303.castingdemo;

public class CastingDemo {
    /** Метод main */
    public static void main(String[] args) {
        // Создать и инициализировать два объекта
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1, 1);

        // Отобразить круг и прямоугольник
        displayObject(object1);
        displayObject(object2);
    }

    /** Отображает объект */
    public static void displayObject(Object object) {
        if (object instanceof Circle) {
            System.out.println("Площадь круга равна " + ((Circle)object).getArea());
            System.out.println("Диаметр круга равен " + ((Circle)object).getDiameter());
        }
        else if (object instanceof Rectangle) {
            System.out.println("Площадь прямоугольника равна " +
                    ((Rectangle)object).getArea());
        }
    }
}
