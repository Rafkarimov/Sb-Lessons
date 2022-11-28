package main.java302;

/*
—оздайте класс с именем MyInteger, который должен содержать:

ѕоле данных value типа int, в котором хранитс€ целочисленное значение, представленное этим объектом.
 онструктор, который создает объект типа MyInteger дл€ указанного значени€ типа int.
Getter-метод, который возвращает значение типа int.
ћетоды isEven(), isOdd() и isPrime(), которые возвращают значение true, если значение типа int в этом объекте €вл€етс€
четным, нечетным или простым соответственно.
—татические методы isEven(int), isOdd(int) и isPrime(int), которые возвращают значение true, если указанное значение
€вл€етс€ четным, нечетным или простым соответственно.
—татические методы isEven(MyInteger), isOdd(MyInteger) и isPrime(MyInteger), которые возвращают значение true,
если указанное значение €вл€етс€ четным, нечетным или простым соответственно.
ћетоды equals(int) и equals(MyInteger), которые возвращают значение true, если значение типа int в этом объекте
равн€етс€ указанному значению.
—татический метод parseInt(char[]), который преобразует массив числовых символов в значение типа int.
—татический метод parseInt(String), который преобразует строку в значение типа int.
Ќарисуйте UML-диаграмму класса MyInteger, а затем реализуйте этот класс. Ќапишите клиент этого класса Ч программу,
котора€ провер€ет все методы этого класса.
 */
public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 четное? " + n1.isEven());
        System.out.println("n1 простое? " + n1.isPrime());
        System.out.println("15 простое? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 нечетное? " + n2.isOdd());
        System.out.println("45 нечетное? " + MyInteger.isOdd(45));
        System.out.println("n1 равно n2? " + n1.equals(n2));
        System.out.println("n1 равно 5? " + n1.equals(5));
    }
}

class MyInteger {
    private int value;

    public int getValue() {
        return value;
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isPrime(int num) {
        if ((num == 1) || (num == 2)) {
            return true;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime(MyInteger o) {
        return isPrime(o.getValue());
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isEven(MyInteger n) {
        return isEven(n.getValue());
    }

    public boolean equals(int anotherNum) {
        return value == anotherNum;
    }

    public boolean equals(MyInteger o) {
        return value == o.getValue();
    }

    public static int parseInt(char[] numbers) {
        // numbers состоит из символов цифр.
        // Ќапример, если numbers равно {'1', '2', '5'}, то возвращаемое значение
        // должно быть равным 125. ќбратите внимание, что
        // numbers[0] равно '1'
        // numbers[1] равно '2'
        // numbers[2] равно '5'

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result * 10 + (numbers[i] - '0');
        }

        return result;
    }

    public static int parseInt(String s) {
        // s состоит из символов цифр.
        // Ќапример, если s равно "125", то возвращаемое значение
        // должно быть равным 125.
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }

        return result;
    }
}

