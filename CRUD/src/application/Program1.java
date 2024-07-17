package application;

import db.DB;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//inserir dados
public class Program1 {
    public static void main(String[] args) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        Scanner sc = new Scanner(System.in);
        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO seller "
                        + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                        + " VALUES (?,?,?,?,?)" , Statement.RETURN_GENERATED_KEYS);
            System.out.print("Digite o nome do vendedor: ");
            st.setString(1,sc.nextLine());
            System.out.print("Digite o email do vendedor: ");
            st.setString(2,sc.nextLine());
            System.out.print("Digite a data de nascimento do vendedor: ");
            LocalDate lc = LocalDate.parse(sc.nextLine(), dt);
            java.sql.Date sqlDate = java.sql.Date.valueOf(lc);
            st.setDate(3, sqlDate);
            System.out.print("Digite o salário do vendedor: ");
            st.setDouble(4, sc.nextDouble());
            System.out.print("Digite o número de departamento do vendedor: ");
            st.setDouble(5, sc.nextInt());


            int rows = st.executeUpdate();
            if(rows > 0){
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }

            }else{
                System.out.println("No rows affected");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DB.closeStatement(st);
            DB.closeConnection();
            sc.close();
        }
    }
}
