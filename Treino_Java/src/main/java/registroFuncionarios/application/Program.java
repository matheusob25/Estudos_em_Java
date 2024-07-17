package registroFuncionarios.application;


import registroFuncionarios.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1));
            System.out.print("Id:");
            Integer id = sc.nextInt();
            while(hasId(list,id)){
                System.out.print("This id already be taken, try another: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Name:");
            String  nome = sc.nextLine();
            System.out.print("Salary:");
            Double salario = sc.nextDouble();

            list.add(new Funcionario(id,nome,salario));
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        Integer idTeste = sc.nextInt();
        int posicao = position(list, idTeste);
        if(posicao != -1){
            System.out.print("Enter the porcentage: ");
            Double val = sc.nextDouble();
            list.get(posicao).aumento(val);
        }else{
            System.out.println("This id does not exist!");

        }

        System.out.println();
        System.out.println("List of employees:");
        for(Funcionario x : list){
            System.out.println(x.toString());
        }



        sc.close();
    }

    public static int position(List<Funcionario> list, int idTeste){
        for(int i=0; i < list.size(); i++){
            if(list.get(i).getId() == idTeste){
                return i;
            }
        }
        return -1;
    }

    public static boolean hasId(List<Funcionario> list, int id){
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }

}
