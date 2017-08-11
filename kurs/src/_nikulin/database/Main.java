package _nikulin.database;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        int from = 2;
        int to = 5;

        printUsersBetween(from, to);
    }


    private static void printUsersBetween(int from, int to) {
        ResultSet resultSet = null;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2",
                "root", "root");
             PreparedStatement statement = connection.prepareStatement(
                     "SELECT * FROM users WHERE id BETWEEN ? AND ?")) {
            statement.setInt(1, from);
            statement.setInt(2, to);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.printf("ID: %d, name: %s\n", resultSet.getInt(1),
                        resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
