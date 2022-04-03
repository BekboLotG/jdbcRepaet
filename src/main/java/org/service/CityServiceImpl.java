package org.service;

import org.dao.CityDao;
import org.dao.CityDaoImpl;
import org.model.City;

import java.util.List;

public class CityServiceImpl implements CityService{

        CityDao cityDao =new CityDaoImpl();

    @Override
    public void createCityTable() {
        cityDao.createCityTable();
    }

    @Override
    public void addCity(String name, String location, String sight, int area, int population) {
            cityDao.addCity(name, location, sight, area, population);
    }

    @Override
    public void deleteById(int id) {
        cityDao.deleteById(id);
    }

    @Override
    public  List<City> getAllCities() {
        return cityDao.getAllCities();
    }

    public void deleteAll(){
        cityDao.deleteAll();
    }
}
