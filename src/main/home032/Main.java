package main.home032;

public class Main {
    public static void main(String[] args) {
        //создаем библиотеку
        Library library = new Library();
        Book book1 = new Book("Александр Дюма", "Граф Монте-Кристо");
        Book book2 = new Book("Михаил Булгаков", "Записки юнного врача (сборник)");
        Book book3 = new Book("Эрих Мария Ремарк", "Время жить и время умирать");
        Book book4 = new Book("Александр Дюма", "Три мушкетера");
        Book book5 = new Book("Теодор Драйзер", "Американская трагедия");

        Visitor visitor1 = new Visitor("Васюха");
        Visitor visitor2 = new Visitor("Мишанька");

        //
        library.addBook(book1); //
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        System.out.println("Библиотека из 5 книг\n" + library);
        System.out.println();
        library.deleteBook("Американская трагедия");
        System.out.println("Библиотека из 4 книг\n" + library); // Добавить вариант с get


        System.out.println();
        System.out.println(library.findBook("Граф Монте-Кристо")); // правильный
        System.out.println(library.findBook("Граф Монте-Кристо2")); // неправильный

        System.out.println();
        System.out.println(library.findBooksByAuthor("Александр Дюма"));

        System.out.println();
        System.out.println(book1);
        System.out.println(visitor1);
        library.borrowBook("Граф Монте-Кристо", visitor1);
        System.out.println();
        System.out.println(book1);
        System.out.println(visitor1);
        System.out.println();
        library.borrowBook("Граф Монте-Кристо", visitor2);
        System.out.println(book1);
        System.out.println(visitor1 + "\n" + visitor2);
        System.out.println();
//        library.borrowBook("Американская трагедия", visitor2); //не получил книгу
//        System.out.println(visitor2);
        library.borrowBook("Три мушкетера", visitor2);
        System.out.println(visitor2);
        System.out.println();
        library.returnBook(book1, visitor1);
        System.out.println(book1);
        System.out.println(visitor1);

        System.out.println("--------------------------------------------------");
        //доп задание среднее арифметическое
        for (int i = 0; i < 10; i++) {
            library.borrowBook("Граф Монте-Кристо", visitor1);
            library.returnBook(book1, visitor1);
        }
//        System.out.printf("%.1f", book1.getAverageRating());
        //второй вариант
        System.out.println(book1.getAverageRating());

    }
//    private static void addBooks(Library library){
//
//    }
}
