import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Hello world!");

        DBConnectionHandler d = new DBConnectionHandler();

        d.getConnection();


    }
}

