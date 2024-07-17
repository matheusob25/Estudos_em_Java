package map.application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();


        map.put("TV", 700.60);
        map.put("Tablet", 560.60);
        map.put("Iphone", 5060.60);
        map.remove("Iphone");

        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }

    }
}
