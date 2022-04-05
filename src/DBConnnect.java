import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnnect {
    public static final String DB_URL = "jdbc:postgresql://localhost/univercity";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "123123";

    public static void main(String[] args) {
        
        Connection connect = null;
        Statement statement = null;
        //(1)=(SQL sorgusu yapmak )String sql = "SELECT * FROM student";
        //(2)=(Statement oluşturup veri eklemek )String insertSql = "INSERT INTO student (student_id,student_name,student_class) VALUES (4,'Ali',5)";
        //(3)=(PreparedStatement ile veri eklemek )String preparedSql = "INSERT INTO student (student_id,student_name,student_class) VALUES (?,?,?)";
        //(4)=(Statement ile veri güncelleme)String stSql = "UPDATE student SET student_name='Sezar Fenor' WHERE student_id=1";
        //(5)=(Preapared Statement ile veri güncellemek.)String prSql = "UPDATE student SET student_name = ? WHERE student_id = ?";
        //(6)=(Veri Silmek )String stSql = "DELETE FROM student WHERE student_id = 4";
        //(7)=(Veri Silmek )String prSql = "DELETE FROM student WHERE student_id = ?";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            statement = connect.createStatement();
            //(1) ResultSet data = statement.executeQuery(sql);
            //(2)statement.executeUpdate(insertSql);
            /*(1) while(data.next()){
                System.out.println("ID :"+data.getInt("student_id"));
                System.out.println("AD :"+data.getString("student_name"));
            }*/

            /*(3)PreparedStatement preparedStatement = connect.prepareStatement(preparedSql);
            preparedStatement.setInt(1,5);
            preparedStatement.setString(2, "Haluk Selim");
            preparedStatement.setInt(3, 3);
            preparedStatement.executeUpdate();
            
            preparedStatement.close();*/

            //(4)statement.executeUpdate(stSql);

            /*(5) PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setString(1, "Celal");
            pr.setInt(2, 1);
            pr.executeUpdate(); */

            //(6) statement.executeUpdate(prSql);
            
            /*(7) PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setInt(1,3 );
            pr.executeUpdate(); */
            
            statement.close();
            connect.close();

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

}

