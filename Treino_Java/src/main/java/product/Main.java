package product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        System.out.println("Enter the name of product here: ");
        p.setName(sc.nextLine());
        System.out.println("Enter the price of product here: ");
        p.setPrice(sc.nextDouble());
        System.out.println("Enter the quantity of product here: ");
        p.setQuantity(sc.nextInt());
        System.out.println("Add products on yor stock: ");
        p.AddProductsInStock(sc.nextInt());
        System.out.printf("Total value on the stock: %.2f%n", p.TotalValueInStock());
        System.out.println("Remove products on yor stock: ");
        p.RemoveProductsInStock(sc.nextInt());
        System.out.printf("Total value on the stock: %.2f%n", p.TotalValueInStock());

        System.out.println(p.toString());


        sc.close();
    }
}
