package main.java20221216.transport;

public class Car extends Vehicle implements Driving {
    public static void Beep() { // без экземпляра объекта
        System.out.println("BEEP!");
    }

    @Override
    public void drive() {
        System.out.println("Я еду!");
    }

    @Override
    public void whoIsOnWheel() {
        System.out.println("За рулем - водитель!");
    }
}
