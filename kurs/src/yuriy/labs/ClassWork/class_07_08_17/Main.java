package yuriy.labs.ClassWork.class_07_08_17;

import java.sql.*;

/**
 * Created by Ruble on 07.08.2017.
 */
public class Main
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException

    {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test2", "root", "1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users"))
        {
        while (resultSet.next())
        {
            System.out.printf("ID : %d, name: %s\n", resultSet.getInt(1),
            resultSet.getString(2));

        }
        }
        catch (SQLException e){e.printStackTrace();}
    }
}
