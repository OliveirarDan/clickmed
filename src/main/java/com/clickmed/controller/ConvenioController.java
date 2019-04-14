package com.clickmed.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Convenio;
import com.clickmed.service.ConvenioService;

@Controller
public class ConvenioController {

	@Autowired
	ConvenioService convenioService;

	/**
	 * ----TESTANDO---- Falta criar tela cadastro-convenio
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/novoConvenio", method = RequestMethod.GET)
	public String novoConvenio(ModelMap model) {
		return "cadastro-convenio";
	}

	/**
	 * ----TESTANDO---- Falta criar tela cadastro-convenio
	 * 
	 * @param convenio
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/cadastraConvenio", method = { RequestMethod.POST })
	public String cadastraConvenio(Convenio convenio, ModelMap model) {
		try {
			convenioService.insereConvenio(convenio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaConvenios(model);
	}

	
	/**
	 * ----TESTANDO----	Falta criar tela convenios
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/listaConvenios", method = RequestMethod.GET)
	private String listaConvenios(ModelMap model) {
		model.put("convenios", this.convenioService.listaConvenios());
		return "convenios";
	}
	
	/**
	 * ----TESTANDO----	Falta criar tela edicao-convenio
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selecionaConvenio", method = RequestMethod.POST)
	public String selecionaConvenio(Convenio convenio, ModelMap model) {
		convenio = convenioService.buscaConvenio(convenio.getId());
		System.out.println(convenio.toString());
		model.addAttribute(convenio);
		return "edicao-convenio";
	}
	
	
	
	/**
	 * ----TESTANDO----
	 * -----ATENçÃO------
	 * Neste método é necessário ter todos os dados do convenio antes de modificalo no BD,
	 * Você pode usar uma variável nConvenio para carregar os itens pelo id e depois altera-lo.
	 * Ou pode pegar a entidade completa da VIEW.
	 * 
	 */
	@RequestMapping(value = "/salvaConvenio", method = { RequestMethod.POST })
	public String salvaConvenio(ModelMap model, Convenio convenio) throws IOException {
		//nConvenio criada para armazenar o convenio atualizado da View temporariamente		
		Convenio nConvenio = convenio;
		//Carregando o objeto convenio completo do banco
		convenio = convenioService.buscaConvenio(convenio.getId());
		//Exibindo como está no banco
		System.out.println("Atual: " + convenio.toString());
		//Exibindo como ficou depois da alteração na view
		System.out.println("Novo: " +nConvenio.toString());
		//Atualizando nome do objeto
		convenio.setNome(nConvenio.getNome());
		//Salvando no banco
		convenioService.atualizaConvenio(convenio);
		return listaConvenios(model);
	}
	
	
	/**
	 * ----TESTANDO----	Falta criar tela edicao-convenio
	 * @param model
	 * @return
	 */	
	@RequestMapping(value = "/removeConvenio", method = { RequestMethod.POST })
	public String removeConvenio(ModelMap model, Convenio convenio) throws IOException {
		convenioService.removeConvenio(convenio.getId());
		return listaConvenios(model);
	}
	
	

}
