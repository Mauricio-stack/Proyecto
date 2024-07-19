package com.utp.servidor.controller;


import com.utp.servidor.entidad.Distritos;
import com.utp.servidor.services.DIstritosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/distritos")
public class DistritosController {
    @Autowired
    private DIstritosServices servicio;
    //endpoint para listar
    @GetMapping("/listar")
    public List<Distritos> listar(){
        return servicio.listarTodos();
    }

}
