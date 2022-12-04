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
public class MainAtm {
    public static void main(String[] args) {
        Atm atm = new Atm(BigDecimal.valueOf(0.02), BigDecimal.valueOf(61.77));
        System.out.println(atm.getCounter());
        System.out.println(atm.convertDollarToRubles(new BigDecimal(1000)) + " рублей");
        System.out.println(atm.convertRubleToDollar(new BigDecimal(1000)) + " долларов");

        for (int i = 0; i < 10; i++) {
            atm = new Atm(BigDecimal.valueOf(0.02), BigDecimal.valueOf(61.77));
        }
        System.out.println(atm.getCounter());
    }
}
