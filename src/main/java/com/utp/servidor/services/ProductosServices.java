package com.utp.servidor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utp.servidor.entidad.Productos;
import com.utp.servidor.repository.ProductosRepository;

@Service
public class ProductosServices {
	@Autowired
	private ProductosRepository repo;
	
	public List<Productos> listarTodos(){

		return repo.findAll();
	}

	public Productos buscarPorID(Integer cod) {

		return repo.findById(cod).orElse(null);
	}

	public Productos registrar(Productos bean) {

		return repo.save(bean);//código del docente tiene que ser 0
	}

	public void actualizar(Productos bean) {

		repo.save(bean);//código del docente tiene que existir
	}

	public void eliminar(Integer cod) {

		repo.deleteById(cod);
	}
}












