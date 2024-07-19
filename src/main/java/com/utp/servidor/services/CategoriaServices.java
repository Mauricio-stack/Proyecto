package com.utp.servidor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utp.servidor.entidad.Categoria;
import com.utp.servidor.repository.CategoriaRepository;

@Service
public class CategoriaServices {
	@Autowired
	private CategoriaRepository repo;
	
	public List<Categoria> listarTodos(){
		return repo.findAll();
	}
	public Categoria buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
}
