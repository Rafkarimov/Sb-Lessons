package main.homedop.pos;

import main.homedop.wms.Item;

import java.util.HashMap;
import java.util.Map;


public class Order {
    private Map<Item, Integer> map = new HashMap<>();

    public void addItemAndQuantity(Item item, Integer quantityOfGoods) {
        map.merge(item, quantityOfGoods, Integer::sum); // добавление в заказ товара и его количество
//        map.remove(item, quantityOfGoods);
    }
}
