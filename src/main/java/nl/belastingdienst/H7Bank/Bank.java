package nl.belastingdienst.H7Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int count = 0;
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public void createAccount(double balance) {
        BankAccount bankAccount = new BankAccount(++count, balance);
        bankAccounts.add(bankAccount);
        System.out.println("Bankaccount with accountnumber #" + bankAccount.getAccountNumber() + " has been created!");
    }

    public double getCapital() {
        double total = 0;
        for (BankAccount bankAccount : bankAccounts) {
            total += bankAccount.getBalance();
        }
        return total;
    }

    public void getIntrests() {
        for (BankAccount bankAccount : bankAccounts) {
            System.out.println("Account with accountnumber #" + bankAccount.getAccountNumber() + " gets " + bankAccount.calculateInterest() + " intrest this year.");
        }
    }
}
