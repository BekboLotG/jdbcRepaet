package org.dao;

import org.model.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static util.DataBase.connection;

public class CountryDaoImpl implements CountryDao {

    public CountryDaoImpl() {
    }

    @Override
    public void createCountryTable() {
        String sql="create table countries(" +
                "id serial not null," +
                "state varchar(250) not null," +
                "type varchar(200) not null," +
                "headOfState varchar(100) not null," +
                "population int);";
        try(Connection connection= connection();
            Statement statement =connection.createStatement()){
            statement.executeUpdate(sql);
            System.out.println("Created table");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void addCountry(String state,String type,String headOfState,long population) {
        String sql ="insert into countries(state,type,headOfState,population)"+"values(?,?,?,?)";
        try(Connection connection=connection();
            PreparedStatement preparedStatement=connection.prepareStatement(sql)){
            preparedStatement.setString(1,state);
            preparedStatement.setString(2,type);
            preparedStatement.setString(3,headOfState);
            preparedStatement.setLong(4,population);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        String sql="delete from countries where id=?";
        try(Connection connection=connection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public List<Country> getAllCountries() {
        String sql="select * from countries";
        List<Country> countries= new ArrayList<>();
        try(Connection connection=connection();
        PreparedStatement preparedStatement =connection.prepareStatement(sql)) {
            ResultSet resultSet= preparedStatement.executeQuery();

            while (resultSet.next()){
                Country country= new Country();
                country.setId(resultSet.getInt("id"));
                country.setState(resultSet.getString("state"));
                country.setType(resultSet.getString("type"));
                country.setHeadOfState(resultSet.getString("headOfState"));
                country.setPopulation(resultSet.getInt("population"));
                countries.add(country);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return countries;
    }

    public void deleteAll() {
        String sql="truncate table countries";

        try (Connection connection=connection();
         Statement statement=connection.createStatement()){
            statement.executeUpdate(sql);
            System.out.println("Deleted all.");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
