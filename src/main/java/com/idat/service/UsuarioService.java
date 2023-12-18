package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.entity.Fabrica;
import com.idat.entity.Usuario;
import com.idat.repository.UsuarioRepository;

@Service
public class UsuarioService {
   @Autowired
	private final UsuarioRepository usuarioRepository = null;
    
    public Usuario getUsuarioPorNombre(String email) {
        return usuarioRepository.findByEmail(email).orElse(null);
    }
    
    public Fabrica getFabricaPorUsuarioId(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario != null) {
            return usuario.getFabrica();
        } else {
            return null;
        }
    }
    
}