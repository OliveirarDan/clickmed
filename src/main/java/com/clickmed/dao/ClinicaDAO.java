package com.clickmed.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Clinica;

@Repository
@Transactional
public interface ClinicaDAO extends JpaRepository<Clinica, Long> {

}
