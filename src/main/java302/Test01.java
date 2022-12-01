package main.java302;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test01 {
    public static void main(String[] args) {
        StringBuilder strBuf = new  StringBuilder("ABCDEFG");
        strBuf.insert(3, "RRRRR");
        System.out.println(strBuf);
    }
}

