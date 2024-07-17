package sistemaBancario.app;

import sistemaBancario.entities.Banco;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        long numeroConta = sc.nextLong();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String nome = sc.nextLine();
        Banco b1 = new Banco(numeroConta,nome);
        System.out.print("Is there a initial deposit (y/n)? ");
        String resp = sc.nextLine();
        if(resp.equals("y")){
            System.out.print("Enter initial deposit value: ");
            b1.deposito(sc.nextDouble());
        }
        System.out.println(b1);

        sc.close();
    }
}
