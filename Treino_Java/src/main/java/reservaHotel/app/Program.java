package reservaHotel.app;

import reservaHotel.entities.Cliente;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cliente[] cliente = new Cliente[10];
        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();
        for(int i=0; i < n; i++){
            sc.nextLine();
            System.out.println("Rent #"+ (i+1));
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int o = sc.nextInt();
            if(cliente[o] == null ){
                cliente[o] = new Cliente(nome,email);
            }else {
                System.out.println("This room has already been rented, please choose another one ");
                i--;
            }

        }
        for(int i = 0; i < cliente.length; i++){
            if(cliente[i] != null){
                System.out.println(i+": "+cliente[i]);
            }
        }


        sc.close();
    }
}
