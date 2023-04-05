package nl.belastingdienst.H7ObjectOrientation.H7Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int count = 0;
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public String createAccount(double balance) {
        BankAccount bankAccount = new BankAccount(++count, balance);
        bankAccounts.add(bankAccount);
        return "Bankaccount with accountnumber #" + bankAccount.getAccountNumber() + " has been created!";
    }

    public String getCapital() {
        double total = 0;
        for (BankAccount bankAccount : bankAccounts) {
            total += bankAccount.getBalance();
        }
        return String.format("$%.2f", total);
    }

    public String getIntrests() {
        StringBuilder stringBuilder = new StringBuilder();
        for (BankAccount bankAccount : bankAccounts) {
            stringBuilder.append("<br/>Account with accountnumber #").append(bankAccount.getAccountNumber()).append(" gets ").append(String.format("$%.2f", bankAccount.calculateInterest())).append(" intrest this year.");
        }
        return stringBuilder.toString();
    }
}
