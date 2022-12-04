package main.java303.polymorphismdemo;

public class PolymorphismDemo {
    /** Метод main */
    public static void main(String[] args) {
        // Отобразить свойства круга и прямоугольника
        displayObject(new Circle(1, "красный", false));
        displayObject(new Rectangle(1, 1, "черный", true));
    }

    /** Отображает свойства геометрического объекта */
    public static void displayObject(GeometricObject object) {
        System.out.println("Объект создан " + object.getDateCreated() +
                "\nЦвет равен " + object.getColor());
    }
}
