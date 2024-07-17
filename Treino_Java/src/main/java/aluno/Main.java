package aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Scanner sc = new Scanner(System.in);
        a.setNota(new double[3]);
        double v = 0;
        System.out.println("Digite o nome do aluno e as 3 notas respectivas aos 3 trimestres dele: ");
        System.out.print("Nome: ");
        a.setNome(sc.nextLine());
        for(int i = 0; i < a.getNota().length; i++){
            System.out.println(""+(i + 1)+"º Nota");
            v = sc.nextDouble();
            a.addNota(i, v);
        }
        System.out.println(a.notaFinal());
        System.out.println(a.verificaNota());


        sc.close();
    }
}
