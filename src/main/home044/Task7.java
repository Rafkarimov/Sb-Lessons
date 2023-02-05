package main.home044;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
На вход подается две строки.
Необходимо определить, можно ли уравнять эти две строки, применив только одну из трех
возможных операций:
1. Добавить символ
2. Удалить символ
3. Заменить символ

Пример:
“cat” “cats” -> true
“cat” “cut” -> true
“cat” “nut” -> false
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(canStringsBeEqualed(str1, str2));
    }

    private static boolean canStringsBeEqualed(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        int diff = Math.abs(str1.length() - str2.length());
        if (diff == 0) {
            return canReplaceLetter(str1, str2);
        } else if (diff == 1) {
            return str1.length() > str2.length()
                    ? canAddOrDeleterLetter(str1, str2)
                    : canAddOrDeleterLetter(str2, str1);
        }
        return false;
    }

    private static boolean canReplaceLetter(String str1, String str2) {
        long count = IntStream.range(0, str1.length())
                .filter(i -> str1.charAt(i) != str2.charAt(i))
                .count();
        return count == 1;
    }

//    private static boolean canAddOrDeleterLetter(String longStr, String shortStr) {
//        List<String> longList = Arrays.stream(longStr.split("")).toList();
//        List<String> shortList = Arrays.stream(shortStr.split("")).toList();
//        long count = IntStream.range(0, longStr.length())
//                .filter((int i) -> {
//                    List<String> tmp = new ArrayList<>(longList);
//                    tmp.remove(i);
//                    return tmp.equals(shortList);
//                })
//                .count();
//        return count == 1;
//    }

    private static boolean canAddOrDeleterLetter(String longStr, String shortStr) {
        List<String> longList = Arrays.stream(longStr.split("")).toList();
        List<String> shortList = Arrays.stream(shortStr.split("")).toList();
        for (int i = 0; i < longList.size(); i++) {
            List<String> tmp = Stream.concat(longList.subList(0, i).stream(), longList.subList(i + 1, longList.size())
                    .stream()).toList();
            if (tmp.equals(shortList)) {
                return true;
            }
        }
        return false;
    }
}

