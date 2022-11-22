package main.java301;
/*
В программе TestPassingCircleObjects методу printCircle() в качестве аргумента передается объект myCircle:
 */
public class TestPassingCircleObjects {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        printCircle(myCircle);
    }

    public static void printCircle(Circle c) {
        System.out.println("Площадь круга с радиусом "
                + c.getRadius() + " равна " + c.getArea());
    }
}
