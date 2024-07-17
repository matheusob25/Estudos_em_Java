package nomeAltura.application;

import nomeAltura.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de pessoas para preencher: ");
        int n = sc.nextInt();
        float media=0;
        int abaixoDe16 = 0;
        Pessoa[] pessoa = new Pessoa[n];
        for(int i = 0; i < pessoa.length;i++){
            sc.nextLine();
            System.out.println((i+1)+"º Pessoa");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura:");
            float altura = sc.nextFloat();
            media += altura;
            pessoa[i] = new Pessoa(nome,idade,altura);
            if(pessoa[i].getIdade() < 16){
                abaixoDe16++;
            }
        }
        double porcent16 = ((double) abaixoDe16 / pessoa.length)*100;
        System.out.printf("Altura média: %.2f%n",(media / pessoa.length));
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", porcent16 );
        for (int i=0; i < pessoa.length; i++){
            if(pessoa[i].getIdade() < 16){
                System.out.println(pessoa[i].getNome());
            }
        }

        sc.close();
    }
}
