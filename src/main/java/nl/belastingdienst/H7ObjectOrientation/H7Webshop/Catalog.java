package nl.belastingdienst.H7ObjectOrientation.H7Webshop;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Item> products = new ArrayList<>();
    private int idCount = 0;

    public int year;

    public Catalog(int year) {
        this.year = year;
    }

    public void addItem(double price, String description) {
        Item item = new Item(++idCount, price, description);
        products.add(item);
    }

    public List<Item> getProducts() {
        return products;
    }

    public int getYear() {
        return year;
    }
}
