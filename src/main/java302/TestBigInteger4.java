package main.java302;
/*
������� ������ 10 �����, ������� Long.MAX_VALUE, ������� ������ 5 ��� 6.
 */
import java.math.*;

public class TestBigInteger4 {
    public static void main(String[] args) {
        // bigNum ������������ Long.MAX_VALUE
        BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
        // ������ bigNum ������, ��� Long.MAX_VALUE
        bigNum = bigNum.add(BigInteger.ONE);

        int count = 1;
        while (count <= 10) {
            if (bigNum.remainder(new BigInteger("5")).equals(BigInteger.ZERO)
                    || bigNum.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
                System.out.println(bigNum);
                count++;
            }

            bigNum = bigNum.add(BigInteger.ONE);
        }
    }
}
