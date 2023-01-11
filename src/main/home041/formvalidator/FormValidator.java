package main.home041.formvalidator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Arrays;

/*
Фронт со своей стороны не сделал обработку входных данных анкеты! Петя
очень зол и ему придется написать свои проверки, а также кидать исключения,
если проверка провалилась. Помогите Пете написать класс FormValidator со
статическими методами проверки. На вход всем методам подается String str.
a. public void checkName(String str) — длина имени должна быть от 2 до 20
символов, первая буква заглавная.
b. public void checkBirthdate(String str) — дата рождения должна быть не
раньше 01.01.1900 и не позже текущей даты.
c. public void checkGender(String str) — пол должен корректно матчится в
enum Gender, хранящий Male и Female значения.
d. public void checkHeight(String str) — рост должен быть положительным
числом и корректно конвертироваться в double.
 */
public class FormValidator {
    public static void checkName(String str) throws FormValidatorCheckNameCheckException {
        if (!str.matches("^[A-Z][a-z]{1,19}$")) {
            throw new FormValidatorCheckNameCheckException("длина имени должна быть от 2 до 20 " +
                    "символов, первая буква заглавная");
        }
    }

    public static void checkBirthdate(String birthDateAsString) throws FormValidatorCheckBirthdateCheckException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate birthDate;
        try {
            birthDate = LocalDate.parse(birthDateAsString, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Неверная дата: " + birthDateAsString);
            return;
        }
        LocalDate checkDate = LocalDate.of(1900, 1, 1);
        if (birthDate.isBefore(checkDate) || birthDate.isAfter(LocalDate.now())) {
            throw new FormValidatorCheckBirthdateCheckException("Неверная дата рождения: " + birthDateAsString +
                    ". Дата рождения должна быть не раньше 01.01.1900 и не позже текущей даты");
        }
    }

    public static void checkGender(String gender) throws FormValidatorCheckGenderCheckException {
        Arrays.stream(Gender.values())
                .filter(tmpGender -> gender.equals(tmpGender.name()))
                .findFirst().orElseThrow(() -> new FormValidatorCheckGenderCheckException("Неверный пол: " + gender +
                        ". Enum Gender должен содержать в себе пол, хранящий MALE и FEMALE значения"));
    }

    public static void checkHeight(String height) throws FormValidatorCheckHeightCheckException {
        try {
            double convertedHeight = Double.parseDouble(height);
            if (convertedHeight < 0) {
                throw new FormValidatorCheckHeightCheckException("Неверный рост:" + height +
                        ". Рост должен быть положительным.");
            }
        } catch (NumberFormatException e) {
            throw new FormValidatorCheckHeightCheckException("Неверный рост: " + height +
                    ". Рост должен корректно конвертироваться в double.");
        }
    }
}
