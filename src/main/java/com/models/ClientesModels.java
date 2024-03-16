package com.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="clientes")
public class ClientesModels {

        //Atributos
        @Id
        private String dni;

        @Column(name ="nombre")
        private String nombre;

        @Column
        private int edad;

}
