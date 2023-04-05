package nl.belastingdienst.H11.H11Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int count = 0;
    private List<BankAccount> bankAccounts = new ArrayList<>();

    private class CheckingAccount extends BankAccount {
        public CheckingAccount(int accountNumber) {
            super(accountNumber, 0);
        }
    }

    private class SavingsAccount extends BankAccount {
        public SavingsAccount(int accountNumber) {
            super(accountNumber, 3.5);
        }
    }


    public BankAccount createAccount(AccountType accountType) {
        if (accountType == AccountType.SavingsAccount) {
            SavingsAccount bankAccount = new SavingsAccount(++count);
            bankAccounts.add(bankAccount);
            return bankAccount;
        } else {
            CheckingAccount bankAccount = new CheckingAccount(++count);
            bankAccounts.add(bankAccount);
            return bankAccount;
        }

    }

    public String getCapital() {
        double total = 0;
        for (BankAccount bankAccount : bankAccounts) {
            total += bankAccount.getBalance();
        }
        return String.format("$%.2f", total);
    }

    public void getIntrests() {
        bankAccounts.forEach(System.out::println);
    }
}
