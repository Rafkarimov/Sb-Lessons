package main.java20221125;
/*
Реализовать класс “Лампа”. Методы:
включить лампу
выключить лампу
получить текущее состояние
 */

import main.java20221209.logger.Logger;

public class Bulb {
    private Logger logger;

    private boolean isOn;

    public Bulb (Logger logger) {
        this.logger = logger;
    }

    public void turnOn(){
        isOn = true;
        logger.log("Bulb is on\n");
    }

    public void turnOff(){
        isOn = false;
        logger.log("Bulb is off\n");
    }

    public boolean getCurrentState(){
        logger.log("Getting information about bulb " + isOn + "\n");
        return isOn;
    }

}
