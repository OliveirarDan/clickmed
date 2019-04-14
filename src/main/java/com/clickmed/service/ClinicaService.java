package com.clickmed.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.ClinicaDAO;
import com.clickmed.entity.Clinica;

@Service
@Transactional
public class ClinicaService {

	private ClinicaDAO clinicaDAO;

	@Autowired
	public ClinicaService(ClinicaDAO clinicaDAO) {
		this.clinicaDAO = clinicaDAO;
	}

	/**
	 * Insere Clinica no banco
	 * 
	 * @param clinica
	 * @return Objeto clinica cadastrada
	 */
	@Transactional
	public Clinica insereClinica(Clinica clinica) throws IOException {
		return this.clinicaDAO.save(clinica);
	}

	/**
	 * Verifica o id recebido, caso já exista uma clinica com este id, atualiza.
	 * 
	 * @param clinica
	 * @return clinica atualizada ou null caso não exista.
	 * @throws IOException
	 */
	@Transactional
	public Clinica atualizaClinica(Clinica clinica) throws IOException {
		if (this.clinicaDAO.existsById(clinica.getId()) == true) {
			return this.clinicaDAO.save(clinica);
		}
		return null;
	}

	/**
	 * Remove uma clinica de acordo com o id recebido.
	 * 
	 * @param idClinica id da clinica a ser excluída.
	 * @throws IOException
	 */
	@Transactional
	public void removeClinica(Long idClinica) throws IOException {
		this.clinicaDAO.deleteById(idClinica);
	}

	/**
	 * Busca uma clinica pelo id
	 * 
	 * @param idClinica
	 * @return Um objeto do clinica
	 */
	public Clinica buscaClinica(long idClinica) {
		return this.clinicaDAO.getOne(idClinica);
	}

	/**
	 * Lista todos as clinicas cadastradas
	 * 
	 * @return
	 */
	public List<Clinica> listaClinicas() {
		return clinicaDAO.findAll();
	}

}
