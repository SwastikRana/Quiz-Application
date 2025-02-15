/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author manishtiwari
 */
public class DatabaseConnection {
 
    private static final String JDBC_URL = "jdbc:mysql://root@localhost:3306/quizdb";
   /* private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";*/

    private Connection connection;

    public DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(JDBC_URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
