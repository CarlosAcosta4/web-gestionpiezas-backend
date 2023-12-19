package com.idat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.entity.Fabrica;
import com.idat.entity.Usuario;
import com.idat.repository.UsuarioRepository;
import com.idat.response.LoginResponse;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
    public Usuario getUsuarioPorEmail(String email) {
        return usuarioRepository.findFirstByEmail(email);
    }
    
    public Fabrica getFabricaPorUsuarioId(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario != null) {
            return usuario.getFabrica();
        } else {
            return null;
        }
    }
    
    public Usuario getUsuarioPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }
    

}