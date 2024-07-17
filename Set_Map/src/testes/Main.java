package testes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("tablet");
        set.add("Tv");
        set.add("Notebook");
        set.add("iphone");

        set.removeIf(x -> x.length() > 6);
        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("Notebook"));
        for(String b: set){
            System.out.println(b);
        }

    }
}