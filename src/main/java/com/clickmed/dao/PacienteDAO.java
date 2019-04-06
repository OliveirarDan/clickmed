package com.clickmed.dao;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Paciente;

@Repository
public interface PacienteDAO extends JpaRepository<Paciente, Integer>{


	

	/*
	 * 
	 * ##Métodos a serem excluídos
	public int inserePaciente(Paciente paciente) throws IOException{
		manager.persist(paciente);
		return paciente.getIdPaciente();		
	}
	
	public Paciente buscaPaciente(int idPaciente) throws IOException{
		return manager.find(Paciente.class, idPaciente);
	}
	
	public Paciente atualizaPaciente(Paciente paciente) throws IOException{
		manager.merge(paciente);
		return paciente;
	}
	
	public void removePaciente (int id) throws IOException{
		manager.remove(manager.find(Paciente.class, id));
	}
	
	*/
	
	
}
