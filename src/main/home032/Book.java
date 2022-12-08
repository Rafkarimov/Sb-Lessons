package main.home032;
/*
Реализовать программу по ведению лог файла. Принимаем сведения из файла "listOfBook"
 */
public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
