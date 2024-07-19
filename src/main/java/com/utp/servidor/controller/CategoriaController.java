package com.utp.servidor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utp.servidor.entidad.Categoria;
import com.utp.servidor.services.CategoriaServices;

@RestController//API
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	private CategoriaServices servicioCat;
	//endpoint para listar
	@GetMapping("/listar")
	public List<Categoria> listar(){
		return servicioCat.listarTodos();
	}

}
