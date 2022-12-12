package main.java20221209;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW"));
        cars.add(new Car("Volvo"));
        cars.add(new Car("Honda"));

        for (Car car: cars) {
            System.out.println(car.getModel());
        }
        //cars.forEach(car -> {
        //System.out.println(car.getModel());
        //});

        //System.out.println(cars.get(0).getModel());
        cars.remove(cars.size() - 1);
        cars.forEach(car -> System.out.println(car.getModel()));
        System.out.println(cars.contains(new Car("BMW")));

        //Сортируем список
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        });
        //Сортируем список
        Collections.sort(cars, (((o1, o2) -> o1.getModel().compareTo(o2.getModel()))));
    }
}
