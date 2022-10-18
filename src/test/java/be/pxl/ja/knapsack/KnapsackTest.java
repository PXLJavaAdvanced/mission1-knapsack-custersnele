package be.pxl.ja.knapsack;

import be.pxl.ja.robbery.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KnapsackTest {

    private Knapsack<Product> knapsack;

    @BeforeEach
    public void init() throws KnapsackFullException {
        knapsack = new Knapsack<>(35);
        knapsack.add(new Product("stereo", 12, 370));
        knapsack.add(new Product("laptop", 3, 1200));
    }

    @Test
    public void knapsackFullExceptionIsThrownWhenMaximumCapacityExceeded() {
        Assertions.assertThrows(KnapsackFullException.class,
                () -> knapsack.add(new Product("laspost", 50, 2500)));
    }
}
