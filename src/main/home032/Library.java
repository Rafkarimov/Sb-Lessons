package main.home032;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Library {
    private final Set<Book> books; // можно добавить = new HashSet<>();
    private Integer counter = 0;

    public Library() {
        books = new HashSet<>(); // обеспечивает уникальность
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (!book.isBorrowed()) {
                    books.remove(book);
                }
                break;
            }
        }
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Set<Book> findBooksByAuthor(String author) {
        Set<Book> tmp = new HashSet<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                tmp.add(book);
            }
        }
        return tmp;
    }

    public void borrowBook(String title, Visitor visitor) {
        Book book = findBook(title);
        // реализуем проверку, 1. книга есть в библиотеке, 2. книга не одолжена посетителю, 3. что у посетителя нет книги
        if (book != null && !book.isBorrowed() && visitor.getBook() == null) {
            if (visitor.getId() == null) {
                visitor.setId(++counter);
            }
            book.setBorrowed(true);
            visitor.setBook(book);
        }
    }

    public void returnBook(Book book, Visitor visitor) {
        if (visitor.getBook().equals(book)) {
            book.setBorrowed(false);
            book.addRating(visitor.getRating()); //
            visitor.setBook(null);
        }
    }

    @Override
    public String toString() {
        return books.stream() // books создаем поток в Book в виде строки и через перенос, все это чтоб был перенос
                // по строкам
                .map(Book::toString)
                .collect(Collectors.joining("\n"));
    }
}
