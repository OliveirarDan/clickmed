package com.clickmed.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.MedicoDAO;
import com.clickmed.entity.Medico;

@Service
@Transactional
public class MedicoService {

	@Autowired
	UsuarioService usuarioService;

	private MedicoDAO medicoDAO;

	@Autowired
	public MedicoService(MedicoDAO medicoDAO) {
		this.medicoDAO = medicoDAO;
	}

	/**
	 * ----TESTANDO ---- Verificar relação ManyToMany Insere Médico - 1º Faz o
	 * cadastro na tabela de usuario,d epois retorna o id de usuario para o medico
	 * 2º Faz a seleção dos convênios
	 * 
	 * @param medico
	 * @return Medico cadastrado
	 * @throws IOException
	 */
	public Medico insereMedico(Medico medico) throws IOException {
		// Cadastra o usuario e retorna o ID
		medico.setUsuario(medico.getUsuario());
		/*
		 * Pesquisar como fazer a relação de convenios - ManyToMany
		 */

		// Cadastra o medico
		return this.medicoDAO.save(medico);
	}

	/**
	 * ----TESTANDO ---- Verificar relação ManyToMany Verifica o id recebido, caso
	 * ele exista atualiza, se não retorna null.
	 * 
	 * @param medico
	 * @return medico atualizado ou null caso não exista
	 * @throws IOException
	 */
	public Medico atualizaMedico(Medico medico) throws IOException {
		if (this.medicoDAO.existsById(medico.getId()) == true) {
			return this.medicoDAO.save(medico);
		}
		return null;
	}

	/**
	 * ----TESTANDO----- Verificar a relação ManyToMany O que mais será preciso
	 * apagar junto com o médico? (Convenio/Clinica?)
	 * 
	 * @param idMedico
	 * @throws IOException
	 */
	public void removeMedico(Long idMedico) throws IOException {
		this.medicoDAO.deleteById(idMedico);
	}

	/**
	 * busca um médico pelo id
	 * 
	 * @param idMedico
	 * @return Um objetotipo Medico
	 */
	public Medico buscaMedico(Long idMedico) {
		return this.buscaMedico(idMedico);
	}

	/**
	 * Lista todos os médicos cadastrados.
	 * 
	 * @return List<Medico>
	 */
	public List<Medico> listarNomeMedico() {
		return this.medicoDAO.findAll();
	}
	
	public List<Medico> listarNomeMedico(String nome) throws IOException{
		return medicoDAO.findByNome(nome);
	}

}
