package main.java20221227;

public class MyArithmeticException extends ArithmeticException {

    public MyArithmeticException() {
        super("Do not divide by 0");
    }

    public MyArithmeticException(String message) {
        super(message);
    }
}

