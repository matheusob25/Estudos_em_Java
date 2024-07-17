package comparators.application;



import comparators.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv",45.7));
        products.add(new Product("Tablet",67.9));
        products.add(new Product("Telephone",889.0));
        products.add(new Product("Iphone",889.0));
        products.add(new Product("headphone",889.0));
        products.add(new Product("earbuds",889.0));

        products.sort((p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase())); // ou products.sort(new MyComparator());

        for(Product p: products){
            System.out.println(p);
        }
    }
}
