import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String dbURL = "jdbc:oracle:thin:@ora1.uhk.cz:1521:orcl";
        String userName = "DBkvapifi1";
        String passwordName = "DBkvapifi122";

        try {
            Connection connection = DriverManager.getConnection(dbURL,userName,passwordName);
            System.out.println("Pripojeno");
            String sql = "INSERT INTO ZANRY (ID_ZANR,NAZEV) " + "VALUES (1,'Sci-fi')";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
