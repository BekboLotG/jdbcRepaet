package org.dao;

import org.model.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static util.DataBase.connection;

public class CityDaoImpl implements CityDao{

    public CityDaoImpl(){

    }

    @Override
    public void createCityTable() {

        String sql="CREATE TABLE IF NOT EXISTS cities(" +
                "id serial," +
                "name varchar (200) not null," +
                "location varchar (200) not null," +
                "area int," +
                "population int," +
                "sight varchar (200));";

        try(Connection connection=connection();
            Statement statement=connection.createStatement()){
            statement.executeUpdate(sql);
            System.out.println("Table \"cities\" is created successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void addCity(String name, String location, String sight, int area, int population) {

        String sql="insert into cities (name,location,sight,area,population)" + "values(?,?,?,?,?)";
        try(Connection connection=connection();
            PreparedStatement preparedStatement =connection.prepareStatement(sql)){
            preparedStatement.setString(1,name);
            preparedStatement.setString(3,location);
            preparedStatement.setString(2,sight);
            preparedStatement.setInt(4,area);
            preparedStatement.setInt(5,population);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        String sql="delete from cities where"+" id =?";

        try(Connection connection =connection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql))
        {
            preparedStatement.setInt(1,id);
            int c=preparedStatement.executeUpdate();
            System.out.println("Deleted record " +c);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<City> getAllCities() {
        List<City> cities= new ArrayList<>();
        String sql="select * from cities";
        try(Connection connection=connection();
            PreparedStatement preparedStatement=connection.prepareStatement(sql)){
            ResultSet resultSet =preparedStatement.executeQuery();

            while(resultSet.next()){
                City city =new City();
                city.setId(resultSet.getInt("id"));
                city.setName(resultSet.getString("name"));
                city.setLocation(resultSet.getString("location"));
                city.setSight(resultSet.getString("sight"));
                city.setArea(resultSet.getInt("area"));
                city.setPopulation(resultSet.getInt("population"));
                 cities.add(city);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return cities;
    }

    public  void deleteAll(){
        String sql="truncate table cities";
        try(Connection connection=connection();
            Statement statement=connection.createStatement()){
            statement.executeUpdate(sql);
            System.out.println("All records deleted.");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
