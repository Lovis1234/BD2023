package nl.belastingdienst.H7Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount(69.11);
        bank.createAccount(1000);
        bank.createAccount(1250.50);
        bank.createAccount(6911440.69);

        System.out.println(bank.getCapital());
        bank.getIntrests();

    }
}
