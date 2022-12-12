package main.java20221209.factory;

public class VanillaIceCream implements IceCream{
    @Override
    public void printIngredients() {
        System.out.println("Vanilla, cream, ice, love");
    }
}
