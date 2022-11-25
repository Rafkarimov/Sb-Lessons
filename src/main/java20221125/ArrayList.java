package main.java20221125;

import java.util.Arrays;

/*

 */
public class ArrayList {
    private int size;
    private int capacity; // размерность массива
    private int[]arr;

    private static final int DEFAULT_CAPACITY = 5;

    public ArrayList(){
        arr = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
        size = 0;
    }

    public void add(int elem){
        if (size >= capacity) {
            capacity *= 2; // приемлимая величина
            arr = Arrays.copyOf(arr,capacity);
        }
        arr[size] = elem;
        size++;
    }

    public int get(int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Impossible");
            return -1;
        }else {
            return arr[idx];
        }
    }
    public int size(){
        return size;
    }
}
