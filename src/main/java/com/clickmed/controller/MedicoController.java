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
		System.out.println(medico.toString());
		
		try {
			System.out.println(medico);
			medicoService.insereMedico(medico);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaMedicos(model);
	}

	
	/**
	 * ok
	 */
	@RequestMapping(value = "/listaMedicos", method = RequestMethod.GET)
	private String listaMedicos(ModelMap model) {
		model.put("medicos", this.medicoService.listaMedicos());
		return "/teste/medico/medicos";
	}
	
	/**
	 * ----TESTANDO----	Falta criar tela edicao-medico
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selecionaMedico", method = RequestMethod.POST)
	public String selecionaMedico(Medico medico, ModelMap model) {
		medico = medicoService.buscaMedico(medico.getId());
		System.out.println(medico.toString());
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
		//nMedico criada para armazenar o medico atualizado da View temporariamente		
		Medico nMedico = medico;
		//Carregando o objeto medico completo do banco
		medico = medicoService.buscaMedico(medico.getId());
		//Exibindo como está no banco
		System.out.println("Atual: " + medico.toString());
		//Exibindo como ficou depois da alteração na view
		System.out.println("Novo: " +nMedico.toString());
		//Atualizando nome do objeto
		medico.setNome(nMedico.getNome());
		//Salvando no banco
		medicoService.atualizaMedico(medico);
		return listaMedicos(model);
	}
	
	
	
	
}
