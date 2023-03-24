package com.example.services;

import java.util.List;

import com.example.dao.CorreoDao;
import com.example.entities.Correo;

public class CorreoServiceImpl implements CorreoService{


private CorreoDao correoDao;

    @Override
    public List<Correo> findAll() {
        return correoDao.findAll();
    }

    @Override
    public Correo findById(int idCorreo) {
        return correoDao.findById(idCorreo).get();
    }

    @Override
    public void save(Correo correo) {
        
        correoDao.save(correo);
    }

    @Override
    public void deleteById(int idCorreo) {
        correoDao.deleteById(idCorreo);
    }
    
}
