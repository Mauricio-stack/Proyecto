package com.utp.servidor.dto;

import com.utp.servidor.entidad.Distritos;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ClienteDTO {

    private int codigo;
    //@NotNull(message="Campo nombre no puede ser nulo")

    private String nombre;
    //@NotNull(message="Campo materno no puede ser nulo")

    private String paterno;
    //@NotNull(message="Campo paterno no puede ser nulo")

    private String materno;
    //@Min(value = 1, message = "Ha ingresado pocos dígitos (MAX=9)")
    //@Max(value = 9 , message = "Ha ingresado más de 8 dígitos")
    private String dni;

    private String sexo;

    private Distritos distritos;

}
