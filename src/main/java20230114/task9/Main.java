package main.java20230114.task9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static class Item {

    }

    static class Book extends Item {
        String name;
    }

    static class Phone extends Item {
        String model;
    }

    //PECS
    //Producer Extends, Consumer Super
    public static void copy(List<? extends Item> src, List<? super Item> dst) {
        for (Item item : src) {
            dst.add(item);
        }
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Phone> phones = new ArrayList<>();
        List<Item> items = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        copy(books, items);
        copy(phones, objects);
//        copy(books, phones); //ошибка
//        copy(items, books); //ошибка
    }
}

