package be.pxl.ja.knapsack;

import be.pxl.ja.robbery.Product;
import be.pxl.ja.robbery.Shop;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {

    public static <T extends KnapsackItem & Comparable<T>> void fill(Knapsack<T> knapsack, List<T> items) {
        Collections.sort(items);
        for (T item: items) {
            try {
                knapsack.add(item);
            } catch (KnapsackFullException e) {
                System.err.println(e.getMessage());
            }

        }
    }

}
