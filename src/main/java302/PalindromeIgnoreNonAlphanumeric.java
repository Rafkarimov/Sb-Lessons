package main.java302;
/*
Напишите новую программу, которая игнорирует не буквенно-цифровые символы при проверке строки на палиндром.

Далее приведены шаги по решению этой задачи.

Очистите строку от не буквенно-цифровых символов. Это можно сделать, создав пустую строку типа StringBuilder,
 добавив каждый буквенно-цифровой символ строки в строку типа StringBuilder и вернув строку из нее. Чтобы проверить,
 является ли символ ch буквой или цифрой, можно использовать метод isLetterOrDigit(ch) класса Character.
Получите новую строку, которая является обратной (реверсированной) к очищенной. Сравните обратную строку с очищенной
с помощью метода equals().
 */
import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    /** Метод main */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Получить (от пользователя) строку
        System.out.print("Введите строку: ");
        String s = input.nextLine();

        // Отобразить результат
        System.out.println("Игнорируя не буквенно-цифровые символы, \n"
                + "является ли «" + s + "» палиндромом? " + isPalindrome(s));
    }

    /** Возвращает true, если строка является палиндромом */
    public static boolean isPalindrome(String s) {
        // Создать новую строку, удалив не буквенно-цифровые символы
        String s1 = filter(s);

        // Создать новую строку, являющейся обратной строке s1
        String s2 = reverse(s1);

        // Сравнить, совпадает ли исходная строка с обратной
        return s2.equals(s1);
    }

    /** Создает новую строку, удаляя не буквенно-цифровые символы */
    public static String filter(String s) {
        // Создать объект типа StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // Проверить каждый символ в строке для пропуска буквенно-цифрового
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }

        // Вернуть новую отфильтрованную строку
        return stringBuilder.toString();
    }

    /** Создает новую строку, являющейся обратной указанной */
    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse(); // вызывает метод reverse() класса StringBuilder
        return stringBuilder.toString();
    }
}
