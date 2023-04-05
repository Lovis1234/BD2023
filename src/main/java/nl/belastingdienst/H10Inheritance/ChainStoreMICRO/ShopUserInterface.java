package nl.belastingdienst.H10Inheritance.ChainStoreMICRO;

import java.util.HashMap;

public class ShopUserInterface {
    private HashMap<Integer, Card> cardHashMap = new HashMap<>();
    private int id = 0;

    private static final ShopUserInterface shopUserInterface = new ShopUserInterface();

    private ShopUserInterface() {
    }

    public void createCard(String name, double amount) {
        RegularCard regularCard = new RegularCard(++id, name, amount);
        cardHashMap.put(regularCard.customerId, regularCard);
    }

    public void createCard(String name, double amount, int discount) {
        GoldCard goldCard = new GoldCard(++id, name, amount, discount);
        cardHashMap.put(goldCard.customerId, goldCard);
    }

    public String getCards() {
        StringBuilder stringBuilder = new StringBuilder("<html>");
        stringBuilder.append(String.format("%-50s%-50s%-50s%-50s<br/>", "CardID", "Name", "Credit", "Discount"));
        cardHashMap.forEach((key, card) -> stringBuilder.append(card));
        stringBuilder.append("</html>");
        return stringBuilder.toString();
    }

    public boolean StartPayment(int accountnumber, int amount) {
        Card card = cardHashMap.get(accountnumber);
        return card.pay(amount);
    }

    public static ShopUserInterface getShopUserInterface() {
        return shopUserInterface;
    }
}
