package com.clickmed.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Medico;
import com.clickmed.entity.Paciente;
import com.clickmed.entity.PesquisaSatisfacao;

@Repository
public interface PesquisaSatisfacaoDAO extends JpaRepository<PesquisaSatisfacao, Long> {

	public List<PesquisaSatisfacao> findPesquisaSatisfacaoByMedico(Medico medico);
	
	public List<PesquisaSatisfacao> findPesquisaSatisfacaoByPaciente(Paciente paciente);
	
	@Query ("SELECT u from pesquisas_pacientes u "
			+ "where u.respostamed like %:respostamed% ")
	public List<PesquisaSatisfacao> findPesquisaSatisfacaoParaValidacao(String respostamed);
	
}
