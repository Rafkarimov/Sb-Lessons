package main.homedop.pos;

import main.homedop.wms.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Order {
    private static int counter = 1;
    private final int id = counter++;
    private final Map<Item, Integer> map = new HashMap<>();

    public void addItemAndQuantity(Item item, int quantityOfGoods) {
        map.merge(item, quantityOfGoods, Integer::sum); // добавление в заказ товара и его количество
//        map.remove(item, quantityOfGoods);
    }
    public Map<Item, Integer> getMap() {
        return map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && map.equals(order.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, map);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", map=" + map +
                '}';
    }
}
