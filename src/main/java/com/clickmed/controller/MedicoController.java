package com.clickmed.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Medico;
import com.clickmed.service.MedicoService;

@Controller
public class MedicoController {

	@Autowired
	MedicoService medicoService;
	

	/**
	 * ok
	 */
	@RequestMapping(value = "/novoMedico", method = RequestMethod.GET)
	public String novoMedico(ModelMap model) {
		return "cadastro-medico";
	}

	/**
	 * ok
	 */
	@RequestMapping(value = "/cadastraMedico", method = { RequestMethod.POST })
	public String cadastraMedico(Medico medico, ModelMap model) {
		try {
			System.out.println("Controller " + medico.toString());
			medicoService.insereMedico(medico);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaMedicos(model);
	}

	@RequestMapping(value = "/listaMedicos", method = RequestMethod.GET)
	private String listaMedicos(ModelMap model) {
		model.put("medicos", this.medicoService.listaMedicos());
		return "/teste/medico/medicos";
	}
	
	@RequestMapping(value = "/selecionaMedico", method = RequestMethod.POST)
	public String selecionaMedico(Medico medico, ModelMap model) {
	
		medico = medicoService.buscaMedico(medico.getId());
		System.out.println("Medico selecionado: " + medico.toString());
		model.addAttribute(medico);
		return "edicao-medico";
	}
	
	
	
	/**
	 * ----TESTANDO----
	 * -----ATENçÃO------
	 * Neste método é necessário ter todos os dados do medico antes de modificalo no BD,
	 * Você pode usar uma variável nMedico para carregar os itens pelo id e depois altera-lo.
	 * Ou pode pegar a entidade completa da VIEW.
	 * 
	 */
	@RequestMapping(value = "/salvaMedico", method = { RequestMethod.POST })
	public String salvaMedico(ModelMap model, Medico medico) throws IOException {
		
		//Salvando no banco
		System.out.println("Controller " + medico.toString());
		medicoService.atualizaMedico(medico);
		return listaMedicos(model);
	}
	
	
	@RequestMapping(value = "/infosMedico", method = RequestMethod.GET)
	public String infoMedico(ModelMap model) {
		return "infos-medico";
	}

	
	
}
