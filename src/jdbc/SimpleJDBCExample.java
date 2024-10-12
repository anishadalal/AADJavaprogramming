package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SimpleJDBCExample {

	public static void main(String[] args) {
		 // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/db";
        String user = "root";
        String password = "743426";
        
        // JDBC connection and statement
        Connection connection = null;
        Statement statement = null;
        
        try {
        	// 1. Establish the connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // 2. Create a statement
            statement = connection.createStatement();
            
            // 3. Execute SQL query to create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Users ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "email VARCHAR(100))";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'Users' created.");

            // 4. Insert sample data with exception handling
            try {
                String insertDataSQL = "INSERT INTO Users (id, name, email) "
                        + "VALUES (1, 'John Doe', 'john@example.com'), "
                        + "(2, 'Jane Smith', 'jane@example.com') "
                        + "ON DUPLICATE KEY UPDATE name='John Doe', email='john@example.com'";
                statement.executeUpdate(insertDataSQL);
                System.out.println("Data inserted.");
            } catch (SQLException e) {
                System.out.println("Insert failed: " + e.getMessage());
            }

            // 5. Execute query to retrieve data
            String selectSQL = "SELECT * FROM Users";
            ResultSet resultSet = statement.executeQuery(selectSQL);
            
            // 6. Check if the result set has data
            if (!resultSet.isBeforeFirst()) {
                System.out.println("No data found.");
            } else {
                System.out.println("Data from 'Users' table:");
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String email = resultSet.getString("email");
                    System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the resources
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

	}

}
