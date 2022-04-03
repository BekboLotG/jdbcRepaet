package org.service;

import org.model.City;
import org.model.Country;

import java.util.List;

public interface CountryService {
    void createCityTable();
    void addCountry(String state,String type,String headOfState,long population);
    void deleteById(int id);
    List<Country> getAllCountries();
    void deleteAll();
}
