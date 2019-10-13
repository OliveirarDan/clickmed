package com.clickmed.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Medico;
import com.clickmed.entity.Paciente;
import com.clickmed.entity.PesquisaSatisfacao;
import com.clickmed.service.MedicoService;
import com.clickmed.service.PacienteService;
import com.clickmed.service.PesquisaSatisfacaoService;
import com.clickmed.utils.Utilidades;

@Controller
public class PesquisaSatisfacaoController {

	
	@Autowired
	PesquisaSatisfacaoService pesquisaSatisfacaoService;
	
	@Autowired
	PacienteService pacienteService;
	
	@Autowired
	MedicoService medicoService;
	
	Utilidades utils = new Utilidades();
	



	/**
	 * ----TESTANDO---- 
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/novaAvaliacao", method = RequestMethod.GET)
	public String novaAvaliacao(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao, Medico medico, Paciente paciente) {
		medico = medicoService.buscaMedico((long) 1);
		paciente = pacienteService.buscaPaciente((long)1);
		
		pesquisaSatisfacao.setMedico(medico);
		pesquisaSatisfacao.setPaciente(paciente);
		model.addAttribute(pesquisaSatisfacao);
		
		System.out.println(model.toString());

		return "cadastro-pesquisaSatisfacao";
	}

	/**
	 * ----TESTANDO---- Falta criar tela cadastro-pesquisaSatisfacao
	 * 
	 * @param pesquisaSatisfacao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/cadastraAvaliacao", method = { RequestMethod.POST })
	public String cadastraPesquisaSatisfacao(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao, Medico medico, Paciente paciente, HttpSession session) {
		try {
			pesquisaSatisfacao = (PesquisaSatisfacao) model.get("pesquisaSatisfacao");
			medico = medicoService.buscaMedico(pesquisaSatisfacao.getMedico().getId());
			paciente = pacienteService.buscaPaciente(pesquisaSatisfacao.getPaciente().getId());
			pesquisaSatisfacao.setMedico(medico);
			pesquisaSatisfacao.setPaciente(paciente);
			pesquisaSatisfacao.setDescricao(utils.dataAtual());
			System.out.println("TESTE objetos");
			System.out.println(pesquisaSatisfacao.toString());
			
			System.out.println("fim teste");
		
			
			//System.out.println(paciente);
			//System.out.println(pesquisaSatisfacao);
			pesquisaSatisfacaoService.inserePS(pesquisaSatisfacao);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaAvaliacoes(model);
	}

	
	/**
	 * ----TESTANDO----	Falta criar tela lista-pesquisaSatisfacao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/listaAvaliacoes", method = RequestMethod.GET)
	private String listaAvaliacoes(ModelMap model) {
		model.put("pesquisaSatisfacaos", this.pesquisaSatisfacaoService.listaPSs());
		return "lista-Avaliacoes";
	}
	
	/**
	 * ----TESTANDO----	Falta criar tela edicao-pesquisaSatisfacao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selecionaAvaliacao", method = RequestMethod.POST)
	public String selecionaAvaliacao(PesquisaSatisfacao pesquisaSatisfacao, ModelMap model) {
		pesquisaSatisfacao = pesquisaSatisfacaoService.buscaPS(pesquisaSatisfacao.getId());
		System.out.println(pesquisaSatisfacao.toString());
		model.addAttribute(pesquisaSatisfacao);
		return "edicao-Avaliacao";
	}
	
	
	
	/**
	 * ----TESTANDO----
	 * -----ATENçÃO------
	 * Neste método é necessário ter todos os dados do pesquisaSatisfacao antes de modificalo no BD,
	 * Você pode usar uma variável nPesquisaSatisfacao para carregar os itens pelo id e depois altera-lo.
	 * Ou pode pegar a entidade completa da VIEW.
	 * 
	 */
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
	
	
	/**
	 * ----TESTANDO----	Falta criar tela edicao-pesquisaSatisfacao
	 * @param model
	 * @return
	 */	
	@RequestMapping(value = "/removePesquisaSatisfacao", method = { RequestMethod.POST })
	public String removePesquisaSatisfacao(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao) throws IOException {
		pesquisaSatisfacaoService.removePS(pesquisaSatisfacao.getId());
		return listaAvaliacoes(model);
	}
	
	
	
}
