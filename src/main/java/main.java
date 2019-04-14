import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.*;
import java.util.*;

public class main {

    private static BasicDataSource dataSource;
    private static String url = "CODERKIDS@COT-CIS3365-03.cougarnet.uh.edu";
    private static String user = "elhayne2";
    private static String pass = "Honey!1996";

    public static void main(String[] args) throws SQLException {

        System.out.println("Hello world!");

        dataSource = new BasicDataSource();

        dataSource.setUsername(user);
        dataSource.setPassword(pass);
        dataSource.setUrl(url);

        Connection connection = dataSource.getConnection();

    }
}
