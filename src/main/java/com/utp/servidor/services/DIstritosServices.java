package com.utp.servidor.services;

import com.utp.servidor.entidad.Distritos;
import com.utp.servidor.repository.DistritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DIstritosServices {

    @Autowired
    private DistritosRepository repositorio;

    public List<Distritos> listarTodos(){

        return repositorio.findAll();
    }
    public Distritos buscarPorID(Integer codigo) {

        return repositorio.findById(codigo).orElse(null);
    }
}
