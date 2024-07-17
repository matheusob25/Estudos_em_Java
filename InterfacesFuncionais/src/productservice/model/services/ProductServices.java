package productservice.model.services;

import productservice.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductServices{

    public double filteredSum(List<Product> products, Predicate<Product> criteria){
        double sum = 0.0;
        for (Product product : products) {
            if(criteria.test(product)){
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
