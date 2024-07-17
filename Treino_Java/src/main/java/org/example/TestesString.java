package org.example;

import java.util.Scanner;

public class TestesString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        frase = frase.trim();
        String[] vetor = frase.split(" ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);

        }
        sc.close();
    }
}
