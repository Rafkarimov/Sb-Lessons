package main.java20221209.factory;

//Реализация паттерна фабрика
public class IceCreamFactory {
    public IceCream getIceCream(IceCreamType type) {
        IceCream iceCream = null;
        switch (type) {
            case CHERRY:
                iceCream = new CherryIceCream();
                break;
            case CHOCOLATE:
                iceCream = new ChocolateIceCream();
                break;
            case VANILLA:
                iceCream = new VanillaIceCream();
                break;
        }
        return iceCream;
    }
}
