package org.example;

import java.util.Scanner;
import java.time.LocalTime;

public class Testes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime HoraAtual = LocalTime.now();


        if(HoraAtual.isAfter(LocalTime.of(0,0)) && HoraAtual.isBefore(LocalTime.of(12,59,59))){
            System.out.println("Bom dia Caralhoooo");

        } else if(HoraAtual.isAfter(LocalTime.of(12,59,59)) && HoraAtual.isBefore(LocalTime.of(18,59,59)) ) {
            System.out.println("Boa tarde fellas");

        }else if (HoraAtual.isAfter(LocalTime.of(18,59,59)) && HoraAtual.isBefore(LocalTime.of(23,59,59)) ){
            System.out.println("Boa noite primo");

        }

    }
}
