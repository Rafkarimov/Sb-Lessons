//package main.java301;
///*
//Программа TestCircleWithStaticMembers показывает, как использовать переменные экземпляра, методы экземпляра,
//статические переменные и методы, а также показывает результаты их использования.
// */
//public class TestCircleWithStaticMembers {
//    /** Метод main */
//    public static void main(String[] args) {
//        System.out.println("До создания объектов");
//        System.out.println("Кол-во объектов типа Circle равно " +
//                Circle.numberOfObjects);
//
//        // Создать c1
//        Circle c1 = new Circle();
//
//        // Отобразить c1 ДО создания c2
//        System.out.println("\nПосле создания c1");
//        System.out.println("c1: радиус (" + c1.radius +
//                ") и количество объектов типа Circle (" +
//                c1.numberOfObjects + ")");
//
//        // Создать c2
//        Circle c2 = new Circle(5);
//
//        // Изменить c1
//        c1.radius = 9;
//
//        // Отобразить c1 и c2 ПОСЛЕ создания c2
//        System.out.println("\nПосле создания c2 и изменения c1");
//        System.out.println("c1: радиус (" + c1.radius +
//                ") и количество объектов типа Circle (" +
//                c1.numberOfObjects + ")");
//        System.out.println("c2: радиус (" + c2.radius +
//                ") и количество объектов типа Circle (" +
//                c2.numberOfObjects + ")");
//    }
//}
