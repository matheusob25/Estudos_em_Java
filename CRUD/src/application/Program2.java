package application;

import db.DB;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
//atualizar dados
public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Connection conn = null;
        PreparedStatement st = null;
        Scanner sc = new Scanner(System.in);
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("UPDATE seller "
                                            +"SET BaseSalary = BaseSalary + ? "
                                            + "WHERE seller.Name = ?");
            System.out.print("Digite o nome do vendedor que vai receber o aumento: ");
            st.setString(2, sc.nextLine());
            System.out.print("Digite o aumento: ");
            st.setDouble(1, sc.nextDouble());
            int rowsaffected = st.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DB.closeStatement(st);
            DB.closeConnection();
            sc.close();
        }
    }
}
