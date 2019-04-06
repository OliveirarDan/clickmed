package com.clickmed;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.clickmed.dao.MedicoDAO;
import com.clickmed.dao.UsuarioDAO;
import com.clickmed.entity.Medico;
import com.clickmed.entity.Usuario;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ClickmedApplicationTests {

	private TestEntityManager entityManager;
	
	@Autowired
	MedicoDAO medicoDAO;
	
	@Autowired
	UsuarioDAO usarioDAO;
	
//	@Test
//	public void contextLoads() {
//	}

	
//	@Test
//	public void should_find_medicos_and_has_at_least_one_element() {
//		Iterable<Medico> medicos = medicoDAO.findAll();
//
//		assertThat(medicos).hasAtLeastOneElementOfType(Medico.class);
//	}

	@Test
	public void should_save_a_medico() {
		Optional<Usuario> usr = usarioDAO.findById(1L);
		Medico medico = medicoDAO.save(new Medico("Medico D", "987", usr.get()));

		assertThat(medico).hasFieldOrPropertyWithValue("nome", "Medico D");
	}
}
