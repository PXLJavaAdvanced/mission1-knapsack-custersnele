package be.pxl.ja.robbery;

import be.pxl.ja.knapsack.Knapsack;
import be.pxl.ja.knapsack.KnapsackUtil;

import java.util.ArrayList;
import java.util.List;

public class Robbery {
    public static void main(String[] args) {
        List<String> woorden = new ArrayList<>();
        Knapsack<Product> knapsack = new Knapsack<>(35);

        Shop shop = new Shop();
        shop.add(new Product("stereo", 15, 1800));
        shop.add(new Product("television", 7, 850));
        shop.add(new Product("dvd-player", 8, 1850));
        shop.add(new Product("laptop", 20, 2000));
        shop.add(new Product("guitar", 15, 1500));

        KnapsackUtil.fill(knapsack, shop.getItems());

        System.out.println("\nList of products:");
        for (Product product : knapsack.getItems()) {
            System.out.println(product);
        }
    }
}