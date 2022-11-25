package main.java20221125;
/*
Стек хранит последовательность данных.
Связаны данные так: каждый элемент указывает на тот,
который нужно использовать следующим.
Это линейная связь — данные идут друг за другом и нужно брать их по очереди.
Из середины стека брать нельзя.

Главный принцип работы стека - данные, которые попали в стек недавно
используются первыми.
Чем раньше попал - тем позже используется.
После использования стека элемент исчезает, и верхним становится
следующий элемент.
push() - добавляет элемент на верх стека
pop() - удаляет элемент из стека и возвращает его
top() - возвращает верхний элемент стека
 */

public class SimpleStack {
    private int[] array;
    private int top = -1; // указываем на самый верних элемент
    private int size;

    public SimpleStack(int size) {
        this.size = size;
        array = new int[size];
    }

    public void push(int x) {
        if (top + 1 == size) {
            System.out.println("Stack overflow");
        } else {
            array[++top] = x;
        }
    }

    public int top() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return top;
        } else {
            return array[top];
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return top;
        } else {
            return array[top--];
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == size -1);
    }
}
