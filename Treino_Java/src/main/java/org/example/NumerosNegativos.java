package org.example;

import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você quer digitar: ");
        int n = sc.nextInt();
        int[] vet = new int[n];
        for (int i=0;i < vet.length ; i++){
            System.out.printf("Digite o %dº número: ",(i+1));
            vet[i] = sc.nextInt();
        }
        System.out.println("Números negativos: ");
        numerosNegativos(vet);
        sc.close();
    }

    public static void numerosNegativos(int[] vet){
        for(int i=0; i < vet.length; i++){
            if(vet[i] < 0){
                System.out.println(vet[i]);
            }
        }
    }
}
