package com.clickmed.api.controller;

import com.clickmed.entity.Clinica;
import com.clickmed.entity.Usuario;
import com.clickmed.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class UserController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.POST, value = "/api/usuario", headers = "Accept=application/json")
    public @ResponseBody
    String inserirUsuario(@RequestBody Usuario usuario) {
        try {
            usuario.setSenha(passwordEncoder().encode(usuario.getSenha()));
            usuarioService.insereUsuario(usuario);
            return "Usuário criado com sucesso";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}