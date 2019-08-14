
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
public class InsertData {

    public static void main(String[] args) {
        try {
            DBConnection connection = new DBConnection();
            final String insertQuery = "INSERT INTO learnmysql.myusers (firstname,lastname,email,regdate)"
                    + "VALUES ('Prabath','Chanaka','user5@gmail.com','2019-07-14')";
            Statement statement = connection.getConnection().createStatement();
            statement.executeUpdate(insertQuery);
            
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
