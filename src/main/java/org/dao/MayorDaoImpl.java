package org.dao;

import org.model.Mayor;
import util.DataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MayorDaoImpl implements MayorDao{
    @Override
    public void createMayorTable() {

        String sql="create table mayors(" +
                "id serial not null," +
                "name varchar(200) not null," +
                "surname varchar(200)," +
                "age int not null," +
                "city varchar(200));";
        try (Connection connection= DataBase.connection();
             Statement statement=connection.createStatement()){
            statement.executeUpdate(sql);
            System.out.println("Table created successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void addMayor(String name, String surname, String city, int age) {
        String sql="insert into mayors(name,surname, city,age)"+"values(?,?,?,?)";

        try(Connection connection=DataBase.connection();
            PreparedStatement preparedStatement=connection.prepareStatement(sql)) {
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,surname);
            preparedStatement.setString(3,city);
            preparedStatement.setInt(4,age);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Mayor> getAllMayors() {
        List<Mayor> mayors= new ArrayList<>();
        String sql="select * from mayors";

        try(Connection connection=DataBase.connection();
           PreparedStatement preparedStatement=connection.prepareStatement(sql)) {
            ResultSet resultSet =preparedStatement.executeQuery();

            while (resultSet.next()){
                Mayor mayor = new Mayor();
                mayor.setId(resultSet.getInt("id"));
                mayor.setName(resultSet.getString("name"));
                mayor.setSurname(resultSet.getString("surname"));
                mayor.setAge(resultSet.getInt("age"));
                mayor.setCity(resultSet.getString("city"));

                mayors.add(mayor);
                System.out.println("\n" +mayor);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return mayors;
    }

    @Override
    public void deleteById(int id) {
        String sql="delete from mayors where id=?";

        try (Connection connection =DataBase.connection();
             PreparedStatement preparedStatement=connection.prepareStatement(sql)){
             preparedStatement.setInt(1,id);
             preparedStatement.executeUpdate();
            System.out.println("Deleted successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void deleteAll() {
        String sql="truncate table mayors";

        try (Connection connection=DataBase.connection();
             Statement statement=connection.createStatement()){
             statement.executeUpdate(sql);
             System.out.println("Successfully deleted all records");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
