package org.dao;

import org.model.Mayor;

import java.util.List;

public interface MayorDao {
    void createMayorTable();
    void addMayor(String name,String surname,String city,int age);
    List<Mayor> getAllMayors();
    void deleteById(int id);
    void deleteAll();

}
