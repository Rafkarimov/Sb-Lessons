package main.java20221216.transport;

public class Airship extends Vehicle implements Flying{
    @Override
    public void fly() {
        System.out.println("я дережабль, лечу медленно");
    }

    @Override
    public void whoIsOnWheel() {
        System.out.println("За рулем воздухоплаватель - Петрович!");
    }
}
