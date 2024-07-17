package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(8);

        list.add(1,1);
        list.remove(5);
        for(int i: list){
            System.out.println(i);
        }
        System.out.println("-----------------------------------");
//        list.removeIf(x -> x % 2 == 0);
        for(int i: list){
            System.out.println(i);
        }
        System.out.println("-----------------------------------");

        System.out.println("index of number 7: " + list.indexOf(12));
        System.out.println("-----------------------------------");
        List<Integer> resultado = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        for(int i: resultado){
            System.out.println(i);
        }

    }
}
