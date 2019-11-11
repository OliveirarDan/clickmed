package com.clickmed.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.clickmed.dao.PesquisaSatisfacaoDAO;
import com.clickmed.entity.Medico;
import com.clickmed.entity.Paciente;
import com.clickmed.entity.PesquisaSatisfacao;

@Service
@Transactional
public class PesquisaSatisfacaoService {

	@Autowired
	MedicoService medicoService;

	@Autowired
	PacienteService pacienteService;


	private PesquisaSatisfacaoDAO psDAO;

	@Autowired
	public PesquisaSatisfacaoService(PesquisaSatisfacaoDAO psDAO) {
		this.psDAO = psDAO;
	}
	
	/**
	 * Insere Pesquisa de Satisfação
	 * 
	 * @param pSatisfacao
	 * @return Pesquisa de Satisfação salva no banco.
	 * @throws IOException
	 */
	public PesquisaSatisfacao inserePS(PesquisaSatisfacao pSatisfacao) throws IOException {
		return this.psDAO.save(pSatisfacao);
	}

	/**
	 * AtualizaPesquisaSatificacao Verifica o id recebido, caso já exista PS com
	 * esse id, atualiza
	 * 
	 * @param pSatisfacao
	 * @return ps atualizada ou null caso não exista.
	 * @throws IOException
	 */
	public PesquisaSatisfacao atualizaPS(PesquisaSatisfacao pSatisfacao) throws IOException {
		if (this.psDAO.existsById(pSatisfacao.getId()) == true) {
			return this.psDAO.save(pSatisfacao);
		}
		return null;
	}

	/**
	 * Remove uma pesquisa de acordo com o id recebido.
	 * 
	 * @param idPS
	 * @throws IOException
	 */
	public void removePS(Long idPS) throws IOException {
		this.psDAO.deleteById(idPS);
	}

	/**
	 * Busca uma Pesquisa de Satisfacao pelo ID
	 * 
	 * @param idPS
	 * @return
	 */
	public PesquisaSatisfacao buscaPS(Long idPS) {
		return this.psDAO.getOne(idPS);
	}
	

	/**
	 * Lista todas as pesquisas de satisfacao
	 * 
	 * @return
	 */
	public List<PesquisaSatisfacao> listaPSs() {
		return this.psDAO.findAll();
	}
	
	/**
	 * Lista todas as pesquisas de satisfacao
	 * 
	 * @return
	 */
	public List<PesquisaSatisfacao> listaPSsValidacao(Medico medico) {
		return this.psDAO.findPesquisaSatisfacaoByMedicoParaValidacao(medico.getId(),"0");
	}
	
	/**
	 * Lista todas as pesquisas de satisfacao que foram validadas
	 * 
	 * @return
	 */
	public List<PesquisaSatisfacao> listaPSsValidadas(Medico medico) {
		return this.psDAO.findPesquisaSatisfacaoByMedicoParaValidacao(medico.getId(),"1");
	}
	
	
	
	/**
	 * Lista todas as avaliações de um determinado médico
	 * @param medico
	 * @return List de Avalições do	 Medico
	 */
	public List<PesquisaSatisfacao> listaPSByMedico(Medico medico) {
		return this.psDAO.findPesquisaSatisfacaoByMedico(medico);
	}

	/**
	 * Lista todas as avaliações realizadas por um determinado paciente
	 * @param paciente
	 * @return List de Avaliações do paciente
	 */
	public List<PesquisaSatisfacao> listaPSByPaciente(Paciente paciente) {
		return this.psDAO.findPesquisaSatisfacaoByPaciente(paciente);
	}
	
	
	/**
	 * Calcula a média das avaliações que foram validadas -  que contenham o código 1
	 * @param medico
	 * @return
	 */
	public String calculaMediaAvaliacoesValidadas(Medico medico) {
		return this.psDAO.mediaAtendimentoValidado(medico.getId());
	}
	
	
	
}
