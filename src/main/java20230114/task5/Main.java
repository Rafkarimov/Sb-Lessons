package main.java20230114.task5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    //    На вход подается строка, состоящая из маленьких латинских символов.
//    Проверить, что в строке встречаются все символы английского алфавита хотя бы раз:
//    thequickbrownfoxjumpsoverthelazydog -> true
//    sdfaaaa -> false
    public static void main(String[] args) {
        System.out.println(checkString("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkString("sdfaaaa"));
    }

    public static boolean checkString(String sentence) {
        if (sentence == null || sentence.length() < 26)
            return false;
        Set<Character> set = new HashSet<>();
        for (char ch : sentence.toCharArray()) {
            set.add(ch);
        }
        if (set.size() == 26) return true;
        return false;
    }
}
