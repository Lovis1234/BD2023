package nl.belastingdienst.H11.H11Bank;

public abstract class BankAccount {
    private int accountNumber;
    private double balance = 0;
    private double intrest;

    public BankAccount(int accountNumber, double intrest) {
        this.accountNumber = accountNumber;
        this.intrest = intrest;
    }

    public double calculateInterest() {
        return balance * (1 + intrest / 100) - balance;
    }

    public void transfer(BankAccount bankAccount, double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            bankAccount.setBalance(bankAccount.getBalance() + amount);
        } else throw new InsufficientFundsException("U hebt geen toereikend saldo voor deze overboeking");
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            setBalance(getBalance() - amount);
        } else throw new InsufficientFundsException("U hebt geen toereikend saldo voor deze opname");
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void printBalance() {
        System.out.println("Current balance of account #" + accountNumber + " = €" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
