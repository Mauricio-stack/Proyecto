package com.utp.servidor.utils;


//@ResponseStatus(code=HttpStatus.NOT_FOUND, reason="Código no existe")
//extends RuntimeException{
//@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class ModeloNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ModeloNotFoundException(String mensaje) {
		super(mensaje);
	}
}
