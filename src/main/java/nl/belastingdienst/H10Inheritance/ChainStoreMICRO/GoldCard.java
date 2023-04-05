package nl.belastingdienst.H10Inheritance.ChainStoreMICRO;

public class GoldCard extends Card {
    private int discount;

    public GoldCard(int customerId, String name, double credit, int discount) {
        super(customerId, name, credit);
        this.discount = discount;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println(amount);
        int total = (amount * (1 - (discount / 100)));
        System.out.println(total);
        credit -= total;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%-50s%-50s%-50s%-50s<br/>", customerId, name, credit, discount);
    }

    public void setDiscount(int discount) {
        if (!(discount < 1) && !(discount > 30)) {
            this.discount = discount;
        } else throw new IllegalArgumentException("Out of range discount!");
    }
}
