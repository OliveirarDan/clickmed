package com.clickmed.api.controller;

import com.clickmed.entity.Medico;
import com.clickmed.entity.Paciente;
import com.clickmed.entity.Usuario;
import com.clickmed.service.MedicoService;
import com.clickmed.service.PacienteService;
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

    @Autowired
    PacienteService pacienteService;

    @Autowired
    MedicoService medicoService;

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

    @RequestMapping(method = RequestMethod.GET, value = "/api/usuario/{id}")
    public @ResponseBody Usuario buscaUsuarioPorId(@PathVariable("id") Long id) throws IOException {
        Usuario usuario = usuarioService.buscaUsuario(id);
        return usuario;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/auth/usuario/{email:.+}/")
    public @ResponseBody Object buscaPorEmail(@PathVariable("email") String email) throws IOException {
        Usuario usuario = usuarioService.buscaPorEmail(email);
        Paciente paciente = pacienteService.buscaPacientePorUsuario(usuario);
        if (paciente != null){
            return paciente;
        }else{
            return medicoService.buscaMedicoPorUsuario(usuario);
        }
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}