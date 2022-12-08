package main.home032;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
    public static final int MAXNUMBER = 10;

    public static Book library [] = new Book[MAXNUMBER];
    public static int currentNumber = 0;

    public static void main(String args []){
        for(;menu(););

    }

    public static boolean menu(){
        Scanner sc = new Scanner(System.in);
        int decision;
        System.out.print("\nMenu:\n" +
                "0 - Выход.\n" +
                "1 - Авторизовать пользователя.\n" +
                "2 - Регистрация нового пользователя.\n" +
                "Ваше решение: "
        );
        try{
            decision = sc.nextInt();
            if(decision < 0 || decision > 2){
                throw new InputMismatchException();
            }
        }
        catch(InputMismatchException exc){
            System.out.println("\nНеверные данные.");
            return true;
        }
        switch (decision){
            case 0:{
                System.out.println("\nВыход.");
                return false;
            }
            case 1:{
                try{
                    if(MAXNUMBER == currentNumber ){
                        throw new RuntimeException();
                    }
                    addBook(inputBook(sc));
                }
                catch(InputMismatchException exc){
                    System.out.println("\nНеверные данные.");
                }
                break;
            }
            case 2: {
                try{
                    if(MAXNUMBER == currentNumber ){
                        throw new RuntimeException();
                    }
                    addBook(inputBook(sc));
                }
                catch(InputMismatchException exc){
                    System.out.println("\nНеверные данные.");
                }
                break;
            }
        }
        return true;
    }

    public static void addBook(Book tempBook){
        library[currentNumber] = tempBook;
        ++currentNumber;
    }

    public static Book inputBook(Scanner sc){
        sc.nextLine();
        System.out.print("Автор книги: ");
        String tempAuthor = sc.nextLine();
        System.out.print("Название книги: ");
        String tempTitle = sc.nextLine();
        return new Book(tempAuthor, tempTitle);
    }

    public static void showBooks(){
        if(0 == currentNumber){
            System.out.println("\nВ библиотеке нет книг.");
        }
        else{
            System.out.println("\nСписок книг:");
            for(int i = 0; i < currentNumber; ++i){
                System.out.println(library[i]);
            }
        }
    }
}
