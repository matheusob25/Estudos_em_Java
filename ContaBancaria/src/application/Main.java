package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withDrawLimit = sc.nextDouble();

            Account a1 = new Account(number, holder, balance, withDrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            a1.withDraw(sc.nextDouble());
            System.out.println("New balance: " + String.format("%.2f", a1.getBalance()));
        }
        catch (DomainException e ){
            System.out.print("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.print("Unexpected error: " + e.getMessage());
        }

    }
}