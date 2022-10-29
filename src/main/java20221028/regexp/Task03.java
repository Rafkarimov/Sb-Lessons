package main.java20221028.regexp;
/*
   Best Interview Ever
    Запросить у пользователя имя, день рождения, номер телефона, email.
    Каждое из полученных ответов проверить регулярным выражением по описанным ниже правилам.
    Если все введено верно, вывести “Ok”.
    Если хотя бы одно из полей не соответствует - вывести “Wrong Answer” и завершить работу программы.

    Проверки:
    Имя
    Должно содержать только буквы. Начинаться с заглавной буквы и далее только прописные. От 2 до 20 символов.
    День рождения
    Должно иметь вид DD.MM.YYYY (DD, MM, YYYY - цифры, без ограничений)
    Номер телефона
    Должно начинаться со знака +, далее ровно 11 цифр.
    Email
    В начале идут прописные буквы или цифры или один из спец. символов _ - * .
    Далее обязательно символ @
    Далее прописные буквы или цифры
    Далее точка
    Далее “com” или “ru”

 */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String berdsday = scanner.next();
        String phoneNumber = scanner.next();
        String mail = scanner.next();

        System.out.println(name.matches("[A-ZА-Я][a-zа-я]{1,19}"));
        System.out.println(berdsday.matches("[0-9]{2}\\.\\d{2}\\.\\d{4}"));
        System.out.println(phoneNumber.matches("\\+[0-9]{11}"));
        System.out.println(mail.matches("[A-Za-z0-9\\-*._]+@[a-z0-9]+\\.(com|ru)")); // квантификатор + один и более раз до собаки

    }
}

