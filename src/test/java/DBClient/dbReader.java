package DBClient;

import java.sql.*;

public class dbReader {
    public static String getKey() {
        String key = null;
        Connection c = null;
        Statement stmt = null;
        try {

            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/sample_db",
                            "postgres", "123");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        try {
            stmt = c.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql = "SELECT name FROM credentials where id='api_key'";
        try {
            ResultSet temp = stmt.executeQuery(sql);
            while (temp.next()) {
                key = temp.getString("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return key;
    }
}