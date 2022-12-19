package main.homedop.wms;

import main.homedop.pos.Order;

import java.math.BigDecimal;

public class Item extends Order implements Bought, ForSale {
    private String productName; // наименование товара
    private BigDecimal priceOfUnitOfGoods; // цена товара
    private Integer quantityOfGoods; // количество товара

    //Создаем конструктор для 2 позиций
    public Item(String productName, BigDecimal priceOfUnitOfGoods) {
        this.productName = productName;
        this.priceOfUnitOfGoods = priceOfUnitOfGoods;
        this.quantityOfGoods = quantityOfGoods;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPriceOfUnitOfGoods() {
        return priceOfUnitOfGoods;
    }

    public Integer getQuantityOfGoods() {
        return quantityOfGoods;
    }

    @Override
    public void buy() {

    }

    @Override
    public void sale() {

    }

    @Override
    public String toString() {
        return "Item{" +
                "productName='" + productName + '\'' +
                ", priceOfUnitOfGoods=" + priceOfUnitOfGoods +
                ", quantityOfGoods=" + quantityOfGoods +
                '}';
    }
}
