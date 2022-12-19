package main.homedop;

import main.homedop.pos.Order;
import main.homedop.wms.Item;

import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        Item item1 = new Item("Bread", (new BigDecimal("0.95")));
        Item item2 = new Item("Milk", (new BigDecimal("0.55")));
        System.out.println(item1);
        System.out.println(item2);

        System.out.println("-------------------------------------------");
        Order receipt = new Order();
        receipt.addItemAndQuantity(item1, 1);
        receipt.addItemAndQuantity(item2, 5);
        System.out.println(item1);
        System.out.println(item2);
    }
}
