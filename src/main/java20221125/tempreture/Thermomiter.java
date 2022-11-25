package main.java20221125.tempreture;
/*
Реализовать класс “Термометр”.
Необходимо иметь возможность создавать экземпляр
класса с текущей температурой и получать значение
в фаренгейте и в цельсии.
 */

public class Thermomiter {
    private double tempCelsius; // изготовленеи полей
    private double tempFahrenheit; // изготовленеи полей

    public Thermomiter(double currentTemp, String tempType) {
        // C - цельсий. F - фаренгейт.
        if (tempType.equals("C")) {
            this.tempCelsius = currentTemp;
            this.tempFahrenheit = convertCelsiusToFahrenheit(currentTemp);
        } else if (tempType.equals("F")) {
            this.tempFahrenheit = currentTemp;
            this.tempCelsius = convertFahrenheitToCelsius(currentTemp);
        } else {
            System.out.println("Не правильный ввод");
        }
    }

    public double getTempCelsius() {
        return tempCelsius;
    }

    public double getTempFahrenheit() {
        return tempFahrenheit;
    }

    private double convertCelsiusToFahrenheit(double currentTemp) {
        return currentTemp * 1.8 + 32;
    }

    private double convertFahrenheitToCelsius(double currentTemp) {
        return (currentTemp - 32) / 1.8;
    }

    public Thermomiter(double currentTemp, TempType tempType) {
        if (tempType.equals(TempType.CELSIUS)) {
            tempCelsius = currentTemp;
            tempFahrenheit = convertCelsiusToFahrenheit(currentTemp);
        } else if (tempType.equals(TempType.FAHRENHEIT)) {
            tempFahrenheit = currentTemp;
            tempCelsius = convertFahrenheitToCelsius(currentTemp);
        }
    }
}
