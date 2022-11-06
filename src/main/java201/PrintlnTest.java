package main.java201;

public class PrintlnTest {
    public static void main(String[] args) {
        nPrintln("Welcome to Java!", 5);
    }

    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }
}