package main.java20221216.transport;

public class Aiplan extends Vehicle implements Flying {
    @Override
    public void fly() {
        System.out.println("Я самолет лечу быстро");
    }

    @Override
    public void whoIsOnWheel() {
        System.out.println("За штурвалом - пилот");
    }
}
