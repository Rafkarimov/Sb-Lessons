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
public class Document {
    private static int count = 1;

    private int id;
    private String name;
    private int pageCount;

    public Document(String name, int pageCount) {
        id = count++;
        this.name = name;
        this.pageCount = pageCount;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
