package conversor.app;

import java.util.Scanner;

import conversor.utils.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price: ");
        double dollar = sc.nextDouble();
        System.out.print("\nHow many dollars will be bought: ");
        double quantity = sc.nextDouble();
        System.out.println(CurrencyConverter.converter(dollar,quantity));





        sc.close();
    }
}
