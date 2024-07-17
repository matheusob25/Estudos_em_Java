package application;

import db.DB;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;

//deletar dados
public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Connection conn = null;
        PreparedStatement st = null;
        Scanner sc = new Scanner(System.in);
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                                    "DELETE FROM `department` "
                                         +"WHERE `department`.`Id` = ? ");

            st.setInt(1, 2);

            int rowsaffected = st.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsaffected);

        } catch (SQLException e) {
            //excessão personalizada para problema de inntegridade do banco de dados ao deletar um dado que tem o id como chave estrangeira em outra tabela do banco de dados
           throw new DbIntegrityException(e.getMessage());
        }finally {
            DB.closeStatement(st);
            DB.closeConnection();
            sc.close();
        }
    }
}
