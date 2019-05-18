package com.clickmed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.PesquisaSatisfacao;

@Repository
public interface PesquisaSatisfacaoDAO extends JpaRepository<PesquisaSatisfacao, Long> {

	
	
}
