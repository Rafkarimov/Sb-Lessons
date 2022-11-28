package main.java302;

public class Test1 {
    public static void main(String[] args) {
        java.math.BigInteger x = new java.math.BigInteger("3");
        java.math.BigInteger y = new java.math.BigInteger("7");
        java.math.BigInteger z = x.add(y);
        System.out.println("x равно " + x);
        System.out.println("y равно " + y);
        System.out.println("z равно " + z);
    }
}