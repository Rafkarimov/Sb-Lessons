package main.java20221209.logger;

import main.java20221125.Bulb;

public class Main {
    public static void main(String[] args) {
//        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLoggerTxt fileLoggerTxt = new FileLoggerTxt("bulblog");

        Logger csvFileLogger = new FileLoggerCsv("csvBilt");
//        ((FileLoggerCsv)csvFileLogger).getFileExtension(); внутри интерфесса лог есть только лог, привели к FileLoggerCsv

        Bulb bult = new Bulb(csvFileLogger);
        bult.turnOn();
        bult.getCurrentState();
        bult.turnOff();
        bult.getCurrentState();
    }
}
