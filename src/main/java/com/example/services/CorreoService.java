package com.example.services;

import java.util.List;

import com.example.entities.Correo;

public interface CorreoService {
    public List<Correo> findAll();
    public Correo findById(int idCorreo);
    public void save(Correo correo);
    public void deleteById(int idCorreo);
    
    
}
