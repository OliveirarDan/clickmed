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
		return "/teste/paciente/edicao-paciente";
	}
	
	/**
	 * -----ATENçÃO------
	 * Neste método é necessário ter todos os dados do paciente antes de modificalo no BD,
	 * Você pode usar uma variável nPaciente para carregar os itens pelo id e depois altera-lo.
	 * Ou pode pegar a entidade completa da VIEW.
	 * 
	 */
	@RequestMapping(value = "/salvaPaciente", method = { RequestMethod.POST })
	public String salvaPaciente(ModelMap model, Paciente paciente) throws IOException {
//		//nPaciente criada para armazenar o paciente atualizado da View temporariamente		
//		Paciente nPaciente = paciente;
//		//Carregando o objeto paciente completo do banco
//		paciente = pacienteService.buscaPaciente(paciente.getId());
//		//Exibindo como está no banco
//		System.out.println("Atual: " + paciente.toString());
//		//Exibindo como ficou depois da alteração na view
//		System.out.println("Novo: " +nPaciente.toString());
//		//Atualizando nome do objeto
//		paciente.setNome(nPaciente.getNome());
		//Salvando no banco
		pacienteService.atualizaPaciente(paciente);
		return listaPacientes(model);
	}

	
	@RequestMapping(value = "/removePaciente", method = { RequestMethod.POST })
	public String removePaciente(ModelMap model, Paciente paciente) throws IOException {
		pacienteService.removePaciente(paciente.getId());
		return listaPacientes(model);
	}
	
	
}
