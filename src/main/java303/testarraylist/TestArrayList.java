package main.java303.testarraylist;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // Создать список для хранения городов
        ArrayList<String> cityList = new ArrayList<>();

        // Добавить в список несколько городов
        cityList.add("Лондон");
        // cityList теперь содержит [Лондон]
        cityList.add("Москва");
        // cityList теперь содержит [Лондон, Москва]
        cityList.add("Париж");
        // cityList теперь содержит [Лондон, Москва, Париж]
        cityList.add("Майами");
        // cityList теперь содержит [Лондон, Москва, Париж, Майами]
        cityList.add("Сеул");
        // cityList теперь содержит [Лондон, Москва, Париж, Майами, Сеул]
        cityList.add("Токио");
        // cityList теперь содержит [Лондон, Москва, Париж, Майами, Сеул, Токио]

        System.out.println("Какой размер списка? " + cityList.size());
        System.out.println("Находится ли в списке Майами? " +
                cityList.contains("Майами"));
        System.out.println("Какая позиция в списке у Москвы? "
                + cityList.indexOf("Москва"));
        System.out.println("Список пустой? " +
                cityList.isEmpty()); // отображается false

        // Вставить новый город с индексом 2
        cityList.add(2, "Сиань");
        // cityList теперь содержит [Лондон, Москва, Сиань, Париж, Майами, Сеул, Токио]

        // Удалить город из списка
        cityList.remove("Майами");
        // cityList теперь содержит [Лондон, Москва, Сиань, Париж, Сеул, Токио]

        // Удалить город с индексом 1
        cityList.remove(1);
        // cityList теперь содержит [Лондон, Сиань, Париж, Сеул, Токио]

        // Отобразить содержимое списка
        System.out.println(cityList.toString());

        // Отобразить содержимое списка в обратном порядке
        for (int i = cityList.size() - 1; i >= 0; i--)
            System.out.print(cityList.get(i) + " ");
        System.out.println();

        // Создать список для хранения двух кругов
        ArrayList<Circle> list = new ArrayList<>();

        // Добавить два круга
        list.add(new Circle(2));
        list.add(new Circle(3));

        // Отобразить площадь первого в списке круга
        System.out.println("Чему равна площадь круга? " +
                list.get(0).getArea());
    }
}
