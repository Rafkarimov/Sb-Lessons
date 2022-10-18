package main.java105;
/*
Чтобы считать символ из консоли, используйте метод nextLine() для считывания строки, а затем вызовите у этой строки
метод charAt(0), чтобы вернуть символ. Например, в следующей программе считывается символ с клавиатуры:
 */
import java.util.Scanner;

public class StringExample3 {
    public static void main(String[] args) {
        String s;
        char ch;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите символ: ");
        s = input.nextLine();

        ch = s.charAt(0);

        System.out.println("Введенный символ равен " + ch);
    }
}