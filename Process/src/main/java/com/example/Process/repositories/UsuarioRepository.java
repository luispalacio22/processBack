/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Process.repositories;

import com.example.Process.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ASUS AMD A12
 */
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
}
