package org.example;

public class Ordenacao {
    public static void main(String[] args) {
        int j[] = {9,3,4,6,7,8,9,1,3,4,5,10,11}; // segunda volta [3,9,4,6,7.......]
        int valor_atual = 0;
        for(int i = 1; i < (j.length - 1); i++){
            valor_atual = j[i];  // segunda voolt
            int anterior = i -1;
            while(anterior >= 0 && j[anterior] > valor_atual){
                j[anterior + 1] = j[anterior];
                anterior = anterior - 1;
            }
            j[anterior + 1] = valor_atual;
        }

        for(int k = (j.length -1); k >= 0; k--){
            System.out.println(j[k]);
        }

    }
}

