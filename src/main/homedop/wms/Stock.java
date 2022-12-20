package main.homedop.wms;

import main.homedop.pos.Order;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Stock {
    private final Set<Order> orders = new HashSet<>();
    private final Map<Item, Integer> map = new HashMap<>();

    public void receive(Order order, Item item, Integer quantityOfGoods) {
//        map.merge(order, item, quantityOfGoods, Integer::sum); // добавление в заказ товара и его количество
    }

    @Override
    public String toString() {
        return "Stock{" +
                "orders=" + orders +
                ", map=" + map +
                '}';
    }
}
