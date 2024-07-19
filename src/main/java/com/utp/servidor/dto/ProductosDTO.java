package com.utp.servidor.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductosDTO {

	private Integer codigo;

	@NotNull(message="Campo nombre no puede ser nulo")
	private String nombre;

	@NotNull(message="Campo descripcion no puede ser nulo")
	private String descripcion;

	@NotNull(message="Campo marca no puede ser nulo")
	private String marca;

	@Min(value=1, message="Debe ingresar una cantidad mínima: 1")
	@Max(value=999, message="Ha excedido el límite de cantidad")
	private int cantidad;

	@NotNull(message="Campo no puede ser nulo")
	private double precio;
	private CategoriaDTO categoria;
}