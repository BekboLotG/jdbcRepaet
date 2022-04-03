package org.service;


import org.model.City;

import java.util.List;

public interface CityService {

    void createCityTable();
    void addCity(String name,String sight,String location ,int area, int population);
    void deleteById(int id);
    List<City> getAllCities();
    void deleteAll();


}
