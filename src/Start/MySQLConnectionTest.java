package Start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLConnectionTest {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/promatch";
    private static final String USER = "root";
    private static final String PASSWORD = "5125";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Connect to the database
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println("Database connection successful.");

            // Insert data into the users table
            String insertQuery = "INSERT INTO users (user_name, user_email, user_pass) VALUES (?, ?, ?)";

            try (PreparedStatement insertStatement = connection.prepareStatement(insertQuery)) {
                // Insert data into the users table
                String user_name = "rei050r";  // Replace with your desired user_id
                String userPass = "1234";      // Replace with your desired user_pass
                String userEmail = "d";

                insertStatement.setString(1, user_name);
                insertStatement.setString(2, userEmail);
                insertStatement.setString(3, userPass);
                insertStatement.executeUpdate();
            }

            System.out.println("Data insertion completed.");

        } catch (SQLException e) {
            System.err.println("Database connection or data insertion failed. Error message: " + e.getMessage());

        } finally {
            // Close the connection
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
