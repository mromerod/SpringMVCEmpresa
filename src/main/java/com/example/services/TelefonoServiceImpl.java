package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.TelefonoDao;
import com.example.entities.Telefono;

public class TelefonoServiceImpl implements TelefonoService{

@Autowired
 private TelefonoDao telefonoDao;

    @Override
    public List<Telefono> findAll() {
     return telefonoDao.findAll();
    }

    @Override
    public Telefono findById(int idTelefono) {
       return telefonoDao.findById(idTelefono).get();
    }

    @Override
    public void save(Telefono telefono) {
        telefonoDao.save(telefono);
    }

    @Override
    public void deleteById(int idTelefono) {
        telefonoDao.deleteById(idTelefono);
    }
    
}
