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

	@RequestMapping(value = "/novoPaciente", method = RequestMethod.GET)
	public String novoPaciente(ModelMap model) {
		return "cadastro-paciente";
	}

	@RequestMapping(value = "/cadastraPaciente", method = { RequestMethod.POST })
	public String cadastraPaciente(Paciente paciente, ModelMap model) {
		try {
			pacienteService.inserePaciente(paciente);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaPacientes(model);
	}

	@RequestMapping(value = "/listaPacientes", method = RequestMethod.GET)
	public String listaPacientes(ModelMap model) {
		model.put("pacientes", pacienteService.listaPacientes());
		return "pacientes";
	}
	
	@RequestMapping(value = "/selecionaPaciente", method = RequestMethod.POST)
	public String selecionaPaciente(Paciente paciente, ModelMap model) {
		
		paciente = pacienteService.buscaPaciente(paciente.getId());
		System.out.println(paciente.toString());
		model.addAttribute(paciente);
		return editaPaciente(model);
	}
	
	@RequestMapping(value = "/editaPaciente", method = { RequestMethod.POST })
	public String editaPaciente( ModelMap model) {
		return "edicao-paciente";
	}
	
	
	@RequestMapping(value = "/salvaPaciente", method = { RequestMethod.POST })
	public String salvaPaciente( ModelMap model, Paciente paciente) {
		System.out.println(paciente.toString());
//			pacienteService.atualizaPaciente(paciente);
		
		return "paciente";
	}
	

}
