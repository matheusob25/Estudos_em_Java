import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        method2();
    }
    public static void method2(){
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }catch (InputMismatchException e){
            System.out.println("Input error");
        }
        sc.close();
    }
}