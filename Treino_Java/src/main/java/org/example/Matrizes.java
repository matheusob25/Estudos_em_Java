package org.example;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matriz = new int[N][N];
        for(int i = 0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
        for(int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i]+" ");
        }


        sc.close();
    }
}
