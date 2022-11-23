package main.java301;

/*
По примеру класса Circle, создайте класс Stock для представления акций компании. Класс Stock должен содержать:

Строковое поле данных с именем symbol для обозначения акций.
Строковое поле данных с именем name для наименования акций.
Поле данных previousClosingPrice типа double, в котором хранится стоимость акций на момент закрытия предыдущего дня.
Поле данных currentPrice типа double, в котором хранится стоимость акций в настоящий момент.
Конструктор, создающий акции с указанными обозначением и наименованием.
Метод с именем getChangePercent(), который возвращает процент изменения стоимости акций с previousClosingPrice на
currentPrice.
Нарисуйте (на бумаге или в графическом редакторе) UML-диаграмму класса Stock, а затем реализуйте этот класс. Напишите
клиент этого класса — программу, которая создает объект типа Stock с обозначением SBER, именем ПАО Сбербанк, стоимостью
 акций на момент закрытия предыдущего дня, равной 281.50. Задайте новую стоимость акций в настоящий момент, равную
 282.87, и отобразите процент изменения стоимости акций.
 */
public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("SBER", "ПАО Сбербанк");
        stock.setPreviousClosingPrice(281.50);
        // Присвоить текущую стоимость
        stock.setCurrentPrice(282.87);
        // Отобразить информацию об акциях
        System.out.println("Стоимость на момент закрытия предыдущего дня: " +
                stock.getPreviousClosingPrice());
        System.out.println("Текущая стоимость: " +
                stock.getCurrentPrice());
        System.out.println("Изменение стоимости: " +
                stock.getChangePercent() + "%");
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;

    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) /
                previousClosingPrice;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double newCurrentPrice) {
        currentPrice = newCurrentPrice;
    }

    public void setPreviousClosingPrice(double newPreviousClosingPrice) {
        previousClosingPrice = newPreviousClosingPrice;
    }
}