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
	
	@Query ("SELECT u from PesquisaSatisfacao u "
			+ "where u.respostamed like %:respostamed% ")
	public List<PesquisaSatisfacao> findPesquisaSatisfacaoParaValidacao(String respostamed);

	@Query ("SELECT u from PesquisaSatisfacao u inner join u.medico m "
			+ "where u.respostamed like %:respostamed% and "
			+ "m.id like :id")
	public List<PesquisaSatisfacao> findPesquisaSatisfacaoByMedicoParaValidacao(Long id, String respostamed);
	
	@Query ("SELECT AVG(u.pergunta1) from PesquisaSatisfacao u inner join u.medico m "
			+ "where u.respostamed = 1 and "
			+ "m.id like :id")
	public String mediaAtendimentoValidado(Long id);
	
}
