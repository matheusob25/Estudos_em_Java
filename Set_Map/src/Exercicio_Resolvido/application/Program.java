package Exercicio_Resolvido.application;


import Exercicio_Resolvido.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file full path");
        String file = sc.nextLine();
        try (BufferedReader bf = new BufferedReader(new FileReader(file))){
            Set<LogEntry> set = new HashSet<>();
            String line = bf.readLine();
            while(line != null){
                String[] lines = line.split(" ");
                set.add(new LogEntry(lines[0],LocalDateTime.parse(lines[1])));
                line = bf.readLine();
            }
            for(LogEntry e: set){
                System.out.println(e);

            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
