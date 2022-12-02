package main.java20221202.customcollection;

/*
Простая реализация LinkedList (однонаправленная)
Методы:
    - get(int index)
    - addAtHead(int val)
    - addAtTail(int val)
    - deleteAtIndex(int index)
    - size()

 */
public class SimpleLinkedList {
    private Node head;
    private int size;

    private static class Node {
        int value; // объявили 2 поля
        Node next; // ссылка на Node

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

    //в чем идея метода Get
    //идем от головы до интересующей нас ноды
    //если индекс валиден, то мы возвращаем значение этой ноды
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        return node.value;
    }

    //добавление в голлову
    public void addAtHead(int value) {
        Node newHead = new Node(value, head);
        head = newHead;
        size++; // после того как увеличили линкедлист надо увеличить размер
    }

    public void addAtTail(int value) {
        if (size > 0) {
            Node node = head;
            for (int i = 0; i < size - 1; i++) {
                node = node.next;
            }
            node.next = new Node(value, null);
        } else {
            head = new Node(value, null);
        }
        size++;
    }

    //добавляет значение по какому то индексу
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {// в конец
            addAtTail(val);
            return;
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        Node newNode = new Node(val, node.next);
        node.next = newNode;
        size++; // так как произошла вставка надо увеличить размер
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;
            return; // убрали голову
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }

        if (index == size - 1) {
            node.next = null;
        } else {
            node.next = node.next.next;
        }
        size--; //так как удаление --
    }

    public int size() {
        return size;
    }
}
