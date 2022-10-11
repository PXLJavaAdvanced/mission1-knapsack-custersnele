package be.pxl.ja.robbery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void compareToReturnsZeroWhenProductsHaveSamePrice() {
        Product p1 = new Product("p1", 12.5, 15.5);
        Product p2 = new Product("p2", 20, 15.5);
        assertEquals(0, p1.compareTo(p2));
        assertEquals(0, p2.compareTo(p1));
    }

    @Test
    public void compareToReturnsNegativeValueWhenProductIsExpensive() {
        Product p1 = new Product("p1", 12.5, 20.5);
        Product p2 = new Product("p2", 20, 15.5);
        assertEquals(-1, p1.compareTo(p2));
    }

    @Test
    public void compareToReturnsPositiveValueWhenProductIsCheaper() {
        Product p1 = new Product("p1", 12.5, 15.5);
        Product p2 = new Product("p2", 20, 32.8);
        assertEquals(1, p1.compareTo(p2));
    }
}
