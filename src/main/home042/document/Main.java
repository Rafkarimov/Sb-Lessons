package main.home042.document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
В некоторой организации хранятся документы (см. класс Document). Сейчас все
документы лежат в ArrayList, из-за чего поиск по id документа выполняется
неэффективно. Для оптимизации поиска по id, необходимо помочь сотрудникам
перевести хранение документов из ArrayList в HashMap.
public class Document {
public int id;
public String name;
public int pageCount;
}
Реализовать метод со следующей сигнатурой:
public Map<Integer, Document> organizeDocuments(List<Document> documents)
 */
public class Main {
    public static void main(String[] args) {
        List<Document> documents = List.of(
                new Document("Doc1", 123),
                new Document("Doc2", 200),
                new Document("Doc3", 300),
                new Document("Doc4", 50),
                new Document("Doc5", 15)
        );
        Map<Integer, Document> map = organizeDocuments(documents);
        map.forEach((key, value) -> System.out.println(key + " - " + value));
        System.out.println(map.get(3));
    }

    private static Map<Integer, Document> organizeDocuments(List<Document> documents) {
        Map<Integer, Document> documentMap = new HashMap<>();
        for (Document document : documents) {
            documentMap.put(document.getId(), document);
        }
        return documentMap;
    }
}
