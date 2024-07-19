package com.utp.servidor.entidad;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tb_cliente")
public class Cliente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "cod_alu")
        private Integer codigo;

        @Column(name = "nom_alu")
        private String nombre;

        @Column(name = "pat_alu")
        private String paterno;

        @Column(name = "mat_alu")
        private String materno;

        @Column(name = "dni_alu")
        private String dni;

        @Column(name = "sexo_alu")
        private String sexo;

        //relación muchos a uni
        @ManyToOne
        @JoinColumn(name = "cod_car")
        private Distritos distritos;//ASOC
}
