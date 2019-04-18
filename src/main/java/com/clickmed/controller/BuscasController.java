package com.clickmed.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Medico;
import com.clickmed.entity.Teste;
import com.clickmed.service.MedicoService;


@Controller 
public class BuscasController {

	
	@Autowired
	MedicoService medicoService;
	
	
	@RequestMapping(value = "/listaMedicos", method = RequestMethod.GET)
	public String listamedicos(ModelMap model) {
		model.put("medicos", medicoService.listarNomeMedico());
		return "listamedicos";
	}
	
	@RequestMapping(value = "/listaMedicosPesq", method = RequestMethod.GET)
	public String listaMedicosPesq(ModelMap model) {
		return "listamedicos";
	}
	
	@RequestMapping(value = "/listar_nome_medicos", method = {RequestMethod.POST})
	public String listarNomeMedicos(HttpSession session, ModelMap model, Medico medico) {
		System.out.println(medico.toString());
		model.clear();
		try {
			//List<Medico> lista = null;
				if (medico.getNome() == null || medico.getNome().length() == 0 || medico.getNome().equals("")) {
					medicoService.listarNomeMedico();
					return listamedicos(model);
				} else {
				
				System.out.println("ta entrando!");
				model.clear();
				model.put("medicos",(medicoService.listarNomeMedico(medico.getNome())));
				return listaMedicosPesq(model);
			}
		//	
			
		} catch (IOException e) {
			e.printStackTrace();
			model.addAttribute("erro", e);
			return "Erro";
		}
	}
	
	

	@RequestMapping(value ="/listar", method = RequestMethod.GET)
	public String index(ModelMap model, Teste teste) {
		return "listar";
	}
	
	
}
