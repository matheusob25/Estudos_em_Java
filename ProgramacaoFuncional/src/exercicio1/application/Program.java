package exercicio1.application;

import exercicio1.entities.Product;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String file = "/home/matheus/IdeaProjects/ProgramacaoFuncional/src/exercicio1/products.csv";
        try (BufferedReader bf = new BufferedReader(new FileReader(file))){
            List<Product> products = new ArrayList<>();
            String line = bf.readLine();
            while (line != null){
                String[] lines = line.strip().split(",");
                products.add(new Product(lines[0],Double.valueOf(lines[1])));
                line = bf.readLine();
            }
            double avg = products.stream().map(p -> p.getPrice()).reduce(0.0, (x,y) -> x + y) / products.size();
            System.out.println(avg);
            List<String> names = products.stream().filter(p -> p.getPrice() < avg)
                    .map(product -> product.getName())
                    .sorted((p,p2) -> -p.toLowerCase().compareTo(p2.toLowerCase())).collect(Collectors.toList());
            for (String name : names) {
                System.out.println(name);
            }
        }catch (IOException e){
            System.out.println("Error -> " + e.getMessage());
        }
    }
}
