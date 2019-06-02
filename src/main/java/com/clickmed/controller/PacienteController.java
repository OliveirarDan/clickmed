package com.clickmed.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Paciente;
import com.clickmed.entity.Usuario;
import com.clickmed.service.PacienteService;
import com.clickmed.service.UsuarioService;

@Controller
//@RequestMapping("/app/pacientes")
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
		return "index";
	}

	@RequestMapping(value = "/listaPacientes", method = RequestMethod.GET)
	public String listaPacientes(ModelMap model) {
		model.put("pacientes", pacienteService.listaPacientes());
		return "pacientes";
	}

	@RequestMapping(value = "/selecionaPaciente", method = RequestMethod.GET)
	public String selecionaPaciente(Paciente paciente, ModelMap model, HttpSession session, Usuario usuario) {
		usuario = (Usuario) session.getAttribute("usuarioAutenticado");
		System.out.println(usuario.toString());
		System.out.println(paciente.toString());
		model.addAttribute("paciente",paciente);
		return "edicao-paciente";
	}
	
	@RequestMapping(value = "/selecionaPacienteLink", method = RequestMethod.GET)
	public String selecionaPacienteLink(ModelMap model, HttpSession session) {
		return "redirect:/selecionaPaciente";
	}

	

	@RequestMapping(value = "/salvaPaciente", method = { RequestMethod.POST })
	public String salvaPaciente(ModelMap model, Paciente paciente) throws IOException {
		pacienteService.atualizaPaciente(paciente);
		return "index";
	}

	@RequestMapping(value = "/removePaciente", method = { RequestMethod.POST })
	public String removePaciente(ModelMap model, Paciente paciente) throws IOException {
		pacienteService.removePaciente(paciente.getId());
		return listaPacientes(model);
	}

}
