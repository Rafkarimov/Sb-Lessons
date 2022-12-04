package main.home031.atm;

import java.math.BigDecimal;

/*
8.	Реализовать класс “банкомат” Atm.
Класс должен:
●	Содержать конструктор, позволяющий задать курс валют перевода долларов в рубли и курс валют перевода рублей
в доллары (можно выбрать и задать любые положительные значения)
●	Содержать два публичных метода, которые позволяют переводить переданную сумму рублей в доллары и долларов
в рубли
●	Хранить приватную переменную счетчик — количество созданных инстансов класса Atm и публичный метод, возвращающий
этот счетчик (подсказка: реализуется через static)

 */
public class Atm {
    private static int counter = 0;
    private final BigDecimal rubleToDollarExchangeRate; // 1 рубль = 0.02 доллар
    private final BigDecimal dollarToRublesExchangeRate; // 1 доллар = 61.77 рублей

    {
        ++counter; //если статический запускается один раз
    }

    public Atm(BigDecimal rubleToDollarExchangeRate, BigDecimal dollarToRublesExchangeRate) {
        this.rubleToDollarExchangeRate = rubleToDollarExchangeRate;
        this.dollarToRublesExchangeRate = dollarToRublesExchangeRate;
//        ++counter; // обычный вариант
    }

    public BigDecimal convertRubleToDollar(BigDecimal amount) {
        return amount.multiply(rubleToDollarExchangeRate);
    }

    public BigDecimal convertDollarToRubles(BigDecimal amount) {
        return amount.multiply(dollarToRublesExchangeRate);
    }

    public int getCounter() {
        return counter;
    }
}
