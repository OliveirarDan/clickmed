package com.clickmed.api.controller;

import java.io.IOException;
import java.util.List;

import com.clickmed.entity.Usuario;
import com.clickmed.service.PacienteService;
import com.clickmed.service.UsuarioService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.clickmed.entity.Medico;
import com.clickmed.service.BuscaService;
import com.clickmed.service.MedicoService;

@Controller
public class ApiUsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private MedicoService medicoService;

    @Autowired
    private PacienteService pacienteService;
    private Usuario Usuario;



    @RequestMapping(method = RequestMethod.POST, value = "/api/auth", headers = "Accept=application/json")
    public @ResponseBody Usuario autenticar(@RequestBody Usuario usuario)  throws IOException {
        try {
            usuarioService.autenticar(usuario);
            return usuario;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

