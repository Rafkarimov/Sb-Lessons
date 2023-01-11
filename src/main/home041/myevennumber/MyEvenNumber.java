package main.home041.myevennumber;

/*
Создать класс MyEvenNumber, который хранит четное число int n. Используя
исключения, запретить создание инстанса MyPrimeNumber с нечетным числом.
 */
public class MyEvenNumber {
    private final int n;

    public MyEvenNumber(int n) throws MyEvenNumberException {
        if (n % 2 != 0) {
            throw new MyEvenNumberException("Запрещено создавать MyPrimeNumber с нечетным числом");
        }
        this.n = n;
    }

    static class MyEvenNumberException extends Exception {
        public MyEvenNumberException(String message) {
            super(message);
        }
    }
}
