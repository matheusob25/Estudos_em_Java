package productservice.application;


import productservice.entities.Product;
import productservice.model.services.ProductServices;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        ProductServices ps = new ProductServices();
        double soma = ps.filteredSum(products, p -> p.getName().toLowerCase().charAt(0) == 't');
        System.out.println(soma);
    }
}
