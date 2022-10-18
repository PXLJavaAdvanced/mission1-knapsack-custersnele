package be.pxl.ja.citytrip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AttractionTest {

    @Test
    public void compareToReturnsZeroIfAttractionsHaveSameRating() {
        Attraction attraction1 = new Attraction("a1", 0.5, 8);
        Attraction attraction2 = new Attraction("a2", 1, 8);
        assertEquals(0, attraction1.compareTo(attraction2));
    }

    @Test
    public void compareToReturnsNegativeValueIfAttractionHasHigherRating() {
        Attraction attraction1 = new Attraction("a1", 0.5, 8);
        Attraction attraction2 = new Attraction("a2", 1, 5);
        assertTrue(attraction1.compareTo(attraction2) < 0);
    }

    @Test
    public void compareToReturnsPositiveValueIfAttractionHasLowerRating() {
        Attraction attraction1 = new Attraction("a1", 0.5, 5);
        Attraction attraction2 = new Attraction("a2", 1, 8);
        assertTrue(attraction1.compareTo(attraction2) > 0);
    }
}
