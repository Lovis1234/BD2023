package nl.belastingdienst.H10Inheritance.ChainStoreMICRO;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        ShopUserInterface shop = ShopUserInterface.getShopUserInterface();
        shop.createCard("Gerda", 1000);
        shop.createCard("Donald", 7000, 10);
        shop.createCard("Edward", 5000);
        shop.createCard("Mona", 7000, 10);
        shop.createCard("Roan", 800, 15);
        shop.createCard("Vera", 500);

//        shop.getCards();
//        shop.StartPayment();
        shop.getCards();

        JFrame frame = new JFrame("Payment");
        frame.setContentPane(new Payment().getRootPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setVisible(true);

    }
}
