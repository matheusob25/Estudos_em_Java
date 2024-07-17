package function.application;

import function.entities.Product;
import function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        Function<Product, String> function = p -> p.getName().toUpperCase() ;

//      List<String> names = products.stream().map(new UpperCaseName()).collect(Collectors.toList()); // classe que implemmenta a interface function
//      List<String> names = products.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); // método estático
//        List<String> names = products.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); // método não estático
//        List<String> names = products.stream().map(function).collect(Collectors.toList()); // expressão lambda declarada




      List<String> names = products.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); // lambda inline




        names.forEach(System.out::println);

    }
}
