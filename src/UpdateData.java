
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhanuka
 */
public class UpdateData {
     public static void main(String[] args) {
        try {
            DBConnection connection = new DBConnection();
            final String updateQuery = "UPDATE learnmysql.myusers SET email = 'bhanuka@gmail.com' WHERE id = 4";
            Statement statement = connection.getConnection().createStatement();
            statement.executeUpdate(updateQuery);
            
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
