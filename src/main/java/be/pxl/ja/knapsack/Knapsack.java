package be.pxl.ja.knapsack;

import java.util.ArrayList;
import java.util.List;

public class Knapsack<T extends KnapsackItem> {
    private int maximumCapacity;
    private List<T> items = new ArrayList<>();

    public Knapsack(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public List<T> getItems() {
        return items;
    }

    public double getCurrentWeight() {
        return items.stream().mapToDouble(KnapsackItem::getWeight).sum();
    }

    public void add(T item) throws KnapsackFullException {
        if (getCurrentWeight() + item.getWeight() <= maximumCapacity) {
            items.add(item);
        } else {
            throw new KnapsackFullException("Product not allowed in knapsack.");
        }
    }
}
