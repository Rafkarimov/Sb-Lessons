package main.java20230128.stream.task5;

import java.util.List;
import java.util.Objects;

public class Book {
    public String title;
    public String author;
    public double price;
    public List<Integer> rating;

    public Book(String title, String author, double price, List<Integer> rating) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Integer> getRating() {
        return rating;
    }

    public void setRating(List<Integer> rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) && Objects.equals(rating, book.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, rating);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
