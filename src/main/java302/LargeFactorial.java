package main.java302;

import java.util.Scanner;
import java.math.*;

public class LargeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("������� ����� �����: ");
        int n = input.nextInt();
        System.out.println(n + "! ����� " + factorial(n));
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE; // result ������������� 1
        for (int i = 1; i <= n; i++) // ����������� i
            result = result.multiply(new BigInteger(i + ""));

        return result;
    }
}