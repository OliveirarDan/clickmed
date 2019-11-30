package com.clickmed.controller;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clickmed.entity.Medico;
import com.clickmed.entity.PesquisaSatisfacao;
import com.clickmed.service.MedicoService;
import com.clickmed.service.PesquisaSatisfacaoService;

@Controller
public class MedicoController {

	@Autowired
	MedicoService medicoService;
	
	@Autowired
	PesquisaSatisfacaoService pesquisaSatisfacaoService;

	String maisDeUmNomeParaBusca;
	String stringBuscaPorEspecialidade;

	@RequestMapping(value = "/novoMedico", method = RequestMethod.GET)
	public String novoMedico(ModelMap model) {
		//return "cadastro-pesquisaSatisfacao";
		//return "index_medico";
		return "cadastro-medico";
	}


	@RequestMapping(value = "/cadastraMedico", method = { RequestMethod.POST })
	public String cadastraMedico(Medico medico, ModelMap model) {
		try {
			System.out.println("Medico recebido " + medico.toString());
			medicoService.insereMedico(medico);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "index";
	}

	@RequestMapping(value = "/listaMedicos", method = RequestMethod.GET)
	private String listaMedicos(ModelMap model) {
		model.put("medicos", this.medicoService.listaMedicos());
		return "/teste/medico/medicos";
	}

	@RequestMapping(value = "/selecionaMedico", method = RequestMethod.GET)
	public String selecionaMedico(Medico medico, ModelMap model, HttpSession session, PesquisaSatisfacao pesquisaSatisfacao) {
		medico = medicoService.buscaMedico(medico.getId());
		model.addAttribute(medico);
		model.put("avaliacoes", pesquisaSatisfacaoService.listaPSsValidadas(medico));
		//System.out.println("Testando:" + Double.parseDouble(pesquisaSatisfacaoService.calculaMediaAvaliacoesValidadas(medico)));
		if(pesquisaSatisfacaoService.calculaMediaAvaliacoesValidadas(medico) != null) {
			double d = Double.parseDouble(pesquisaSatisfacaoService.calculaMediaAvaliacoesValidadas(medico));
			DecimalFormat df = new DecimalFormat ("#.##");
			model.put("media", df.format(d));
		}else {
			model.put("media", "");
		}
		
		
		
		return "infos-medico";
	}
	
	@RequestMapping(value = "/selecionaEditaMedico", method = RequestMethod.GET)
	public String selecionaEditaMedico(Medico medico, ModelMap model, HttpSession session) {
		System.out.println(medico.getId());
		System.out.println(medico.getNome());
		medico = (Medico) session.getAttribute("medico");
		medico = medicoService.buscaMedico(medico.getId());
		System.out.println(medico.toString());
		model.addAttribute(medico);
		return "edicao-medico";
	}
	

	@RequestMapping(value = "/salvaMedico", method = { RequestMethod.POST })
	public String salvaMedico(ModelMap model, Medico medico, HttpSession session) throws IOException {
		medicoService.atualizaMedico(medico);
		return "infos-medico";
	}

	@RequestMapping(value = "/infosMedico", method = RequestMethod.GET)
	public String infoMedico(ModelMap model, HttpSession session) {

		return "infos-medico";
	}
	
	
	@RequestMapping(value = "/indexMedico", method = RequestMethod.GET)
	public String indexMedico(ModelMap model, HttpSession session) {

		return "index_medico";
	}

	/**
	 * Este método lista tudo
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/listaMedics", method = RequestMethod.GET)
	public String listaMedics(ModelMap model) {
		model.put("medicos", medicoService.listaMedicos());
		return "resultado-busca";
	}

	/**
	 * Este método lista por especialidade, quando temos apenas um nome
	 * 
	 * @param model
	 * @param especialidade
	 * @return
	 */
	@RequestMapping(value = "/listaMedicosPesq", method = RequestMethod.GET)
	public String listaMedicosPesq(ModelMap model, String especialidade) {
		if (especialidade == "") {
			return "resultado-busca";
		} else {
			stringBuscaPorEspecialidade = especialidade;
			model.put("medicos", (medicoService.listarMedicoEspecialidade(stringBuscaPorEspecialidade)));
			return "resultado-busca";
		}
	}

	/**
	 * Este método lista por nome e sobrenome
	 * 
	 * @param model
	 * @param especialidade
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/listaMedicosPesq2", method = RequestMethod.GET)
	public String listaMedicosPesq2(ModelMap model, String especialidade) throws IOException {
		if (especialidade == "") {
			model.put("medicos", medicoService.listarNomeMedico2(maisDeUmNomeParaBusca));
			return "resultado-busca";
		} else {
			model.put("medicos", medicoService.listarNomeMedico2(maisDeUmNomeParaBusca));
			stringBuscaPorEspecialidade = especialidade;
			model.put("medicos", (medicoService.listarMedicoEspecialidade(stringBuscaPorEspecialidade)));
			return "resultado-busca";
		}
	}

	/**
	 * Este método lista só por especialidade
	 * 
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/listaMedicosPorEspecialidade", method = RequestMethod.GET)
	public String listaMedicosPorEspecialidade(ModelMap model) throws IOException {
		model.put("medicos", medicoService.listarMedicoEspecialidade(stringBuscaPorEspecialidade));
		return "resultado-busca";
	}

	/**
	 * Metodo de busca principal, onde é chamado os demais métodos
	 * 
	 * @param session
	 * @param model
	 * @param medico
	 * @param especialidade
	 * @return
	 */
	@RequestMapping(value = "/listar_nome_medicos", method = { RequestMethod.POST })
	public String listarNomeMedicos(HttpSession session, ModelMap model, Medico medico, String especialidade) {
		model.clear();

		try {
			if (medico.getNome() == null || medico.getNome().length() == 0 || medico.getNome().equals("")) {
				return listaEspecialidade(model, especialidade);
			} else {
				if (medico.getNome().endsWith(" ") || medico.getNome().startsWith(" ")) {
					return listaMedics(model);
				} else if (medico.getNome().contains(" ")) {
					maisDeUmNomeParaBusca = medico.getNome();
					medicoService.listarNomeMedico2(maisDeUmNomeParaBusca);
					return listaMedicosPesq2(model, especialidade);

				} else {
					model.clear();
					model.put("medicos", (medicoService.listarNomeMedico(medico.getNome())));
					return listaMedicosPesq(model, especialidade);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
			model.addAttribute("erro", e);
			return "Erro";
		}
	}

	/**
	 * METODO ABAIXO LISTA POR ESPECIALIDADE
	 * 
	 * @param model
	 * @param especialidade
	 * @return
	 * @throws IOException
	 */

	private String listaEspecialidade(ModelMap model, String especialidade) throws IOException {
		stringBuscaPorEspecialidade = especialidade;
		if (stringBuscaPorEspecialidade == "") {
			return listaMedics(model);
		} else {
			medicoService.listarMedicoEspecialidade(stringBuscaPorEspecialidade);
			return listaMedicosPorEspecialidade(model);
		}

	}
	
	
	/**
	 * Método criado para testar avaliação @Marcelinha
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/testeAvaliacao", method = RequestMethod.GET)
	public String testeAvaliacao(ModelMap model) {
		return "cadastro-pesquisaSatisfacao";
	}

}
