package main.java302;
/*
Задание №12
Найдите первые 10 квадратных чисел, которые больше Long.MAX_VALUE. Квадратное число — число в виде Pi2 .
Например, 4, 9 и 16 являются квадратными числами.
 */

import java.math.*;

public class TestBigInteger1 {
    public static void main(String[] args) {
        final BigInteger MAXLONG = new BigInteger(Long.MAX_VALUE + "");

        // Найти такие первые k, что n^2 = k для некоторых n, так что k больше Long.MAX_VALUE
        BigInteger n = new BigInteger("" + (long) (Math.sqrt(Long.MAX_VALUE)));
        for (; n.multiply(n).compareTo(MAXLONG) < 0;
             n = n.add(BigInteger.ONE)); // n++

        for (int i = 0; i < 10; i++) {
            System.out.println(n.multiply(n));
            n = n.add(BigInteger.ONE);
        }
    }
}
