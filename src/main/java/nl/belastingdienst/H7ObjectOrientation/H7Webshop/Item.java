package nl.belastingdienst.H7ObjectOrientation.H7Webshop;

public class Item {
    private int id;
    private double price;
    private String description;


    public Item(int id, double price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
