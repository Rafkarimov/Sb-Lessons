package main.home021;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

/*
(2 балла) Создать программу генерирующую пароль.
На вход подается число N — длина желаемого пароля. Необходимо проверить,
что N >= 8, иначе вывести на экран "Пароль с N количеством символов
небезопасен" (подставить вместо N число) и предложить пользователю еще раз
ввести число N.
Если N >= 8 то сгенерировать пароль, удовлетворяющий условиям ниже и
вывести его на экран. В пароле должны быть:
● заглавные латинские символы
● строчные латинские символы
● числа
● специальные знаки(_*-)
входные данные:
8

 */
public class HomeWork11 {
    private enum SymbolType { // перечисление (enum) и задаем константы
        UPPER, LOWER, NUMBER, SYMBOL
    }

    private static final Random RANDOM = new SecureRandom();
    private static final String[] UPPERCASE = {"а", "б", "в", "г", "д", "е", "ж", "з", "и", "й", "к", "л", "м", "н",
            "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ь", "ы", "ъ", "э", "ю", "я"};
    private static final String[] LOWERCASE = {"А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "Й", "К", "Л", "М", "Н",
            "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ь", "Ы", "Ъ", "Э", "Ю", "Я"};
    private static final String[] DIGITS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    private static final String[] SYMBOLS = {"_", "*", "-"};
    private static final String[] ALLSYMBOLS = getAllSymbols();
    private static final int NUMBER_OF_PASSWORDS_TO_GENERATE = 1_000_000;

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Введите желаемую длину пароля не менее 8 символов: ");
        int n = sc.nextInt();

        while (n < 8) {
            System.out.println("Пароль с " + n + " количеством символов небезопасен");
            System.out.println("Введите длину пароля не менее 8 символов");
            n = sc.nextInt();
        }

        System.out.println(generatePassword(n)); //1 уникальный пароль
        Instant startTime = Instant.now(); //момент времени Instant именно в конкретное время
        System.out.println(isUniquePassword(n)); // 1_000_000 уникальных паролей
        Instant endTime = Instant.now();
        long totalExecutionTime = Duration.between(startTime, endTime).toSeconds();
        System.out.println("Время выполнения операции по генерации " + NUMBER_OF_PASSWORDS_TO_GENERATE + " паролей: "
                + totalExecutionTime + " секунд.");
    }

    private static String generatePassword(int n) {
        String[] arr = new String[n];
        fillSymbols(arr); // вызываем метод, в котором по 1 символу из каждого массива
        fillSymbols2(arr); //вызываем метод которые заполняет
        return String.join("", arr);
    }

    private static boolean isUniquePassword(int n) {
        Set<String> set = new HashSet<>(); //создаем уникальный массив чем интерфейс Set
        for (int i = 0; i < NUMBER_OF_PASSWORDS_TO_GENERATE; i++) {
            set.add(generatePassword(n));
        }
        System.out.println(set.size());
        return set.size() == NUMBER_OF_PASSWORDS_TO_GENERATE; // true
    }

    private static String[] getAllSymbols() {
        String[] result = Arrays.copyOf(UPPERCASE, UPPERCASE.length + LOWERCASE.length);
        System.arraycopy(LOWERCASE, 0, result, UPPERCASE.length, LOWERCASE.length);
        String[] result2 = Arrays.copyOf(result, result.length + DIGITS.length);
        System.arraycopy(DIGITS, 0, result2, result.length, DIGITS.length);
        String[] result3 = Arrays.copyOf(result2, result2.length + SYMBOLS.length);
        System.arraycopy(SYMBOLS, 0, result3, result2.length, SYMBOLS.length);
        return result3;
    }

    private static void fillSymbols2(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                int index = RANDOM.nextInt(ALLSYMBOLS.length);
                arr[i] = ALLSYMBOLS[index];
            }
        }
    }

    private static void fillSymbols(String[] arr) {
        for (SymbolType type : SymbolType.values()) {
            int index = getRandomIndex(arr);
            String str = getSymbol(type);
            arr[index] = str;
        }
    }

    private static int getRandomIndex(String[] arr) {
        while (true) {
            int idx = RANDOM.nextInt(arr.length);
            if (arr[idx] == null) {
                return idx;
            }
        }
    }

    private static String getSymbol(SymbolType type) {
        if (type == SymbolType.UPPER) {
            int index = RANDOM.nextInt(UPPERCASE.length);
            return UPPERCASE[index];
        } else if (type == SymbolType.LOWER) {
            int index = RANDOM.nextInt(LOWERCASE.length);
            return LOWERCASE[index];
        } else if (type == SymbolType.SYMBOL) {
            int index = RANDOM.nextInt(SYMBOLS.length);
            return SYMBOLS[index];
        } else {
            int index = RANDOM.nextInt(DIGITS.length);
            return DIGITS[index];
        }
    }
}
