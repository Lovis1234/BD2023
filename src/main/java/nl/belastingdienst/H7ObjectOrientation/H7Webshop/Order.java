package nl.belastingdienst.H7ObjectOrientation.H7Webshop;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private LocalDate orderDate = LocalDate.now();
    private List<Item> itemList;
    private double totalPrice;

    public Order(List<Item> itemList, double totalPrice) {
        this.itemList = itemList;
        this.totalPrice = totalPrice;
    }
}
