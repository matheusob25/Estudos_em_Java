package application;

import entities.Company;
import entities.Individual;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for(int i=1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            Double income = sc.nextDouble();
            if(ic == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpend = sc.nextDouble();
                list.add(new Individual(name, income, healthExpend));
            }else if(ic == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name,income, numberOfEmployees));
            }else{
                System.out.println("This type of account does not exist, write the data correctly");
                i--;
            }
        }
        System.out.println("TAXES PAID: ");
        double total = 0.0;
        for(Person p : list){
            System.out.println(p.getName() + ": $ " + String.format("%.2f", p.payTax()));
            total += p.payTax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));

        sc.close();
    }
}