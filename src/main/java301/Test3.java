package main.java301;

public class Test3 {
    private static int i = 0;
    private static int j = 0;
    public static void main(String[] args) {
        int i = 2;
        int k = 3;
        {
            int j = 3;
            System.out.println("i + j равно " + i + j);
        }
        k = i + j;
        System.out.println("k равно " + k);
        System.out.println("j равно " + j);
    }
}
