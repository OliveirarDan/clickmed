package com.clickmed.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Paciente;
import com.clickmed.entity.PesquisaSatisfacao;
import com.clickmed.service.PesquisaSatisfacaoService;

@Controller
public class PesquisaSatisfacaoController {

	@Autowired
	PesquisaSatisfacaoService pesquisaSatisfacaoService;
	

	@RequestMapping(value = "/novaAvaliacao", method = RequestMethod.GET)
	public String novaAvaliacao(ModelMap model) {
		return "cadastro-pesquisaSatisfacao";
	}


	/*@RequestMapping(value = "/cadastraAvaliacao", method = { RequestMethod.POST })
	public String cadastraPesquisaSatisfacao(PesquisaSatisfacao pesquisaSatisfacao, ModelMap model) {
		try {
			pesquisaSatisfacaoService.inserePS(pesquisaSatisfacao);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//return listaAvaliacoes(model);
		return "index";
	}*/
	
	@RequestMapping(value = "/cadastraAvaliacao", method = { RequestMethod.POST })
	public String cadastraAvaliacao(PesquisaSatisfacao pesquisaSatisfacao, ModelMap model) {
		try {
			pesquisaSatisfacaoService.inserePS(pesquisaSatisfacao);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "index";
	}


	@RequestMapping(value = "/listaAvaliacoes", method = RequestMethod.GET)
	private String listaAvaliacoes(ModelMap model) {
		model.put("pesquisaSatisfacaos", this.pesquisaSatisfacaoService.listaPSs());
		return "lista-Avaliacoes";
	}

	@RequestMapping(value = "/selecionaAvaliacao", method = RequestMethod.POST)
	public String selecionaAvaliacao(PesquisaSatisfacao pesquisaSatisfacao, ModelMap model) {
		pesquisaSatisfacao = pesquisaSatisfacaoService.buscaPS(pesquisaSatisfacao.getId());
		System.out.println(pesquisaSatisfacao.toString());
		model.addAttribute(pesquisaSatisfacao);
		return "edicao-Avaliacao";
	}
	
	

	@RequestMapping(value = "/salvaSalvaAvaliacao", method = { RequestMethod.POST })
	public String salvaAvaliacao(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao) throws IOException {
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
		return listaAvaliacoes(model);
	}
	

	@RequestMapping(value = "/removePesquisaSatisfacao", method = { RequestMethod.POST })
	public String removePesquisaSatisfacao(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao) throws IOException {
		pesquisaSatisfacaoService.removePS(pesquisaSatisfacao.getId());
		return listaAvaliacoes(model);
	}
	
	
	
}
