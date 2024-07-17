package aula5;



import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();
        File filepath = new File(strPath);


        File[] folders = filepath.listFiles(File::isDirectory);
        for(File f : folders){
            System.out.println(f);
        }
        System.out.println("|============================================|");

        File[] files = filepath.listFiles(File::isFile);
        for(File f: files){
            System.out.println(f);

        }
        boolean success = new File(strPath + "/aula6").mkdir();
        System.out.println("Directory created successfully " + success );


    }
}
