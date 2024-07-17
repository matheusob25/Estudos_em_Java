package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class BuscaBinaria {
    public static int buscaBinaria(int[] list, int item){
     list  = Arrays.stream(list).sorted().toArray();
     int menorValor = 0;
     int maiorValor = list.length - 1;
     int valTeste;
     int valorDoMeio;
     while(menorValor <= maiorValor){
         valorDoMeio =  (menorValor + maiorValor) / 2;
         if(list[valorDoMeio] == item){
             return valorDoMeio;
         }
         if(list[valorDoMeio] < item){
             menorValor = valorDoMeio + 1;
         }else{
             maiorValor = valorDoMeio - 1;
         }
     }
     return -2;
    }

    public static int buscaBinariaRecursivo(int[] list, int item, int begin, int end){
        if(begin > end){
            return -1;
        }
        int mid = (end + begin) /2;

        if(list[mid] == item){
            return mid;
        }else if(list[mid] < item){
            return buscaBinariaRecursivo(list, item, mid + 1, end);
        }else{
            return buscaBinariaRecursivo(list, item, begin, mid - 1);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[]{3,4,20,7,8,9,100};



        System.out.println(buscaBinariaRecursivo(list, 9, 0, list.length - 1));


    }
}
