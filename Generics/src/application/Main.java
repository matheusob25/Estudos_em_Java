package application;

import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        String file = "/home/matheus/IdeaProjects/Generics/src/file.txt";
        try(BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String line = bf.readLine();
            while(line != null){
                String[] lines = line.strip().split(",");
                list.add(new Product(lines[0], Double.valueOf(lines[1])));
                line = bf.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.print(x.getValue());
        }catch (IOException e){

        }

    }
}