package main.java20230114.task10;

import java.util.Objects;

public class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (title == null ? 0 : title.hashCode());
        hash = 31 * hash + (author == null ? 0 : author.hashCode());
        return hash;
    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(title, author);
//    }

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Book person = (Book) o;
        // field comparison
        return Objects.equals(title, person.title)
                && Objects.equals(author, person.author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

