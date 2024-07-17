package hashcode_equals.application;

import hashcode_equals.entities.Cliente;

public class Program {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Maria", "Maria@gmail.com");
        Cliente c2 = new Cliente("Maria", "Maria@gmail.com");
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }
}
