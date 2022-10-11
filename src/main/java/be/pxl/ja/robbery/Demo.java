package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product p1 = new Product("p1", 15, 5.5);
        Product p2 = new Product("p2", 15, 7.5);
        Product p3 = new Product("p3", 15, 1);
        Product p4 = new Product("p4", 15, 12.8);
        Product p5 = new Product("p5", 15, 1);

        List<Product> productList = Arrays.asList(p1, p2, p3, p4, p5);
        Collections.sort(productList);

        for (Product p : productList) {
            System.out.println(p);
        }

    }
}
