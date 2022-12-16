package main.java20221216.transport;

/*
Предполагается, что весь транспорт можно завести для передвижения.
Все виды транспорта умеют заводиться одинаково с ключа

 */
public abstract class Vehicle {
    //переопределить нельзя
    public final void start() {
        System.out.println("Я завелся");
    }

    public abstract void whoIsOnWheel(); //у абстрактного метода нету метода
}
