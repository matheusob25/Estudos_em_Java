package Exercicio_Fixacao.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        int student = 0;
        Scanner sc = new Scanner(System.in);
        Set<Integer> students = new HashSet<>();
        System.out.print("How many students for course A?");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            student = sc.nextInt();
            students.add(student);
        }
        System.out.print("How many students for course B?");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            student = sc.nextInt();
            students.add(student);
        }
        System.out.print("How many students for course C?");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            student = sc.nextInt();
            students.add(student);
        }
        System.out.println("Total students: " + students.size());
        sc.close();
    }
}
