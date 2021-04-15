/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Process.rest;

import com.example.Process.entity.Dependencia;
import com.example.Process.entity.Perfil;
import com.example.Process.entity.Usuario;
import com.example.Process.entity.services.DependenciaService;
import com.example.Process.entity.services.UsuarioService;
import com.example.Process.entity.services.PerfilService;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS AMD A12
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioRest {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private PerfilService perfilService;
    
    @Autowired
    private DependenciaService dependenciaService;
    
    @GetMapping()
    private ResponseEntity<List<Usuario>> getAllUsuarios(){
        return ResponseEntity.ok(usuarioService.findAll());
    }
    @PostMapping
	private ResponseEntity<Usuario> saveUsuario (@RequestBody Usuario usuario){
		try {
			Usuario usuarioGuardado = usuarioService.save(usuario);		
		return ResponseEntity.created(new URI("/usuario/"+usuarioGuardado.getId())).body(usuarioGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteUsuario (@PathVariable ("id") Long id){
		usuarioService.deleteById(id);
		return ResponseEntity.ok(!(usuarioService.findById(id)!=null));
		
	}
    
     @GetMapping("/perfil")
    private ResponseEntity<List<Perfil>> getAllPerfiles(){
        return ResponseEntity.ok(perfilService.findAll());
    }
    
      @GetMapping("/dependencia")
    private ResponseEntity<List<Dependencia>> getAllDependencias(){
        return ResponseEntity.ok(dependenciaService.findAll());
    }
}
