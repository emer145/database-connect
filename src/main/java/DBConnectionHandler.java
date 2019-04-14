import java.sql.*;

public class DBConnectionHandler {

    private static Connection conn;
  //  private static String url = "CODERKIDS@COT-CIS3365-03.cougarnet.uh.edu";
    private static String url = "jdbc:sqlserver://COT-CIS3365-03.cougarnet.uh.edu;database=CODERKIDS;";

    private static String user = "mason";
    private static String pass = "mason1234";


    public DBConnectionHandler() {
    }


    private static Connection connect() throws SQLException {
        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            Class.forName("com.microsoft.sqlserver").newInstance();

        } catch (ClassNotFoundException a) {
            System.err.println("Error: " + a.getMessage());
        } catch (InstantiationException b) {
            System.err.println("Error: " + b.getMessage());
        } catch (IllegalAccessException c) {
            System.err.println("Error: " + c.getMessage());
        }

        conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (conn != null && !conn.isClosed())
            return conn;
        connect();
        return conn;

    }
}