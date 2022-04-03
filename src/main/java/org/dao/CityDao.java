package org.dao;

import org.model.City;

import java.util.List;

public interface CityDao {
    void createCityTable();
    void addCity(String name, String location, String sight, int area, int population);
    void deleteById(int id);
    List<City> getAllCities();
    void deleteAll();
}
