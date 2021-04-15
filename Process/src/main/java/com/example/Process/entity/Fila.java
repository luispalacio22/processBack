/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Process.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="fila")
public class Fila {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int duracion;
    
//    @OneToMany
//    @JoinColumn(name="tarea_id")
//    private Tarea tarea;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario; 
}
