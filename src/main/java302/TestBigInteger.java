package main.java302;
/*
������� �11
������� ������ 10 ����� � 50 ����������� �������, ������� ������ 2 ��� 3.
 */
import java.math.*;

public class TestBigInteger {
    public static void main(String[] args) {
        // bigNum ������������ ������ 50-������� �����
        BigInteger bigNum = new BigInteger(
                "10000000000000000000000000000000000000000000000000");

        int count = 1;
        while (count <= 10) {
            if (bigNum.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                    bigNum.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(bigNum);
                count++;
            }

            bigNum = bigNum.add(BigInteger.ONE);
        }
    }
}