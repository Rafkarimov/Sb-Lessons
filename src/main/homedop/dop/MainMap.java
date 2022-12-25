package main.homedop.dop;
/*
1. Найди в Интернете словарь в виде текстового файла со списком слов (каждое слово должно быть на отдельной строке)
2. Текстовый файл со словарем помести в корневой каталог проекта
3. Считай слова построчно из словаря
4. Внутри for цикла заполни Map<String, Integer> общим количеством слов в словаре по первой букве слова (например map
будет выглядеть при распечатке так: {A = 100, B = 256, итд})
5. Внутри for цикла заполни Map<Integer, Integer> общим количеством слов в словаре по их длине (например map будет
выглядеть при распечатке так: {5 = 125, 7 = 566, итд})
6. После for цикла распечатай первый map с ключами, отсортированными по алфавиту, а второй map с ключами,
отсортированными по длине слова в порядке убывания
7. НВ! ООП тут использовать не надо!
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Integer> wordsStartingWithLettersMap = new HashMap<>();
        Map<Integer, Integer> wordsByLengthMap = new HashMap<>();

//        List<String> list = new ArrayList<>();
//        list.add("даба");
//        list.add("даба");
//        list.add("ворожба");
//        list.add("разведслужба");
//        list.add("дамба");
//        list.add("даба");
//        list.add("авиабомба");
//        list.add("даба");
//
//        for (String item : list) {
//            String meaning = Character.toString(item.charAt(0));
//            if (wordsStartingWithLettersMap.containsKey(meaning.substring(0, 1))) {
//                wordsStartingWithLettersMap.put(meaning, wordsStartingWithLettersMap.get(meaning) + 1);
//            } else {
//                wordsStartingWithLettersMap.put(meaning, 1);
//            }
//        }
//        System.out.println(wordsStartingWithLettersMap);
//
//        for (String item : list) {
//
//        }

        //Класс Files содержит статические методы для работы с файлами и каталогами. Полезный метод - lines() который
        // возвращает поток строк: Stream<String> . Из этого потока можно получить строки, содержащиеся в файле.
        //Метод принимает Path к файлу, который мы хотели бы прочитать, с необязательной Charset . Мы будем использовать
        // try-with-resources для автоматизации очистки и закрытия:
        Path path = Paths.get("dictionary.txt");

        //Поскольку метод возвращает Stream , мы используем его forEach() для перебора строк со ссылкой на метод для краткости.
        //Вместо печати каждой линии, StringBuilder может быть использован для добавления строк:
        StringBuilder sb = new StringBuilder();

        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach((String word) -> {

            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}