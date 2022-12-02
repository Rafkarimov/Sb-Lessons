package main.java20221202.customcollection;

public class MainSimple {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        simpleLinkedList.addAtHead(1);
        System.out.println("Zero element of list: " + simpleLinkedList.get(0));
        System.out.println("simpleLinkedList размер: " + simpleLinkedList.size());
        simpleLinkedList.addAtHead(2);
        System.out.println("First element of list: " + simpleLinkedList.get(0));
        System.out.println("simpleLinkedList размер: " + simpleLinkedList.size());

        simpleLinkedList.addAtTail(5);
        System.out.println("Third element of list:" + simpleLinkedList.get(2));
        System.out.println("simpleLinkedList размер: " + simpleLinkedList.size());
        simpleLinkedList.addAtIndex(2, 10);
        System.out.println("Second element of list: " + simpleLinkedList.get(2));

        simpleLinkedList.deleteAtIndex(2);
        System.out.println("simpleLinkedList размер: " + simpleLinkedList.size());
        System.out.println("Second element of list: " + simpleLinkedList.get(2));

    }
}
