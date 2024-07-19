package com.utp.servidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utp.servidor.entidad.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer>{

}
