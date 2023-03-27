package nl.belastingdienst.H4StatementsAndExceptions;

public class EvenNumberException extends Exception {
    public EvenNumberException() {
    }

    public EvenNumberException(String message) {
        super(message);
    }
}
