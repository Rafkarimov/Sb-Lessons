package main.java20221202.customcollection;

//очередь
// реализовать
/*
size()
isFull()
isEmpty()
add
delete
peek

 */
public class Queue {
    private int[] arr;
    private int head;
    private int tail;
    private int size;
    private int capacity; // вместимость


    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return (size() == capacity);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void add(int val) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        tail = (tail + 1) % capacity;
        arr[tail] = val;
        size++;
    }

    public int delete() {
        if (isEmpty()) {
            return -1;
        }

        int x = arr[head];
        head = (head + 1) % capacity;
        size--;
        return x;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[head];
    }
}
