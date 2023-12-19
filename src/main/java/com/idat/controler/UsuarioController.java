package com.idat.controler;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.idat.entity.Usuario;
import com.idat.service.UsuarioService;


@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String login_GET(Model model) {
        Usuario usuarioModel = new Usuario();
        model.addAttribute("usuarioL", usuarioModel);
        return "login";
    }

    @PostMapping("/login")
    public String login_POST(@ModelAttribute("usuarioL") Usuario usuario, HttpSession session) {
        Usuario usuarioExistente = usuarioService.getUsuarioPorEmail(usuario.getEmail());
        if (usuarioExistente == null) {
            return "redirect:/login?unregistered";
        } else if (usuarioExistente.getContrasena().equals(usuario.getContrasena())) {
            session.setAttribute("usuarioIniciado", usuario.getEmail());
            return "redirect:/piezas/buscarPiezas";
        }
        return "redirect:/login?invalid";
    }
}
  	
  	/*
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
    }*/
