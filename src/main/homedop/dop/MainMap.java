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
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Integer> wordsStartingWithLettersMap = new HashMap<>();
//        Map<Integer, Integer> wordsByLengthMap = new HashMap<>();

        List<String> list = new ArrayList<>();
        list.add("даба");
        list.add("даба");
        list.add("ворожба");
        list.add("разведслужба");
        list.add("дамба");
        list.add("даба");
        list.add("авиабомба");
        list.add("даба");

        for (String item: list) {

            if (wordsStartingWithLettersMap.containsKey(item))
                wordsStartingWithLettersMap.put(item, wordsStartingWithLettersMap.get(item) + 1);
            else
                wordsStartingWithLettersMap.put(item, 1);
        }
        System.out.println(wordsStartingWithLettersMap);


//        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\User\\IdeaProjects\\Sb-Lessons\\src\\main" +
//                "\\homedop\\dop\\dictionary.txt"))) {
//            stream.forEach((String word) -> {
//
//            });
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}