package com.clickmed.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

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
	
	String maisDeUmNomeParaBusca;
	String stringBuscaPorEspecialidade;
	

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
		return "/teste/medico/edicao-medico";
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
		medicoService.atualizaMedico(medico);
		return listaMedicos(model);
	}
	
	@RequestMapping(value ="/listar", method = RequestMethod.GET)
	public String index(ModelMap model) {
		return "listar";
	}
	
	/**
	 * Este método lista tudo
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/listaMedics", method = RequestMethod.GET)
	public String listaMedics(ModelMap model) {
		model.put("medicos", medicoService.listarNomeMedico());
		return "listamedicos";
	}
	
	/**
	 * Este método lista por nome, na coluna nome de Mecico
	 * @param model
	 * @param especialidade
	 * @return
	 */
	@RequestMapping(value = "/listaMedicosPesq", method = RequestMethod.GET)
	public String listaMedicosPesq(ModelMap model, String especialidade) {
		if (especialidade == "") {
			return "listamedicos";
		} else {
			stringBuscaPorEspecialidade = especialidade;
			model.put("medicos",(medicoService.listarMedicoEspecialidade(stringBuscaPorEspecialidade)));
			return "listamedicos";
		}
	}
	
	/**
	 * Este método lista por nome e sobrenome
	 * @param model
	 * @param especialidade
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/listaMedicosPesq2", method = RequestMethod.GET)
	public String listaMedicosPesq2(ModelMap model, String especialidade) throws IOException {
		if (especialidade == "") {
			model.put("medicos", medicoService.listarNomeMedico2(maisDeUmNomeParaBusca));
			return "listamedicos";
		} else {
			model.put("medicos", medicoService.listarNomeMedico2(maisDeUmNomeParaBusca));
			stringBuscaPorEspecialidade = especialidade;
			model.put("medicos",(medicoService.listarMedicoEspecialidade(stringBuscaPorEspecialidade)));
			return "listamedicos";
		}	
	}
	
	/**
	 * Este método lista só por especialidade
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/listaMedicosPorEspecialidade", method = RequestMethod.GET)
	public String listaMedicosPorEspecialidade(ModelMap model) throws IOException {
		model.put("medicos", medicoService.listarMedicoEspecialidade(stringBuscaPorEspecialidade));
		return "listamedicos";	
	}
	
	/**
	 * Metodo de busca principal, onde é chamado os demais métodos
	 * @param session
	 * @param model
	 * @param medico
	 * @param especialidade
	 * @return
	 */
	@RequestMapping(value = "/listar_nome_medicos", method = {RequestMethod.POST})
	public String listarNomeMedicos(HttpSession session, ModelMap model, Medico medico, String especialidade) {
		model.clear();
		
		try {
			if (medico.getNome() == null || medico.getNome().length() == 0 || medico.getNome().equals("")) {
				// *********** METODO ABAIXO LISTA POR ESPECIALIDADE
				 return listaEspecialidade(model, especialidade);
			} else {
				if(medico.getNome().endsWith(" ") || medico.getNome().startsWith(" ")) {
					return listaMedics(model);
				
				}else if (medico.getNome().contains(" ")) {
					maisDeUmNomeParaBusca = medico.getNome();
					medicoService.listarNomeMedico2(maisDeUmNomeParaBusca);
					return listaMedicosPesq2(model, especialidade);
					
				} else {
					model.clear();
					model.put("medicos",(medicoService.listarNomeMedico(medico.getNome())));
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
	 *  METODO ABAIXO LISTA POR ESPECIALIDADE
	 * @param model
	 * @param especialidade
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(method = {RequestMethod.POST})
	private String listaEspecialidade(ModelMap model, String especialidade) throws IOException {
		stringBuscaPorEspecialidade = especialidade;
		medicoService.listarMedicoEspecialidade(stringBuscaPorEspecialidade);
		return listaMedicosPorEspecialidade(model);
	}
	
	
	
	
}
