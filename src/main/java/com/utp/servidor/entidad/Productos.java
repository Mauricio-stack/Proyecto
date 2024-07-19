package com.utp.servidor.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb_productos")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_doc")
	private Integer codigo;

	@Column(name = "nom_pro")
	private String nombre;

	@Column(name = "des_pro")
	private String descripcion;


	@Column(name = "marca_pro")
	private String marca;

	@Column(name = "can_pro")
	private int cantidad;

	@Column(name = "pre_pro")
	private double precio;

	//relación muchos a uni
	@ManyToOne
	@JoinColumn(name = "cod_dis_doc")
	private Categoria categoria;//ASOC

}
