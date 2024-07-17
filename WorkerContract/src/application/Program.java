package application;


import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's name: ");
        String department = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Worker level: ");
        String workerlevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(workerlevel), baseSalary, new Department(department));
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Enter the contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String data = sc.nextLine();
            LocalDate contractDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Value per Hour: ");
            Double valueContract = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            worker.addContract(new HourContract(contractDate, valueContract, hours));

        }
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateSalary = sc.next();
        int month = Integer.parseInt(dateSalary.substring(0, 2));
        int year = Integer.parseInt(dateSalary.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " +dateSalary+": " + worker.income(year,month));





        sc.close();
    }
}
