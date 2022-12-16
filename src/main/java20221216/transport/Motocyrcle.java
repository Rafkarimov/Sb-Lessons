package main.java20221216.transport;

public class Motocyrcle extends Vehicle implements Driving {
    @Override
    public void drive() {
        System.out.println("Я еду!");
    }

    @Override
    public void whoIsOnWheel() {
        System.out.println("За рулем - мотоциклист!");
    }
}
