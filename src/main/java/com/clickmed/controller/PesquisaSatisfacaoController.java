package com.clickmed.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.PesquisaSatisfacao;
import com.clickmed.service.PesquisaSatisfacaoService;

@Controller
public class PesquisaSatisfacaoController {

	@Autowired
	PesquisaSatisfacaoService pesquisaSatisfacaoService;
	
	/**
	 * ----TESTANDO---- Falta criar tela cadastro-pesquisaSatisfacao
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/novoPesquisaSatisfacao", method = RequestMethod.GET)
	public String novoPesquisaSatisfacao(ModelMap model) {
		return "cadastro-pesquisaSatisfacao";
	}

	/**
	 * ----TESTANDO---- Falta criar tela cadastro-pesquisaSatisfacao
	 * 
	 * @param pesquisaSatisfacao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/cadastraPesquisaSatisfacao", method = { RequestMethod.POST })
	public String cadastraPesquisaSatisfacao(PesquisaSatisfacao pesquisaSatisfacao, ModelMap model) {
		try {
			pesquisaSatisfacaoService.inserePS(pesquisaSatisfacao);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaPesquisaSatisfacaos(model);
	}

	
	/**
	 * ----TESTANDO----	Falta criar tela lista-pesquisaSatisfacao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/listaPesquisaSatisfacaos", method = RequestMethod.GET)
	private String listaPesquisaSatisfacaos(ModelMap model) {
		model.put("pesquisaSatisfacaos", this.pesquisaSatisfacaoService.listaPSs());
		return "lista-pesquisaSatisfacaos";
	}
	
	/**
	 * ----TESTANDO----	Falta criar tela edicao-pesquisaSatisfacao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selecionaPesquisaSatisfacao", method = RequestMethod.POST)
	public String selecionaPesquisaSatisfacao(PesquisaSatisfacao pesquisaSatisfacao, ModelMap model) {
		pesquisaSatisfacao = pesquisaSatisfacaoService.buscaPS(pesquisaSatisfacao.getId());
		System.out.println(pesquisaSatisfacao.toString());
		model.addAttribute(pesquisaSatisfacao);
		return "edicao-pesquisaSatisfacao";
	}
	
	
	
	/**
	 * ----TESTANDO----
	 * -----ATENçÃO------
	 * Neste método é necessário ter todos os dados do pesquisaSatisfacao antes de modificalo no BD,
	 * Você pode usar uma variável nPesquisaSatisfacao para carregar os itens pelo id e depois altera-lo.
	 * Ou pode pegar a entidade completa da VIEW.
	 * 
	 */
	@RequestMapping(value = "/salvaPesquisaSatisfacao", method = { RequestMethod.POST })
	public String salvaPesquisaSatisfacao(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao) throws IOException {
		//nPesquisaSatisfacao criada para armazenar o pesquisaSatisfacao atualizado da View temporariamente		
		PesquisaSatisfacao nPesquisaSatisfacao = pesquisaSatisfacao;
		//Carregando o objeto pesquisaSatisfacao completo do banco
		pesquisaSatisfacao = pesquisaSatisfacaoService.buscaPS(pesquisaSatisfacao.getId());
		//Exibindo como está no banco
		System.out.println("Atual: " + pesquisaSatisfacao.toString());
		//Exibindo como ficou depois da alteração na view
		System.out.println("Novo: " +nPesquisaSatisfacao.toString());
		//Atualizando nome do objeto
		pesquisaSatisfacao.setAvaliacao(nPesquisaSatisfacao.getAvaliacao());
		//Salvando no banco
		pesquisaSatisfacaoService.atualizaPS(pesquisaSatisfacao);
		return listaPesquisaSatisfacaos(model);
	}
	
	
	/**
	 * ----TESTANDO----	Falta criar tela edicao-pesquisaSatisfacao
	 * @param model
	 * @return
	 */	
	@RequestMapping(value = "/removePesquisaSatisfacao", method = { RequestMethod.POST })
	public String removePesquisaSatisfacao(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao) throws IOException {
		pesquisaSatisfacaoService.removePS(pesquisaSatisfacao.getId());
		return listaPesquisaSatisfacaos(model);
	}
	
	
	
}
