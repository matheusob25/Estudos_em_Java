package retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Retangle r = new Retangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a largura do retângulo: ");
        r.setWidth(sc.nextDouble());
        System.out.println("Digite a altura do retângulo: ");
        r.setHeight(sc.nextDouble());
        System.out.println(r.diagonal());




        sc.close();
    }
}
