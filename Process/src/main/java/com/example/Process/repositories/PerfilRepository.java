/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Process.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Process.entity.Perfil;

/**
 *
 * @author ASUS AMD A12
 */
public interface PerfilRepository extends JpaRepository<Perfil,Long> {
    
}
