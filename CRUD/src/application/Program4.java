package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

//transações
public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Connection conn = null;
        Statement st = null;
        Scanner sc = new Scanner(System.in);
        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false);
            st = conn.createStatement();

            int rowsaffected1 = st.executeUpdate("UPDATE seller SET BaseSalary = 4090 WHERE DepartmentId = 1");
            int x = 1;
            if(x < 2){
                throw new SQLException("Fake error");
            }
            int rowsaffected2 = st.executeUpdate("UPDATE seller SET BaseSalary = 5090 WHERE DepartmentId = 2");
            conn.commit();

            System.out.println("Rows affected: "+ rowsaffected1);
            System.out.println("Rows affected: "+ rowsaffected2);
        } catch (SQLException e) {
           try {
               conn.rollback();
               throw new DbException("Transaction rolled back!! caused by: "+ e.getMessage());
           }catch (SQLException e1){
               throw new DbException("Error trying to rollback: " + e1.getMessage());
           }
        }finally {
            DB.closeStatement(st);
            DB.closeConnection();
            sc.close();
        }
    }
}
