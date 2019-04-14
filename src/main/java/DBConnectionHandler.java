import java.sql.*;

public class DBConnectionHandler {

    private static Connection conn;
    private static String url = "CODERKIDS@COT-CIS3365-03.cougarnet.uh.edu";
    private static String user = "elhayne2";
    private static String pass = "Honey!1996";


    private DBConnectionHandler() {
    }


    private static Connection connect() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        } catch (ClassNotFoundException cnfe) {
            System.err.println("Error: " + cnfe.getMessage());
        } catch (InstantiationException ie) {
            System.err.println("Error: " + ie.getMessage());
        } catch (IllegalAccessException iae) {
            System.err.println("Error: " + iae.getMessage());
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