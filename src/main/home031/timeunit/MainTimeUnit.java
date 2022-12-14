package main.home031.timeunit;

/*
4.	Необходимо реализовать класс TimeUnit с функционалом, описанным ниже (необходимые поля продумать самостоятельно).
Обязательно должны быть реализованы валидации на входные параметры.
Конструкторы:
●	Возможность создать TimeUnit, задав часы, минуты и секунды.
●	Возможность создать TimeUnit, задав часы и минуты. Секунды тогда должны проставиться нулевыми.
●	Возможность создать TimeUnit, задав часы. Минуты и секунды тогда должны проставиться нулевыми.
Публичные методы:
●	Вывести на экран установленное в классе время в формате hh:mm:ss
●	Вывести на экран установленное в классе время в 12-часовом формате (используя hh:mm:ss am/pm)
●	Метод, который прибавляет переданное время к установленному в TimeUnit (на вход передаются только часы,
минуты и секунды).

 */

public class MainTimeUnit {
    public static void main(String[] args) {
        TimeUnit timeUnit = new TimeUnit(0, 0, 0);
        System.out.println(timeUnit);
        System.out.println("--------------------");
        timeUnit.addTime(0,780,0);
        System.out.println(timeUnit);
//        TimeUnit timeUnit1 = new TimeUnit(2);
//        System.out.println(timeUnit1);
//        TimeUnit timeUnit2 = new TimeUnit(1);
    }
}
