package com.utp.servidor.controller;

import java.util.List;

import com.utp.servidor.dto.ProductosDTO;
import com.utp.servidor.utils.MensajeResponse;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utp.servidor.entidad.Productos;
import com.utp.servidor.services.ProductosServices;

@RestController//API
@RequestMapping("/productos")//endpoint para acceder a la clase
public class ProductosController {
	@Autowired
	private ProductosServices servicioProd;

	@Autowired
	private ModelMapper mapper;
	
	//endpoint para registrar
	@PostMapping("/guardar")
	public ResponseEntity<?> guardar(@Valid @RequestBody ProductosDTO bean) {
		try {
			Productos doc=mapper.map(bean, Productos.class);
			Productos d=servicioProd.registrar(doc);
			ProductosDTO dto=mapper.map(d, ProductosDTO.class);

			return new ResponseEntity<>(MensajeResponse.builder()
					.mensaje("Guardado correctamente")
					.object(dto).build(), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(MensajeResponse.builder()
					.mensaje(e.getMessage())
					.object(null).build(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	//endpoint para listar
	@GetMapping("/listar")
	public List<Productos> listar(){
		return servicioProd.listarTodos();
	}
	//endpoint para buscar
	@GetMapping("/buscar/{codigo}")
	public Productos buscar(@PathVariable Integer codigo){
		return servicioProd.buscarPorID(codigo);
	}
	
}






