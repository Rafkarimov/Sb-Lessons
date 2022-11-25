package main.java20221125;

/*
Класс для валидаций полей регуляркой.
Имя
Должно содержать только буквы.
Начинаться с заглавной буквы и далее только прописные. От 2 до 20 символов.
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

public class FieldValidator {
    private static final String NAME_PATTERN = "[A-Z][a-z]{1-19}";
    private static final String DATE_PATTERN = "[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}";
    private static final String PHONE_PATTERN = "\\+[0-9]{11}";
    private static final String EMAIL_PATTERN = "[A-Za-z0-9\\-\\_\\*\\.]+@[a-z0-9]+\\.(com|ru)"; // + 1 и более

    public static boolean validateName(String name){
        return name.matches(NAME_PATTERN);
    }
    public static boolean validateDate(String date){
        return date.matches(DATE_PATTERN);
    }
    public static boolean validatePhone(String phone){
        return phone.matches(PHONE_PATTERN);
    }
    public static boolean validateEmail(String email){
        return email.matches(EMAIL_PATTERN);
    }
    private FieldValidator(){}
}
