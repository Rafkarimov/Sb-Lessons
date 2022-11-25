package main.java20221125;
/*
Реализовать класс “Лампа”. Методы:
включить лампу
выключить лампу
получить текущее состояние
 */

public class Bulb {
    private boolean isOn;

    public void turnOn(){
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean getCurrentState () {
        return isOn;
    }
}
