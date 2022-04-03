package org;

import org.dao.CountryDao;
import org.model.City;
import org.model.Country;
import org.model.Mayor;
import org.service.*;
import util.DataBase;

public class App
{
    public static void main( String[] args )
    {
//        DataBase.connection();

        CityService cityService = new CityServiceImpl();
//        cityService.createCityTable();

        City city = new City("Alhambra","Spain","Calle Real de la Alhambra",300,10000);
        City city2 = new City("Мaчу-Пикчу","Peru","«Затерянный город» Мачу-Пикчу ",400,1000);
        City city3 = new City("Петра","Иордания","Розовый город, вполовину такой же старый, как само время-Петра",400,24000);
        City city4 = new City("Carrer de Mallorca","Barcelona","Собор Святого Семейства",700,20000);
        City city5 = new City("Тадж-Махал","India","Taj Road",600,15000);

//       cityService.addCity(city.getName(),city.getLocation(),city.getSight(),city.getArea(),city.getPopulation());
//       cityService.addCity(city2.getName(),city2.getLocation(),city2.getSight(),city2.getArea(),city2.getPopulation());
//       cityService.addCity(city3.getName(),city3.getLocation(),city3.getSight(),city3.getArea(),city3.getPopulation());
//       cityService.addCity(city4.getName(),city4.getLocation(),city4.getSight(),city4.getArea(),city4.getPopulation());
//       cityService.addCity(city5.getName(),city5.getLocation(),city5.getSight(),city5.getArea(),city5.getPopulation());

//        for (City s:cityService.getAllCities()) {
//            System.out.println("\n"+ s);
//        }

//        cityService.deleteById(3);
//        cityService.deleteAll();
      // part 2

        CountryService countryService = new CountryServiceImpl();
//        countryService.createCityTable();
        Country country =new Country("Australia","Queen"," Elizabeth II", 25750198);
        Country country2 =new Country(" The United States","president"," Joseph Biden", 	334805269);
        Country country3=new Country("Japan","Emperor"," Naruhito", 1257135454);
        Country country4 =new Country("Malaysia","Yang di-Pertuan Agong(King)","  Abdullah Sultan Ahmad Shah", 157135454);
        Country country5 =new Country("Singapore","president"," Halimah Yacob", 1345135454);

//        countryService.addCountry(country.getState(),country.getType(),country.getHeadOfState(),country.getPopulation());
//        countryService.addCountry(country2.getState(),country2.getType(),country2.getHeadOfState(),country2.getPopulation());
//        countryService.addCountry(country3.getState(),country3.getType(),country3.getHeadOfState(),country3.getPopulation());
//        countryService.addCountry(country4.getState(),country4.getType(),country4.getHeadOfState(),country4.getPopulation());
//        countryService.addCountry(country5.getState(),country5.getType(),country5.getHeadOfState(),country5.getPopulation());

 //       for (Country c: countryService.getAllCountries()) {
  //          System.out.println("\n" +c);
  //      }
//         countryService.deleteById(2);
//           countryService.deleteAll();

        // 3 part

        MayorService mayorService = new MayorServiceImpl();
//        mayorService.createMayorTable();
        Mayor mayor= new Mayor("John","Tory",50,"Toronto");
        Mayor mayor2= new Mayor("Eva","Weber",40," Augsburg");
        Mayor mayor3= new Mayor("John","So",55,"Melbourne");
        Mayor mayor4= new Mayor("Philipp","Kutter",38,"Wädenswil");

//        mayorService.addMayor(mayor.getName(),mayor.getSurname(),mayor.getCity(),mayor.getAge());
//        mayorService.addMayor(mayor2.getName(),mayor2.getSurname(),mayor2.getCity(),mayor2.getAge());
//        mayorService.addMayor(mayor3.getName(),mayor3.getSurname(),mayor3.getCity(),mayor3.getAge());
//        mayorService.addMayor(mayor4.getName(),mayor4.getSurname(),mayor4.getCity(),mayor4.getAge());

//        mayorService.getAllMayor();
//        mayorService.deleteById(3);
        mayorService.deleteAll();








    }
}
