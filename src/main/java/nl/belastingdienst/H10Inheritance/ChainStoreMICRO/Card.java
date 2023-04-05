package nl.belastingdienst.H10Inheritance.ChainStoreMICRO;

public abstract class Card {
    protected final int customerId;
    protected String name;
    protected double credit;

    public Card(int customerId, String name, double credit) {
        this.customerId = customerId;
        this.name = name;
        this.credit = credit;
    }

    public abstract boolean pay(int amount);

    public abstract String toString();
}
