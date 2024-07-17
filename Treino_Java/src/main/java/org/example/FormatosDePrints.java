package org.example;


import java.util.*;

public class FormatosDePrints {

    public static void brincando(int numeroDeAsteriscos){

        for (int i = 0; i < numeroDeAsteriscos; i++) {
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = i;  k <= numeroDeAsteriscos - 1; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = numeroDeAsteriscos - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = i; k < numeroDeAsteriscos; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {


    }
}
