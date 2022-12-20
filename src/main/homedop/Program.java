package main.homedop;

import main.homedop.pos.Order;
import main.homedop.wms.Item;
import main.homedop.wms.Product;
import main.homedop.wms.Stock;

import java.math.BigDecimal;


public class Program {
    public static void main(String[] args) {
//        Map<Product, BigDecimal> map = new HashMap<>();
//        map.put(Product.BREAD, new BigDecimal("0.95"));
//        map.put(Product.MILK, new BigDecimal("0.55"));
//        map.entrySet().forEach(System.out::println);
        Item item1 = new Item(Product.BREAD, new BigDecimal("0.95"));
        Item item2 = new Item(Product.MILK, new BigDecimal("0.55"));
        System.out.println(item1);
        System.out.println(item2);
        System.out.println("-------------------------------------------");

        Order order1 = new Order();
        order1.addItemAndQuantity(item1, 10);
        order1.addItemAndQuantity(item2, 5);
        System.out.println(order1);
        System.out.println("-------------------------------------------");

        Stock stock = new Stock();
        stock.receive(order1);
        System.out.println("--------------------------------------------");
        System.out.println();

        System.out.println(stock);
        System.out.println("--------------------------------------------");

        Order order2 = new Order();
        order2.addItemAndQuantity(item1, 9);
        stock.dispatch(order2);
        System.out.println(stock);
        System.out.println("------------------------------------------");

        System.out.println(stock.getAvailable(Product.BREAD));
    }
}
