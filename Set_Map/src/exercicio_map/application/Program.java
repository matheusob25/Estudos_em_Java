package exercicio_map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String file = "/home/matheus/IdeaProjects/Set_Map/src/exercicio_map/application/politicos.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();
            while (line != null){
                String[] lines = line.strip().split(",");
                String name = lines[0];
                if(map.containsKey(name)){
                    int n = map.get(name);
                    map.put(name,(n + Integer.parseInt(lines[1].strip())));
                }else{
                    map.put(name, Integer.parseInt(lines[1].strip()));
                }
                line = br.readLine();
            }
            for(String s: map.keySet()){
                System.out.println(s + ":  "+ map.get(s));
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
