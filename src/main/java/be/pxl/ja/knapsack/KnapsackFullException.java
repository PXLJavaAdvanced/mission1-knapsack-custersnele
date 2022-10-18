package be.pxl.ja.knapsack;

public class KnapsackFullException extends Exception { // checked exception -> moet afgehandeld worden

    public KnapsackFullException(String message) {
        super(message);
    }
}
