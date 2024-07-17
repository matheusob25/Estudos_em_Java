package predicate.application;

import predicate.entities.Product;
import predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        // Expressão lambda declarada
       // ->  Predicate<Product> predicate = product ->  product.getPrice() > 100;

        products.removeIf(x -> x.getPrice() > 100); //expresão lambda inline


        for(Product p : products){
            System.out.println(p);
        }

    }
}
