package aula4;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good Morning", "Good afternoon", "Good night"};
        String path = "/home/matheus/IdeaProjects/ManipulatingFiles/src/aula4/cumprimentos.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String l : lines){
                bw.write(l);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
