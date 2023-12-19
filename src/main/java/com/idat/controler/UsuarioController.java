package com.idat.controler;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.idat.entity.Fabrica;
import com.idat.entity.Usuario;
import com.idat.response.LoginResponse;
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
    public String login(@ModelAttribute("usuarioL") Usuario usuarioLogin, RedirectAttributes redirectAttributes) {
        Usuario usuario = usuarioService.getUsuarioPorEmail(usuarioLogin.getEmail());
        if (usuario != null && usuario.getContrasena().equals(usuarioLogin.getContrasena())) {
            Fabrica fabrica = usuarioService.getFabricaPorUsuarioId(usuario.getId_usuario());
            redirectAttributes.addFlashAttribute("message", "Login exitoso");
            redirectAttributes.addFlashAttribute("fabrica", fabrica);
            return "redirect:/menu";
        } else {
            redirectAttributes.addFlashAttribute("message", "No tiene autorización");
            return "redirect:/login";
        }
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }
}
