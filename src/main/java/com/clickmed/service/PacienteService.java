package com.clickmed.service;

import java.io.IOException;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickmed.dao.PacienteDAO;
import com.clickmed.entity.Paciente;

@Service
@Transactional
public class PacienteService {

	private PacienteDAO pacienteDAO;
	
	@Autowired
	public PacienteService(PacienteDAO pacienteDAO) {
		this.pacienteDAO = pacienteDAO;
	}
	
	
	public Paciente inserePaciente(Paciente paciente) throws IOException{
		this.pacienteDAO.save(paciente);
		return paciente;
	}
	
	
	//REVER SE paciente é atualizado
	@Transactional
	public Paciente atualizaPaciente(Paciente paciente) throws IOException{
		if (this.pacienteDAO.existsById(paciente.getIdPaciente()) == true) {
			this.pacienteDAO.save(paciente);
			return paciente;
		}
		
		return null;
		
	}
	
	
	@Transactional
	public void removePaciente(int idPaciente)throws IOException{
		this.pacienteDAO.deleteById(idPaciente);
	}
	
	
	//Verificar o funcionamento do Optional	
	public Optional<Paciente> buscaPaciente(int idPaciente) throws IOException{
		return pacienteDAO.findById(idPaciente);
	}
	
	
	
	
	
}
