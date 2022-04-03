package org.service;

import org.model.Mayor;

import java.util.List;

public interface MayorService {
    void createMayorTable();
    void addMayor(String name,String surname,String city,int age);
    List<Mayor> getAllMayor();
    void deleteById(int id);
    void deleteAll();
}
