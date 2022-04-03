package org.service;

import org.dao.CountryDao;
import org.dao.CountryDaoImpl;
import org.model.Country;

import java.util.List;

public class CountryServiceImpl implements CountryService {

    CountryDao countryDao = new CountryDaoImpl();

    @Override
    public void createCityTable() {
        countryDao.createCountryTable();
    }

    @Override
    public void addCountry(String state, String type, String headOfState, long population) {
            countryDao.addCountry(state, type, headOfState, population);
    }

    @Override
    public void deleteById(int id) {
        countryDao.deleteById(id);
    }


    @Override
    public List<Country> getAllCountries() {

        return countryDao.getAllCountries();
    }

    @Override
    public void deleteAll() {
        countryDao.deleteAll();
    }


}
