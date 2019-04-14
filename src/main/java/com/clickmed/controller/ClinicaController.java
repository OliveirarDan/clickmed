package com.clickmed.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Clinica;
import com.clickmed.service.ClinicaService;

@Controller
public class ClinicaController {

	@Autowired
	ClinicaService clinicaService;
	
	/**
	 * ----TESTANDO---- Falta criar tela cadastro-clinica
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/novaClinica", method = RequestMethod.GET)
	public String novaClinica(ModelMap model) {
		return "cadastro-clinica";
	}

	/**
	 * ----TESTANDO---- Falta criar tela cadastro-clinica
	 * 
	 * @param clinica
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/cadastraClinica", method = { RequestMethod.POST })
	public String cadastraClinica(Clinica clinica, ModelMap model) {
		try {
			clinicaService.insereClinica(clinica);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaClinicas(model);
	}

	
	/**
	 * ----TESTANDO----	Falta criar tela clinicas
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/listaClinicas", method = RequestMethod.GET)
	private String listaClinicas(ModelMap model) {
		model.put("clinicas", this.clinicaService.listaClinicas());
		return "clinicas";
	}
	
	/**
	 * ----TESTANDO----	Falta criar tela edicao-clinica
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selecionaClinica", method = RequestMethod.POST)
	public String selecionaClinica(Clinica clinica, ModelMap model) {
		clinica = clinicaService.buscaClinica(clinica.getId());
		System.out.println(clinica.toString());
		model.addAttribute(clinica);
		return "edicao-clinica";
	}
	
	
	
	/**
	 * ----TESTANDO----
	 * -----ATENçÃO------
	 * Neste método é necessário ter todos os dados do clinica antes de modificalo no BD,
	 * Você pode usar uma variável nClinica para carregar os itens pelo id e depois altera-lo.
	 * Ou pode pegar a entidade completa da VIEW.
	 * 
	 */
	@RequestMapping(value = "/salvaClinica", method = { RequestMethod.POST })
	public String salvaClinica(ModelMap model, Clinica clinica) throws IOException {
		//nClinica criada para armazenar o clinica atualizado da View temporariamente		
		Clinica nClinica = clinica;
		//Carregando o objeto clinica completo do banco
		clinica = clinicaService.buscaClinica(clinica.getId());
		//Exibindo como está no banco
		System.out.println("Atual: " + clinica.toString());
		//Exibindo como ficou depois da alteração na view
		System.out.println("Novo: " +nClinica.toString());
		//Atualizando nome do objeto
		clinica.setNomeFantasia(nClinica.getNomeFantasia());
		//Salvando no banco
		clinicaService.atualizaClinica(clinica);
		return listaClinicas(model);
	}
	
	
	/**
	 * ----TESTANDO----	Falta criar tela edicao-clinica
	 * @param model
	 * @return
	 */	
	@RequestMapping(value = "/removeClinica", method = { RequestMethod.POST })
	public String removeClinica(ModelMap model, Clinica clinica) throws IOException {
		clinicaService.removeClinica(clinica.getId());
		return listaClinicas(model);
	}
	
}
