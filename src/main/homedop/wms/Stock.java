package main.homedop.wms;

import main.homedop.pos.Order;

import java.util.*;

public class Stock {
    private final Set<Order> orders = new HashSet<>();
    private final Map<Item, Integer> allItems = new HashMap<>();

    public void receive(Order order) {
//        for (Map.Entry<Item, Integer> entry : order.getMap().entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//            allItems.merge(entry.getKey(), entry.getValue(), Integer::sum); // добавление в заказ товара и его количество
//        }
        order.getMap().forEach((Item key, Integer value) -> allItems.merge(key, value, Integer::sum));
    }

    public void dispatch(Order order) {
        order.getMap().forEach((Item key, Integer value) -> {
            Integer itemTotalValue = allItems.get(key);
            if (Objects.equals(value, itemTotalValue)) {
                allItems.remove(key);
            } else if (itemTotalValue > value) {
                allItems.merge(key, value, (a, b) -> a - b);
            } else {
                throw new RuntimeException("превышен лимит");
            }
        });
    }

    public int getAvailable(Product product) {
        return allItems.entrySet().stream()
                .filter(entry -> entry.getKey().getProduct() == product)
                .map(Map.Entry::getValue)
                .findAny().orElse(0);
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public Map<Item, Integer> getAllItems() {
        return allItems;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "orders=" + orders +
                ", map=" + allItems +
                '}';
    }
}
