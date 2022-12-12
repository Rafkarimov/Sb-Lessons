package main.java20221209.factory;

public class Main {
    public static void main(String[] args) {
        IceCreamFactory factory = new IceCreamFactory();
        IceCream cherry = factory.getIceCream(IceCreamType.CHERRY);
        IceCream chocolate = factory.getIceCream(IceCreamType.CHOCOLATE);
        IceCream vanilla = factory.getIceCream(IceCreamType.VANILLA);

        cherry.printIngredients();
        chocolate.printIngredients();
        vanilla.printIngredients();
    }
}
