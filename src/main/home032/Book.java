package main.home032;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private final String author;
    private final String title;
    private boolean isBorrowed = false; // как лучше тут или в конструкторе
    private List<Integer> ratings = new ArrayList<>();

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

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public double getAverageRating() {
        //делаем через стримы
//        return ratings.stream()
//                .mapToInt(Integer::intValue)
//                .average().orElse(0D); // если пустой лист нет оценок - 0
        //второй вариант Через for цикл
        double sum = 0D;
        for (Integer rating : ratings) {
            sum += rating;
        }
        return Math.round((sum / ratings.size()) * 10) / 10D; // другой вид записи
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
