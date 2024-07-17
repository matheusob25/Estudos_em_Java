package comparable.application;

import comparable.application.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Funcionario> list = new ArrayList<>();
        String file = "/home/matheus/IdeaProjects/InterfaceComparable/src/file.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String name = br.readLine();
            while(name != null){
                String[] dados = name.split(",");
                list.add(new Funcionario(dados[0].strip(),Double.valueOf(dados[1].strip())));
                name = br.readLine();

            }
            Collections.sort(list);
            for(Funcionario s : list){
                System.out.println(s);
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}