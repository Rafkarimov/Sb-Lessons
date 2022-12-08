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
                "0 - �����.\n" +
                "1 - ������������ ������������.\n" +
                "2 - ����������� ������ ������������.\n" +
                "���� �������: "
        );
        try{
            decision = sc.nextInt();
            if(decision < 0 || decision > 2){
                throw new InputMismatchException();
            }
        }
        catch(InputMismatchException exc){
            System.out.println("\n�������� ������.");
            return true;
        }
        switch (decision){
            case 0:{
                System.out.println("\n�����.");
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
                    System.out.println("\n�������� ������.");
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
                    System.out.println("\n�������� ������.");
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
        System.out.print("����� �����: ");
        String tempAuthor = sc.nextLine();
        System.out.print("�������� �����: ");
        String tempTitle = sc.nextLine();
        return new Book(tempAuthor, tempTitle);
    }

    public static void showBooks(){
        if(0 == currentNumber){
            System.out.println("\n� ���������� ��� ����.");
        }
        else{
            System.out.println("\n������ ����:");
            for(int i = 0; i < currentNumber; ++i){
                System.out.println(library[i]);
            }
        }
    }
}
