package consumer.application;

import consumer.entities.Product;
import consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

//        products.forEach(p -> p.setPrice(p.getPrice() * 1.1)); // lambda inline
//        products.forEach(Product::staticPriceUpdate); //método estático
        products.forEach(product -> new PriceUpdate().accept(product));

        products.forEach(System.out::println);
    }
}
