package main.homedop.wms;

import main.homedop.pos.Order;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {
    private final Product product; // наименование товара
    private final BigDecimal priceOfUnitOfGoods; // цена товара

    public Item(Product product, BigDecimal priceOfUnitOfGoods) {
        this.product = product;
        this.priceOfUnitOfGoods = priceOfUnitOfGoods;
    }

    public Product getProduct() {
        return product;
    }

    public BigDecimal getPriceOfUnitOfGoods() {
        return priceOfUnitOfGoods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return product == item.product;
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", priceOfUnitOfGoods=" + priceOfUnitOfGoods +
                '}';
    }
}
