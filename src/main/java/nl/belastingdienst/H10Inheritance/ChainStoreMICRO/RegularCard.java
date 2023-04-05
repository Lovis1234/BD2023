package nl.belastingdienst.H10Inheritance.ChainStoreMICRO;

public class RegularCard extends Card {
    public RegularCard(int customerId, String name, double credit) {
        super(customerId, name, credit);
    }

    @Override
    public boolean pay(int amount) {
        if (credit >= amount) {
            credit -= amount;
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10s%-10s<br/>", customerId, name, credit);
    }
}
