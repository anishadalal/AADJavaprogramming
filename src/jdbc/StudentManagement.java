package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class StudentManagement {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/abc_db";
    private static final String USER = "root";
    private static final String PASS = "743426";
	
    public static void main(String[] args) {
    	Connection connection = null;
        Statement statement = null;

        try {
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            // Step 3: Create a statement
            statement = connection.createStatement();

            // Step 4: Create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Students ("
                    + "ID INT AUTO_INCREMENT PRIMARY KEY, "
                    + "Name VARCHAR(255) NOT NULL, "
                    + "Age INT NOT NULL, "
                    + "Major VARCHAR(255))";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully.");

            // Step 5: Insert data into the table
            String insertSQL = "INSERT INTO Students (Name, Age, Major) VALUES "
                    + "('Alice Johnson', 20, 'Computer Science'), "
                    + "('Bob Smith', 22, 'Mathematics'), "
                    + "('Charlie Brown', 19, 'Physics')";
            statement.executeUpdate(insertSQL);
            System.out.println("Data inserted successfully.");

            // Step 6: Retrieve and display data
            String selectSQL = "SELECT * FROM Students";
            ResultSet resultSet = statement.executeQuery(selectSQL);
            System.out.println("Current students in the database:");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                int age = resultSet.getInt("Age");
                String major = resultSet.getString("Major");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Major: " + major);
            }

            // Step 7: Update a student's name
            String updateSQL = "UPDATE Students SET Name = 'Alice Williams' WHERE Name = 'Alice Johnson'";
            statement.executeUpdate(updateSQL);
            System.out.println("Student name updated successfully.");

            // Step 8: Delete a student
            String deleteSQL = "DELETE FROM Students WHERE Name = 'Charlie Brown'";
            statement.executeUpdate(deleteSQL);
            System.out.println("Student deleted successfully.");

            // Step 9: Retrieve and display updated data
            resultSet = statement.executeQuery(selectSQL);
            System.out.println("Updated students in the database:");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                int age = resultSet.getInt("Age");
                String major = resultSet.getString("Major");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Major: " + major);
            }

            // Close the ResultSet
            resultSet.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Step 10: Clean up
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

	}

}
