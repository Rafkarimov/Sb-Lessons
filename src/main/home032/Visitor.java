package main.home032;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;

public class Visitor {
    private static final Random RANDOM = new SecureRandom(); // создаем константу для оценок рендом
    private final String name;
    private Integer id;
    private Book book;

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRating() {
        return RANDOM.nextInt(5) + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visitor visitor = (Visitor) o;
        return id.equals(visitor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", book=" + book +
                '}';
    }
}
