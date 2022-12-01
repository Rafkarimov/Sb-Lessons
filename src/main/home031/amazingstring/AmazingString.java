package main.home031.amazingstring;

import java.io.IOException;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
6.	Необходимо реализовать класс AmazingString, который хранит внутри себя строку как массив char и предоставляет
следующий функционал:
Конструкторы:
●	Создание AmazingString, принимая на вход массив char
●	Создание AmazingString, принимая на вход String
Публичные методы (названия методов, входные и выходные параметры продумать самостоятельно). Все методы ниже нужно
реализовать “руками”, т.е. не прибегая к переводу массива char в String и без использования стандартных методов
класса String.
●	Вернуть i-ый символ строки
●	Вернуть длину строки
●	Вывести строку на экран
●	Проверить, есть ли переданная подстрока в AmazingString (на вход подается массив char). Вернуть true, если
найдена и false иначе
●	Проверить, есть ли переданная подстрока в AmazingString (на вход подается String). Вернуть true, если найдена
и false иначе
●	Удалить из строки AmazingString ведущие пробельные символы, если они есть

Ведущими пробельными символами являются пробелы, символы новой строки (\n) и символы табуляции (\ t),
которые появляются в начале строкового значения.

●	Развернуть строку (первый символ должен стать последним, а последний первым и т.д.)

 */
public class AmazingString {
    private char[] ch;

    public AmazingString(char[] ch) {
        this.ch = ch;
    }

    public AmazingString(String str) {
        ch = str.toCharArray();
    }

    public char getSymbolByIndex(int i) {
        for (int j = 0; j < ch.length; j++) {
            if (j == i) {
                return ch[i];
            }
        }
        return (char) 0;
    }

    public int getStringLength() {
        return ch.length;
    }

    public void printString() {
        String str = "";
        for (char c : ch) {
            str += c;
        }
        System.out.println(str);
    }

    public boolean containsSubstring(char[] substring) {
        for (int i = 0; i < ch.length - substring.length + 1; i++) {
            boolean result = true;
            for (int j = 0; j < substring.length; j++) {
                if (ch[i + j] != substring[j]) {
                    result = false;
                    break;
                }
            }
            if (result) {
                return true;
            }
        }
        return false;
    }

    public boolean containsSubstring(String substring) throws IOException {
        Matcher m = Pattern.compile("$").matcher(substring); //так как нельзя использовать стандартные методы класса
        // String будем использовать какую то ...
//        m.find();
        int length = m.end();
        for (int i = 0; i < ch.length - length + 1; i++) {
            boolean result = true;
//            for (int j = 0; j < length; j++) {
//                if (ch[i + j] != substring.charAt(j)) {
//                    result = false;
//                    break;
//                }
//            }
            StringReader reader = new StringReader(substring);
            int k;
            int j = 0;
            while ((k = reader.read()) != -1) { // когда до конца подстроки доходит выходит из цикла
                if (ch[i + j++] != (char) k) { // без charAt(j)
                    result = false;
                    break;
                }
            }

            if (result) {
                return true;
            }
        }
        return false;
    }

    public void deleteSpace() {
        char[] copyArray = new char[0];
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '\n' || ch[i] == '\t') {
//                System.arraycopy(ch, i + 1, ch, i, ch.length - 1 - i);
                copyArray = new char[ch.length - 1];
                // copy elements from original array from beginning till index into copyArray
                if (i > 0) {
                    System.arraycopy(ch, 0, copyArray, 0, i);
                }
                if (copyArray.length > i) {
                    // copy elements from original array from index+1 till end into copyArray
                    System.arraycopy(ch, i + 1, copyArray, i, ch.length - i - 1);
                }
            }
        }
        ch = copyArray;
    }
}

//i = образование
//j = образ

//
//i=0 j=0...4 образ = образ -> true
//i=1 бразо = образ - > false б - о б - б б - р б - р
//i=2 разов = образ - > false
//i=3 азова = образ - > false
//i=4 зован = образ - > false
//i=5 овани = образ - > false
//i=6 вание = образ - > false