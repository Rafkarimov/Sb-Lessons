package main.java20221028.regexp;
/*
Перевод CamelCase в snake_case
    На вход подается строка, состоящая из заглавных и прописных латинских букв (вида CamelCase).
    Вывести эту же строку, но состоящую только из прописных букв (вид snake_case),
    а перед местом, где была заглавная буква - должен быть выведен символ нижнего подчеркивания.

    Вход                Выход
    ItIsCamelCaseString it_is_camel_case_string
    SomeLongVariable    some_long_variable

    tI ----> t_I группа 1 = строчная группа 2 = заглавный символ $1_$2
    sC ----> s_C
    lC ----> l_C

 */
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println(s.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase());
    }
}
