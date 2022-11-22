package main.java301;
/*
Программа TestPassObject показывает разницу между передачей значения примитивного типа и передачей ссылочного значения.
 */
public class TestPassObject {
    /** Метод main */
    public static void main(String[] args) {
        // Создать объект круга с радиусом, равным 1
        Circle myCircle = new Circle(1);

        // Отобразить таблицу с n радиусами и площадями
        int n = 5;
        printAreas(myCircle, n);

        // Отобразить конечные значения myCircle.radius и n
        System.out.println("\n" + "Радиус равен " + myCircle.getRadius());
        System.out.println("n равен " + n);
    }

    /** Отображает таблицу с n радиусами и площадями */
    public static void printAreas(Circle c, int times) {
        System.out.println("Радиус \t\tПлощадь");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
