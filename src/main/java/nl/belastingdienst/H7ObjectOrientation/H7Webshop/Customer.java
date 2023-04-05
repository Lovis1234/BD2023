package nl.belastingdienst.H7ObjectOrientation.H7Webshop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String place;
    private List<Order> orderList;
    private List<Item> cart = new ArrayList<>();

    public void addToCart(Item item) {
        cart.add(item);
    }

    public void printCart() {
        for (Item item : cart) {
            System.out.println(item.getDescription());
        }
    }

    public void order() {
        double total = 0;
        for (Item cart : cart) {
            total += cart.getPrice();
        }
        Order order = new Order(cart, total);
    }
}
