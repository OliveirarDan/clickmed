package com.clickmed.api.controller;

import java.io.IOException;
import java.util.List;

import com.clickmed.entity.Medico;
import com.clickmed.entity.Paciente;
import com.clickmed.service.MedicoService;
import com.clickmed.service.PacienteService;
import com.clickmed.utils.Utilidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clickmed.entity.PesquisaSatisfacao;
import com.clickmed.service.PesquisaSatisfacaoService;

@Controller
public class ApiAvaliacaoController {

	@Autowired
	PesquisaSatisfacaoService psService;

	@Autowired
	PacienteService pacienteService;

	@Autowired
	MedicoService medicoService;

	Utilidades utils = new Utilidades();

	/**
	 * Lista todas as avaliações cadastradas no banco
	 * @return Lista de avaliações
	 * @throws IOException
	 */
	@RequestMapping(method = RequestMethod.GET, value="/api/avaliacao")
	public @ResponseBody List<PesquisaSatisfacao> listarAvaliacoes() throws IOException{
		List<PesquisaSatisfacao> avaliacoes = psService.listaPSs();
		return avaliacoes;
	}

	/**
	 * Busca uma avaliação através do seu ID
	 * @param id
	 * @return Avaliação
	 * @throws IOException
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/api/avaliacao/{id}")
	public @ResponseBody PesquisaSatisfacao buscaAvaliacaoPorId(@PathVariable("id") Long id) throws IOException{
		PesquisaSatisfacao psSatisfacao = psService.buscaPS(id);
		return psSatisfacao;
	}


	/**
	  *Insere uma avaliação
	  *@param pSatisfacao
	  *@return a avaliação inserida
	 **/
	@RequestMapping(method = RequestMethod.POST, value = "/api/avaliacao", headers = "Accept=application/json")
	public @ResponseBody PesquisaSatisfacao inserirAvaliacao(@RequestBody PesquisaSatisfacao pSatisfacao) {
		try {
			Medico medico = medicoService.buscaMedico(pSatisfacao.getMedico().getId());
			Paciente paciente = pacienteService.buscaPaciente(pSatisfacao.getPaciente().getId());
			pSatisfacao.setMedico(medico);
			pSatisfacao.setPaciente(paciente);
			psService.inserePS(pSatisfacao);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pSatisfacao;
	}
	
	/**
	 * Atualiza a avaliação de acordo com o objeto PesquisaSatisfacao recebido
	 * @param pSatisfacao
	 * @returnm objeto PesquisaSatisfacao atualizado

	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/api/avaliacao", headers = "Accept=application/json")

	public @ResponseBody PesquisaSatisfacao atualizaAvaliacao(@RequestBody PesquisaSatisfacao pSatisfacao) {
		try {
			System.out.println("Pesquisa Recebida " + pSatisfacao.toString());
			psService.atualizaPS(pSatisfacao);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pSatisfacao;
	}
	
	
	/**
	 * Remove uma avaliação de acordo com o id recebido
	 * @param id
	 * @return Mensagem "Avaliacao removida com sucesso".

	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/avaliacao/{id}")

	public @ResponseBody String removeAvaliacao(@PathVariable("id") Long id) {
		try {
			psService.removePS(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Avaliacao removida com sucesso";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/api/avaliacao/media/{id}")
	public @ResponseBody double buscaMediaDasAvaliacoes(@PathVariable("id") Long id){
		Medico medico = medicoService.buscaMedico(id);
		if(psService.calculaMediaAvaliacoesValidadas(medico) != null) {
			//DecimalFormat df = new DecimalFormat ("#.##");
			return Double.parseDouble(psService.calculaMediaAvaliacoesValidadas(medico));
		}else {
			return 0;
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = "/api/avaliacao/aprovada/{id}")
	public @ResponseBody List<PesquisaSatisfacao> buscaAvaliacoesAprovadas(@PathVariable("id") Long id){
		Medico medico = medicoService.buscaMedico(id);
		return psService.listaPSsValidadas(medico);
	}
}
