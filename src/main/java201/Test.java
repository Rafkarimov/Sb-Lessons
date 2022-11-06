package main.java201;

public class Test {
    public static void main(String[] args) {
        int k = 2;
        nPrint("Сообщение ", k);
        System.out.println(k);
    }


    static void nPrint(String message, int n) {
        while (n > 0) {
            System.out.print(message);
            n--;
        }
    }




}

