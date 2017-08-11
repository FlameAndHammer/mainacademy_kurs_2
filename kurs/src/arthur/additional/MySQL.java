package arthur.additional;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by arthk on 07.08.2017.
 * с помощью sql добавить в таблицу pets колонку type в которую будет записано что это за животное (cat, dog, etc).
 написать программу для работы с базой (вносить новые записи, читать записи)
 при старте программы должно выводиться
 1 - new user
 2 - new pet
 3 - print report
 0 - exit
 пользователь должен с клавиатуры ввести номер нужной команды
 если ввел 1 то на экране пишется введите имя. когда ввели имя пишется что пользователь создан и снова печатаем список команд.
 тоже для new pet
 если выбрали print reports то печатаем
 1 - users
 2 - pets
 3 - users and pets
 0 - exit
 и в зависимости от того что введет пользователь выводим соответствующий отчет. после чего возвращаемся в основное меню
 */
public class MySQL {

    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/test2";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] argv) {
        
                    selectUsers();
        System.out.println();
                    selectPets();
        System.out.println();
                    selectUsersAndPets();
    }

    private static void selectUsers()  {
        String selectSQL = "SELECT * FROM users ";
        try (  Connection dbConnection = getDBConnection();
                PreparedStatement ps = dbConnection.prepareStatement(selectSQL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String userID = rs.getString("id");
                String userName = rs.getString("name");
                System.out.print("user id : " + userID);
                System.out.println("   user name : " + userName);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void selectPets()  {
        String selectSQL = "SELECT * FROM pets  ";
        try (  Connection dbConnection = getDBConnection();
               PreparedStatement ps = dbConnection.prepareStatement(selectSQL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String petsId = rs.getString("id");
                String petsName = rs.getString("name");
                System.out.print("Pet`s Id : " + petsId);
                System.out.println("   Pet`s name : " + petsName);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void selectUsersAndPets()  {
        String selectSQL = "select u.id, u.name, p.type,p.name from users u " +
                " join pets p on u.id = p.owner  ";
        try (  Connection dbConnection = getDBConnection();
               PreparedStatement ps = dbConnection.prepareStatement(selectSQL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String userId = rs.getString("u.id");
                String userName = rs.getString("u.name");
                String petsType = rs.getString("p.type");
                String petsName = rs.getString("p.name");

                System.out.print("User ID : " + userId);
                System.out.print(" username : " + userName);
                System.out.print("  Pet`s type : " + petsType);
                System.out.println("  Pet`s name : " + petsName);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void insertUser(){



    }

    private static Connection getDBConnection() throws SQLException {
        try { Class.forName(DB_DRIVER);}
        catch (ClassNotFoundException e) {e.printStackTrace();}
        return DriverManager.getConnection( DB_CONNECTION, DB_USER, DB_PASSWORD);
    }
}


