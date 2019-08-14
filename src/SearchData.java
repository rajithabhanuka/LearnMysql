
import java.sql.ResultSet;
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
public class SearchData {

    public static void main(String[] args) {
        try {
            DBConnection connection = new DBConnection();
            final String selectQuery = "SELECT * FROM learnmysql.myusers WHERE id =5";
            Statement statement = connection.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(selectQuery);

            while (rs.next()) {
                System.out.println("First Name : " + rs.getString("firstname"));
                System.out.println("Second Name : " + rs.getString("lastname"));
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
