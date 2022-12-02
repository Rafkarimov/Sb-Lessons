package main.java20221202.customcollection;

public class MainQ {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (!queue.isEmpty()) {
            System.out.println("Пациент номер " + queue.delete());
        }
    }
}
