package matrizesExercicio;

import java.util.Scanner;

public class MatrizesEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas e colunas do vetor: ");
        int lin= sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[lin][col];
        for(int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++){
                System.out.printf("position (%d)(%d): ",i, j);
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Qual número você quer buscar dentro da matriz: ");
        int proc = sc.nextInt();
        for(int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++){
                if(mat[i][j] == proc){
                    System.out.println("position " + i + ", " + j + ": ");
                    if(j != 0){
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if((j+1) < mat[i].length){
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if(i != 0){
                        System.out.println("Up: "+ mat[i-1][j]);
                    }
                    if((i+1) < mat.length){
                        System.out.println("Down: " + mat[i+1][j]);
                    }

                }
            }
            System.out.println();
        }



        sc.close();
    }

}
