package academy.belhard;

import java.sql.*;


public class DbConnectionProvider {
    public static final String URL = "jdbc:mysql://localhost:3306/homework_11?useUnicode=true&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASS = "Valar211922fess";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = (Connection) DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
