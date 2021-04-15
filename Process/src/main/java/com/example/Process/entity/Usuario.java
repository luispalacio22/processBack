/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Process.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ASUS AMD A12
 */
@Entity
@Table(name="usuario")
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String fechaNacimiento;
    
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="dependencia_id")
    private Dependencia dependencia;
    @ManyToOne
    @JoinColumn(name="perfil_id")
    private Perfil perfil;
//    
    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    private List<Fila> filas;

    public Usuario() {
    }

 

    public Usuario(String nombre, String fechaNacimiento, boolean activo, Dependencia dependencia, Perfil perfil) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
        this.dependencia = dependencia;
        this.perfil = perfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Dependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

//    public List<Fila> getFilas() {
//        return filas;
//    }
//
//    public void setFilas(List<Fila> filas) {
//        this.filas = filas;
//    }
//    
    
}
