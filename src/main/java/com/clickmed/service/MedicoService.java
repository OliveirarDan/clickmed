package com.clickmed.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.MedicoDAO;
import com.clickmed.entity.Medico;

@Service
public class MedicoService {

	MedicoDAO medicoDAO = new MedicoDAO();
	
	
	@Autowired
	public MedicoService(MedicoDAO medicoDAO) {
		this.medicoDAO = medicoDAO;
	}
	
	@Transactional
	public Medico insereMedico(Medico medico) throws IOException{
		int idMedico = medicoDAO.insereMedico(medico);
		medico.setIdMedico(idMedico);
		return medico;
	}
	
	@Transactional
	public Medico atualizaMedico(Medico medico)throws IOException{
		medicoDAO.atualizaMedico(medico);
		return medico;
	}
	
	@Transactional
	public void removeMedico(int idMedico)throws IOException{
		medicoDAO.removeMedico(idMedico);
	}
	
	public Medico buscaMedico(int idMedico) throws IOException{
		return medicoDAO.buscaMedico(idMedico);
	}
	
	
	/**
	 * listaMedicos() - Lista todos os medicos cadastrados
	 * @return 
	 * @throws IOException
	 */
	public List<Medico> listaMedicos() throws IOException{
		return medicoDAO.listaMedicos();
	}

	/**
	 * listaMedicos(String chave) - Retorna os médicos a partir do nome pesquisado
	 * @param chave
	 * @return
	 * @throws IOException
	 */
	public List<Medico> listaMedicos(String chave) throws IOException{
		return medicoDAO.listaMedicos(chave);
	}
	
	
}

