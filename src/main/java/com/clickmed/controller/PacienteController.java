package com.clickmed.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Paciente;
import com.clickmed.entity.Teste;
import com.clickmed.service.PacienteService;
import com.clickmed.service.UsuarioService;

@Controller 
public class PacienteController {

	
	@Autowired
	PacienteService pacienteService;
	
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String index(ModelMap model, Teste teste) {
		return "index";
	}
	
	@RequestMapping(value = "/listaPacientes", method = RequestMethod.GET)
	public String listaPacientes(ModelMap model) {
		model.put("pacientes", pacienteService.listaPacientes());
		return "pacientes";
	}
	
	
	@RequestMapping(value = "/Paciente", method = RequestMethod.GET)
	public String carregaCadastro(ModelMap model) {
		return "cadastro-paciente";
	}
	
	
	
	@RequestMapping(value = "/cadastraPaciente", method = {RequestMethod.POST})
	public String cadastraPaciente( Paciente paciente,  ModelMap model) {
		System.out.println(paciente.toString());
		try {
			paciente.setUsuario(usuarioService.insereUsuario(paciente.getUsuario()));
			System.out.println(paciente.toString());
			pacienteService.inserePaciente(paciente);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(paciente.toString());
		
		return listaPacientes(model);
	}
}
