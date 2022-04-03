package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    public static final String url="jdbc:postgresql://localhost:5432/postgres";
    public static final String user="postgres";
    public static final String pass="bekbolot";

    public static Connection connection(){
        Connection connection = null;
        try{
            connection= DriverManager.getConnection(url,user,pass);
            System.out.println("Connected...");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }


}
