package com.utp.servidor.entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_distrito")
public class Distritos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_car")
    private Integer cod;
    @Column(name = "nom_car")
    private String nom;

    //anular json
    @JsonIgnore
    //relación uno a muchos
    @OneToMany(mappedBy = "distritos")//ASOC
    private List<Cliente> listaCliente;
}
