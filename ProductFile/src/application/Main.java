package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String strPath = "/home/matheus/IdeaProjects/ProductFile/src/products.csv";
        Boolean success = new File("/home/matheus/IdeaProjects/ProductFile/src/out").mkdir();
        List<Product> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();
            while(line != null){
                String[] items = line.split(",");
                String name = items[0];
                Double price = Double.parseDouble(items[1].strip());
                Integer quantity =  Integer.valueOf(items[2].strip());
                products.add(new Product(name,price,quantity));
                line = br.readLine();
            }
            for(Product p : products){
                System.out.println(p.getName());
                System.out.println(p.getPrice());
                System.out.println(p.getQuantity());
            }
            String targetFile = "/home/matheus/IdeaProjects/ProductFile/src/out/summary.csv";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){
                for(Product p : products){
                    bw.write(p.getName() +","+String.format("%.2f", p.total()));
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("ERROR: "+ e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }


    }
}