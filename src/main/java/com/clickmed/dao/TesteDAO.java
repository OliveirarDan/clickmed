package com.clickmed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Teste;

@Repository
public interface TesteDAO extends JpaRepository<Teste, Integer> {

}
