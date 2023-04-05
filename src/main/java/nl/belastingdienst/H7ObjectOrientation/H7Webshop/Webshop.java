package nl.belastingdienst.H7ObjectOrientation.H7Webshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Webshop {
    private List<Catalog> catalogs = new ArrayList<Catalog>();
    private int idCount = 0;

    public void addCatalog(int year) {
        Catalog catalog = new Catalog(year);
        catalogs.add(catalog);
    }

    public void browse(Customer customer) {
        System.out.println("Choose one of the catalogs below");
        for (Catalog catalog : catalogs) {
            System.out.println(catalog.year);
        }
        Scanner scanner = new Scanner(System.in);
        Catalog catalog = getCatalogByYear(scanner.nextInt());
        System.out.println("Catalog of the year " + catalog.year);
        System.out.println("ID\tPRICE\tDESCRIPTION");
        for (Item item : catalog.getProducts()) {
            System.out.println(item.getId() + "\t" + String.format("$%.2f", item.getPrice()) + "\t" + item.getDescription());
        }
        System.out.println("Choose a product by id to add to cart");
        int input = 0;

        while (input != -1) {
            if (input == 0) {
                input = scanner.nextInt();
            } else {
                customer.addToCart(getItemById(catalog, input));
                input = scanner.nextInt();
            }
        }
    }

    public Catalog getCatalogByYear(int year) {
        return catalogs.stream().filter(catalog -> (year == catalog.getYear())).findFirst().orElse(null);

    }

    public Item getItemById(Catalog catalog, int id) {
        Catalog found = getCatalogByYear(catalog.year);
        List<Item> itemList = found.getProducts();
        return itemList.stream().filter(item -> (id == item.getId())).findFirst().orElse(null);
    }

}
