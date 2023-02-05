package main.java20230128.stream.task4;

import java.util.Collections;
import java.util.stream.Stream;

/*
Проверить является ли текст палиндромом.
Из исходной строки с помощью стримов убрать все символы, не являющиеся цифрой или буквой привести к нижнему регистру.
 */
public class Main {
    public static void main(String[] args) {
        String s = "qWERtY88288;';'';'yTrewQ";
        StringBuilder firstString = new StringBuilder();
        s.chars() // chars интовое представленеи каждого символа
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .forEach(firstString::appendCodePoint); // appendCodePoint переводит числа в буквы

        StringBuilder secondString = new StringBuilder(firstString).reverse();
        System.out.println(secondString.toString().equals(firstString.toString()));
    }
}
