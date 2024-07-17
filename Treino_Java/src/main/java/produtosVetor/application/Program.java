package produtosVetor.application;

import produtosVetor.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double soma = 0;
        System.out.print("How many products will be registered: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];
        for (int i=0; i < products.length; i++){
            sc.nextLine();
            System.out.print("Product name: ");
            String name = sc.nextLine();
            System.out.print("\nProduct price: ");
            double price  = sc.nextDouble();
            products[i] = new Product(name,price);
            soma += products[i].getPrice();
        }
        for (int j = 0; j < n; j++){
            System.out.println(products[j]);

        }
        System.out.printf("\nPrice average: %.2f",(soma / products.length));

        sc.close();
    }
}
