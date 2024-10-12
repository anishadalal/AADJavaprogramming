package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class CrudExample {
	
	 private static final String DB_URL = "jdbc:mysql://localhost:3306/my_db";
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
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Products ("
                    + "ID INT AUTO_INCREMENT PRIMARY KEY, "
                    + "Name VARCHAR(255) NOT NULL, "
                    + "Price DECIMAL(10, 2) NOT NULL)";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully.");

            // Step 5: Insert data into the table
            String insertSQL = "INSERT INTO Products (Name, Price) VALUES "
                    + "('Laptop', 800.00), "
                    + "('Smartphone', 600.00), "
                    + "('Tablet', 300.00)";
            statement.executeUpdate(insertSQL);
            System.out.println("Data inserted successfully.");

            // Step 6: Retrieve and display data
            String selectSQL = "SELECT * FROM Products";
            ResultSet resultSet = statement.executeQuery(selectSQL);
            System.out.println("Current products in the database:");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                double price = resultSet.getDouble("Price");
                System.out.println("ID: " + id + ", Name: " + name + ", Price: $" + price);
            }

            // Step 7: Update a product's price
            String updateSQL = "UPDATE Products SET Price = 750.00 WHERE Name = 'Laptop'";
            statement.executeUpdate(updateSQL);
            System.out.println("Product price updated successfully.");

            // Step 8: Delete a product
            String deleteSQL = "DELETE FROM Products WHERE Name = 'Tablet'";
            statement.executeUpdate(deleteSQL);
            System.out.println("Product deleted successfully.");

            // Step 9: Retrieve and display updated data
            resultSet = statement.executeQuery(selectSQL);
            System.out.println("Updated products in the database:");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                double price = resultSet.getDouble("Price");
                System.out.println("ID: " + id + ", Name: " + name + ", Price: $" + price);
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
