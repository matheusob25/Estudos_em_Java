package aula2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String path = "/home/matheus/IdeaProjects/ManipulatingFiles/src/aula1/nomes.txt";
        FileReader fr = null;
        BufferedReader bf = null;

        try {
            fr = new FileReader(path);
            bf = new BufferedReader(fr);
            String line =  bf.readLine();

            while(line != null){
                System.out.println(line);
                line = bf.readLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
           try {
               if(bf != null){
                   bf.close();
               }
               if(fr != null){
                   fr.close();
               }
           }
           catch (IOException e){
               e.printStackTrace();
           }
        }
    }
}
