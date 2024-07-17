package org.example;

public class Hashcode_Equals {
    public static void main(String[] args) {
        String a = "maria";
        String b = "Maria";

        if(a.hashCode() == b.hashCode()){
            System.out.println("True");
            System.out.println(a.hashCode());
            System.out.println(b.hashCode());
        }else{
            System.out.println(a.hashCode());
            System.out.println(b.hashCode());
            System.out.println("false");

        }
    }
}
