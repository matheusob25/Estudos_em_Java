package mapExemplo2.application;

import mapExemplo2.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<Product, Double> map = new HashMap<>();
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        map.put(p1,10000.0);
        map.put(p2,20000.0);
        map.put(p3,15000.0);
        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + map.containsKey(ps));




    }
}
