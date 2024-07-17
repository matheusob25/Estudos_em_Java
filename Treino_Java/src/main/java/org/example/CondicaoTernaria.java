package org.example;

import java.util.Scanner;

public class CondicaoTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do produto: ");
        float Preco = sc.nextFloat();
        float Desconto = (float) ((Preco < 20) ?  Preco * 0.1 :  Preco * 0.05);     // Expressões ternárias de confição
        System.out.printf("Desconto: %.3f", Desconto);
    }
}
