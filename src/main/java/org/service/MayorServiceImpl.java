package org.service;

import org.dao.MayorDao;
import org.dao.MayorDaoImpl;
import org.model.Mayor;

import java.util.List;

public class MayorServiceImpl implements MayorService{

    MayorDao mayorDao= new MayorDaoImpl();

    @Override
    public void createMayorTable() {
        mayorDao.createMayorTable();
    }

    @Override
    public void addMayor(String name,String surname,String city,int age) {
        mayorDao.addMayor(name, surname, city, age);
    }

    @Override
    public List<Mayor> getAllMayor() {
        return mayorDao.getAllMayors();
    }

    @Override
    public void deleteById(int id) {
        mayorDao.deleteById(id);
    }

    @Override
    public void deleteAll() {
        mayorDao.deleteAll();
    }
}
