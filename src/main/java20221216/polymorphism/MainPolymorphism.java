package main.java20221216.polymorphism;
//полиморфизм - динамическое связывание, т.е. Shape понимает что надо брать от Square
public class MainPolymorphism {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape cirlce = new Circle();

        square.draw();
        square.erase();

        cirlce.draw();
        cirlce.erase();
    }
}
