package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private int maximumCapacity;
    private List<Product> items = new ArrayList<>();

    public Knapsack(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public List<Product> getItems() {
        return items;
    }

    public double getCurrentWeight() {
        return items.stream().mapToDouble(Product::getWeight).sum();
    }

    public void add(Product product) throws KnapsackFullException {
        if (getCurrentWeight() + product.getWeight() <= maximumCapacity) {
            items.add(product);
        } else {
            throw new KnapsackFullException("Product not allowed in knapsack.");
        }
    }
}
