package main.java302;
/*
������� �12
������� ������ 10 ���������� �����, ������� ������ Long.MAX_VALUE. ���������� ����� � ����� � ���� Pi2 .
��������, 4, 9 � 16 �������� ����������� �������.
 */

import java.math.*;

public class TestBigInteger1 {
    public static void main(String[] args) {
        final BigInteger MAXLONG = new BigInteger(Long.MAX_VALUE + "");

        // ����� ����� ������ k, ��� n^2 = k ��� ��������� n, ��� ��� k ������ Long.MAX_VALUE
        BigInteger n = new BigInteger("" + (long) (Math.sqrt(Long.MAX_VALUE)));
        for (; n.multiply(n).compareTo(MAXLONG) < 0;
             n = n.add(BigInteger.ONE)); // n++

        for (int i = 0; i < 10; i++) {
            System.out.println(n.multiply(n));
            n = n.add(BigInteger.ONE);
        }
    }
}
