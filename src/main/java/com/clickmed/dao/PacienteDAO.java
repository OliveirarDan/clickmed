package com.clickmed.dao;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Paciente;

@Repository
public interface PacienteDAO extends JpaRepository<Paciente, Long> {


}
