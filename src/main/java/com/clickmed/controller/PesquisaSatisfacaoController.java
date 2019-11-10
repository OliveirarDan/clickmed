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
import com.clickmed.entity.Usuario;
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
	 * Chama a página de avaliação
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/novaAvaliacao", method = RequestMethod.GET)
	public String novaAvaliacao(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao, Medico medico, Paciente paciente, HttpSession session) {
		medico = medicoService.buscaMedico((medico.getId()));
		//paciente = pacienteService.buscaPaciente((long)1);
		paciente = (Paciente) session.getAttribute("paciente");
		System.out.println(paciente.toString());
		
		pesquisaSatisfacao.setMedico(medico);
		pesquisaSatisfacao.setPaciente(paciente);
		model.addAttribute(pesquisaSatisfacao);
		
		System.out.println(model.toString());

		return "cadastro-pesquisaSatisfacao";
	}

	/**
	 * Cadastra avaliação
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
			
			/**
			 * Campo para atualização do status da avaliação
			 * 0 - Avaliação realizada, porém não validada
			 * 1 - Avaliação aceitada pelo médico
			 * 2 - Avaliação contestada e não aceita pelo médico
			 */
			pesquisaSatisfacao.setRespostamed("0");
			
			
			// campo comentado para data de avaliação;
			//pesquisaSatisfacao.setDescricao(utils.dataAtual());
			System.out.println(pesquisaSatisfacao.toString());
			pesquisaSatisfacaoService.inserePS(pesquisaSatisfacao);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//return listaAvaliacoes(model);
		return "index";
	}
	
	/**
	 * Lista todas as avaliações
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/listaAvaliacoes", method = RequestMethod.GET)
	private String listaAvaliacoes(ModelMap model) {
		model.put("pesquisaSatisfacaos", this.pesquisaSatisfacaoService.listaPSs());
		return "lista-Avaliacoes";
	}
	
	/**
	 *Edita Avaliação
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
	 
	 * Neste método é necessário ter todos os dados do pesquisaSatisfacao antes de modificalo no BD,
	 * Você pode usar uma variável nPesquisaSatisfacao para carregar os itens pelo id e depois altera-lo.
	 * Ou pode pegar a entidade completa da VIEW.
	 * 
	 */
	@RequestMapping(value = "/salvaAvaliacao", method = { RequestMethod.POST })
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
	 * remove Avaliação
	 * @param model
	 * @return
	 */	
	@RequestMapping(value = "/removePesquisaSatisfacao", method = { RequestMethod.POST })
	public String removePesquisaSatisfacao(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao) throws IOException {
		pesquisaSatisfacaoService.removePS(pesquisaSatisfacao.getId());
		return listaAvaliacoes(model);
	}
	
	
	/**
	 * Valida a Avaliação - Criado para o medico permitir a exibição da avaliação
	 * @param model
	 * @param pesquisaSatisfacao
	 * @param medico
	 * @param paciente
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/validaAvaliacao", method = { RequestMethod.GET })
	public String validaPesquisaSatisfacao(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao, Medico medico, HttpSession session) {
		try {
			pesquisaSatisfacao = (PesquisaSatisfacao) model.get("pesquisaSatisfacao");
			//Carregando o objeto pesquisaSatisfacao completo do banco
			pesquisaSatisfacao = pesquisaSatisfacaoService.buscaPS(pesquisaSatisfacao.getId());
			
			/**
			 * Campo para atualização do status da avaliação
			 * 0 - Avaliação realizada, porém não validada
			 * 1 - Avaliação aceitada pelo médico
			 * 2 - Avaliação contestada e não aceita pelo médico
			 */
			pesquisaSatisfacao.setRespostamed("1");
			
			System.out.println(pesquisaSatisfacao.toString());
			pesquisaSatisfacaoService.atualizaPS(pesquisaSatisfacao);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//return listaAvaliacoes(model);
		return "redirect:/listaAvaliacoesDoMedico";
	}

	
	
	/**
	 * Rejeita a Avaliação - Para quando o médico nã reconhece o paciente ou a data de atendimento.
	 * @param model
	 * @param pesquisaSatisfacao
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/rejeitaAvaliacao", method = { RequestMethod.GET })
	public String RejeitaPesquisaSatisfacao(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao, HttpSession session) {
		try {
			pesquisaSatisfacao = (PesquisaSatisfacao) model.get("pesquisaSatisfacao");
			//Carregando o objeto pesquisaSatisfacao completo do banco
			pesquisaSatisfacao = pesquisaSatisfacaoService.buscaPS(pesquisaSatisfacao.getId());
			
			/**
			 * Campo para atualização do status da avaliação
			 * 0 - Avaliação realizada, porém não validada
			 * 1 - Avaliação aceitada pelo médico
			 * 2 - Avaliação contestada e não aceita pelo médico
			 */
			pesquisaSatisfacao.setRespostamed("2");
			
			System.out.println(pesquisaSatisfacao.toString());
			pesquisaSatisfacaoService.atualizaPS(pesquisaSatisfacao);
		} catch (IOException e) {
			e.printStackTrace();	
		}
		//return listaAvaliacoes(model);
		return "redirect:/listaAvaliacoesDoMedico";
	}
	
	
	@RequestMapping(value = "/listaAvaliacoesDoMedico", method = { RequestMethod.GET })
	public String listaAvaliacoesDoMedico(ModelMap model, PesquisaSatisfacao pesquisaSatisfacao, Medico medico, HttpSession session) {
		model.put("pesquisaSatisfacao", this.pesquisaSatisfacaoService.listaPSsValidacao(medico));
		System.out.println(pesquisaSatisfacaoService.listaPSsValidacao(medico));
		Usuario usuario = (Usuario) session.getAttribute("usuarioAutenticado");
		medico = medicoService.buscaMedicoPorUsuario(usuario);
		
		model.addAttribute(medico);
//		
//		if (pesquisaSatisfacaoService.listaPSsValidacao(medico).toString().equals("[]")) {
//			return "redirect:/selecionaMedico";
//		}else {
//			return "index_medico";
//		}
		
		return "index_medico";
		
	}
	
	
}