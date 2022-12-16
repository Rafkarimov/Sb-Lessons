package main.java20221216.transport;

import main.java20221216.student.Aspirant;

/*
Рассматриваются следующие виды транспорта:
Машина (Сar)
Мотоцикл (Motorcycle)
Самолет (Airplane)
Дирижабль (Аirship)

Предполагается, что весь транспорт можно завести для передвижения.
Все виды транспорта умеют заводиться одинаково с ключа

У разных видов транспорта разные водители
whoIsOnWheel - метод возвращающий того кто управляет этим транспортом

Помимо этого бывают некоторые особенности, касающиеся передвижения.
Те которые летают (Flying) и те которые ездят (Driving)
Но! Мотоцикл ездит быстрее машины, а дирижабль летает медленнее самолета

 */
public class MainTransport {
    public static void main(String[] args) {
        Car.Beep();

        Car car = new Car();
        Motocyrcle motocyrcle = new Motocyrcle();
        Aiplan aiplan = new Aiplan();
        Airship airship = new Airship();

        car.start();
        motocyrcle.start();
        aiplan.start();
        airship.start();

        car.whoIsOnWheel();
        motocyrcle.whoIsOnWheel();
        aiplan.whoIsOnWheel();
        airship.whoIsOnWheel();

        car.drive();
        motocyrcle.drive();
        aiplan.fly();
        airship.fly();
    }

}
