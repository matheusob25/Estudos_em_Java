package org.example;

public class Teste2 {

    public int soma(int[] vet, int n){
        if(n >= vet.length){
            return 0;
        }else{
            return vet[n] + soma(vet, n+1);
        }
    }
    public int fibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
//        System.out.println(String.format("%.0f",Math.pow(2, 18)));
//        System.out.println((Math.pow(2, 7)));
//        double i = 240000.0;
//        int etapas = 0;
//        while(i>=1){
//            i /= 2;
//            System.out.println(i);
//            etapas++;
//        }
//        double j = ( i + 1.0829999);
//        int e = (int)j;
//        System.out.println("Número de etapas para chegar a 1: " + etapas);
//        System.out.println("------------------------------------");
//        System.out.println(j);
//        System.out.println("--------------------------------------");
//        System.out.println(e);
        int[] vet = {1,2,3,4};
        System.out.println(new Teste2().soma(vet, 0));
        for(int i=0; i< 20; i++){
            System.out.println(new Teste2().fibonacci(i));
        }
    }
}
