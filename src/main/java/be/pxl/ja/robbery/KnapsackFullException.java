package be.pxl.ja.robbery;

public class KnapsackFullException extends Exception { // checked exception -> moet afgehandeld worden

    public KnapsackFullException(String message) {
        super(message);
    }
}
