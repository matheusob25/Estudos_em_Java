import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileText {
    public static void main(String[] args) {
        Scanner sc = null;
        File file =  new File("/home/matheus/senha.txt");
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (FileNotFoundException  e){
            System.out.println("Error opening file: " + e.getMessage());
        }finally {
            if(sc != null){
                sc.close();
            }
        }




    }
}
