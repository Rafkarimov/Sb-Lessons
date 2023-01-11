package main.home041.myevennumber;

public class MyEvenNumberMain {
    public static void main(String[] args) {
        try {
            MyEvenNumber myEvenNumber = new MyEvenNumber(2);
            MyEvenNumber myEvenNumber1 = new MyEvenNumber(3);
        } catch (MyEvenNumber.MyEvenNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
