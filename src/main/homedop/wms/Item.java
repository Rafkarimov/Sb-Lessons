package main.homedop.wms;

import main.homedop.pos.Order;

import java.math.BigDecimal;

public class Item {
    private final Product product; // наименование товара
    private final BigDecimal priceOfUnitOfGoods; // цена товара

    public Item(Product product, BigDecimal priceOfUnitOfGoods) {
        this.product = product;
        this.priceOfUnitOfGoods = priceOfUnitOfGoods;
    }
}
