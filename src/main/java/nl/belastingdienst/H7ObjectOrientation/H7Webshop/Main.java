package nl.belastingdienst.H7ObjectOrientation.H7Webshop;

public class Main {
    public static void main(String[] args) {
        Webshop webshop = new Webshop();
        Customer customer = new Customer();

        webshop.addCatalog(2022);
        webshop.addCatalog(2023);

        Catalog catalog = webshop.getCatalogByYear(2023);

        catalog.addItem(10.99, "Toy");
        catalog.addItem(69.99, "Flamethrower");

        webshop.browse(customer);
        customer.printCart();

    }
}
