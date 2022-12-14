package main.home021;

import java.util.Scanner;

/*
(1 балл) На вход подается строка S, состоящая только из русских заглавных
букв (без Ё).
Необходимо реализовать метод, который кодирует переданную строку с
помощью азбуки Морзе и затем вывести результат на экран. Отделять коды букв
нужно пробелом.
Для удобства представлен массив с кодами Морзе ниже:
{".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.",
"...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"}

Входные данные
ПРИВЕТ

УРА
Выходные данные
.--. .-. .. .-- . -
..- .-. .-
 */
public class HomeWork06 {
    private static final String[] MORZECODE = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----",
            "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"};
    private static final String[] ALPHABET = {"А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "Й", "К", "Л", "М", "Н",
            "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"};

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(morze(s));
    }

    private static String morze(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String letter = s.substring(i, i + 1);
            for (int j = 0; j < ALPHABET.length; j++) {
                if (letter.equals(ALPHABET[j])) {
                    result += MORZECODE[j] + " ";
                    break;
                }
            }
        }
//        System.out.println(ALPHABET.length);
        return result.trim();
    }
}
