package com.clickmed.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Medico;
import com.clickmed.entity.PesquisaSatisfacao;

@Repository
public interface PesquisaSatisfacaoDAO extends JpaRepository<PesquisaSatisfacao, Long> {

	List<PesquisaSatisfacao> findByMedico_Id(Long id);
	
	List<PesquisaSatisfacao> findByMedico(Medico medico);
	
}
