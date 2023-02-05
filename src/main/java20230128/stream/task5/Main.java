package main.java20230128.stream.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
1. Вывести все книги автора author1 и ценой > 200
2. Вывести самую дешевую книгу
3. Сохранить в Мапу <Название книги, Список оценок>
4. Сохранить Мапу <Книга, средняя оценка>
5. Сохранить список всех оценок (по всем книгам)
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("title1", "author1", 140, List.of(2, 3));
        Book book2 = new Book("title2", "author1", 275, List.of(5));
        Book book3 = new Book("title3", "author3", 1000, List.of(5, 5, 4));

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        //1
        System.out.println("Task1");
        books.stream()
                .filter(b -> "author1".equals(b.getAuthor()) && b.getPrice() > 200)
                .forEach(System.out::println);

        //2
        System.out.println("Task2");
        books.stream()
//                .min((b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()))
                .min(Comparator.comparingDouble(Book::getPrice))
                .ifPresent(System.out::println);

        //3
        System.out.println("Task3");
        books.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getRating))
                .forEach((k, v) -> System.out.println("key=" + k + " value=" + v));

        //4
        System.out.println("Task4");
        books.stream()
                .collect(Collectors.toMap(b -> b, b -> b.getRating()
                        // превратили в лист интеджеров
                        .stream()
                        //интеджер привели в дабл
                        .mapToDouble(i -> i)
                        // average - среднее
                        .average()
                        //если будет пусто возвращаем 0
                        .orElse(0D)
                ))
                .forEach((k, v) -> System.out.println("key=" + k + " value=" + v));

        //5
        System.out.println("Task5");
        List<Integer> ratingList = books.stream()
                //
                .flatMap(b -> b.getRating()
                        .stream())
                .collect(Collectors.toList());
        System.out.println(ratingList);
    }
}
