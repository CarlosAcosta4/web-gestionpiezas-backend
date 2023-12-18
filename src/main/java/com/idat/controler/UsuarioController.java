package com.idat.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.entity.Fabrica;
import com.idat.entity.Usuario;
import com.idat.response.LoginResponse;
import com.idat.service.UsuarioService;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody Usuario usuarioLogin) {
        Usuario usuario = usuarioService.getUsuarioPorNombre(usuarioLogin.getEmail());
        LoginResponse response = new LoginResponse();
        if (usuario != null && usuario.getContrasena().equals(usuarioLogin.getContrasena())) {
            Fabrica fabrica = usuarioService.getFabricaPorUsuarioId(usuario.getId_usuario());
            response.setMessage("Login exitoso");
            response.setFabrica(fabrica);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.setMessage("No tiene autorización");
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }
    }
}