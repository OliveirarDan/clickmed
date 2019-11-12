package com.clickmed.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickmed.entity.Paciente;
import com.clickmed.entity.Usuario;

@Repository
@Transactional
public interface PacienteDAO extends JpaRepository<Paciente, Long> {

	Paciente findPacienteByUsuario(Usuario usuario);

}
