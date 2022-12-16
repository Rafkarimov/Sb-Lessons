package main.java20221216.polymorphism;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Cirlce.erase()");
    }
}
