package application;

import entities.Eleitor;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Eleitor> eleitores = new TreeSet<>();

        System.out.println("Cadastro de eleitores");
        String resposta = "";
        System.out.print("Deseja cadastrar um eleitor? \nSe sim digite 'S', caso não queira digite 'N'");
        resposta = scanner.nextLine();
        while(resposta.toUpperCase().equals("S")){
            System.out.print("Digite o id do eleitor: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome do eleitor: ");
            String nome = scanner.nextLine();
            if(eleitores.contains(new Eleitor(id,nome))){
                System.out.println("Esse id já existe");
                System.out.println("digite outro id para o eleitor com o " + nome);
                id = scanner.nextInt();
                scanner.nextLine();
                if(!eleitores.contains(new Eleitor(id,nome))){
                    eleitores.add(new Eleitor(id,nome));
                }
            }else{
                eleitores.add(new Eleitor(id,nome));
            }
            System.out.print("Deseja cadastrar mais algum eleitor? [S/N]: ");
            resposta = scanner.nextLine();
        }
        for (Eleitor e: eleitores) {
            System.out.println(e);
        }

    }
}