package nl.belastingdienst.H7ObjectOrientation.H7Bank;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
