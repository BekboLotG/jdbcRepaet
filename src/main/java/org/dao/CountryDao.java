package org.dao;

import org.model.Country;

import java.util.List;

public interface CountryDao {
    void createCountryTable();
    void addCountry(String state,String type,String headOfState,long population);
    void deleteById(int id);
    List<Country> getAllCountries();
    void deleteAll();
}
