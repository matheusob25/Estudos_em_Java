package exercicio2.application;


import exercicio2.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full file path: ");
        try(BufferedReader br = new BufferedReader(new FileReader(sc.next()))){
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            String line = br.readLine();
            List<Employee> employees = new ArrayList<>();
            while(line != null){
                String[] campos = line.strip().split(",");
                employees.add(new Employee(campos[0],campos[1],Double.parseDouble(campos[2])));
                line = br.readLine();
            }

            List<String> names = employees.stream().filter(p -> p.getSalary() > salary).map(e -> e.getEmail()).sorted().collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f",salary));
            names.forEach(System.out::println);

            double sum = employees.stream().filter(e -> e.getName().toUpperCase().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (e,p) -> e + p);
            System.out.println("Sum of Salary of people whose name starts with 'M': " + String.format("%.2f", sum));
        }catch (IOException e){

        }

    }
}
