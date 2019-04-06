package com.clickmed.teste;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.clickmed.dao.AvaliacaoDAO;
import com.clickmed.entity.Avaliacao;
import com.clickmed.entity.Paciente;
import com.clickmed.entity.Teste;
import com.clickmed.service.AvaliacaoService;
import com.clickmed.service.PacienteService;
import com.clickmed.service.TesteService;

@Controller
public class TesteModel {
	
	//Importe os parametros necessários aqui
	@Autowired
	static	PacienteService pacienteService;
	
	@Autowired
	static TesteService testeService;
	
	public static void main(String[] args) throws IOException, ParseException {
		// Execute os comando para teste da model aqui
		
		teste1();
		//teste2();
		
		
	}
	
	public static void teste1() throws IOException, ParseException {
		
		
		Paciente paciente =  new Paciente();
		
			
			paciente.setNome("Danilo");
			paciente.setSobrenome("Rodrigues");
			paciente.setCpf("09909");
			paciente.setSexo("masculino");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date parsed = format.parse("0001-01-01");
			paciente.setDataNascimento("parsed");
			paciente.setTelefone1(01);
			paciente.setTelefone2(01);
			paciente.setCidade("Sao paulo");
			paciente.setEstado("SP");
			paciente.setNomeRua("rua rua");
			paciente.setNumero("01");
			paciente.setCep(8888);
			paciente.setFoto("....");
			

			System.out.println(paciente.toString());
		
			
		   pacienteService.inserePaciente(paciente);
		  
		
		//PacienteController utilizar = null;
		
		//utilizar.inserePacienteC(paciente, null);
		
		
	}
	
	public static void teste2() throws IOException, ParseException {
		
		Avaliacao avaliacao = new Avaliacao();
		AvaliacaoDAO aDao = new AvaliacaoDAO();
		
		avaliacao.setIdAvaliacao(1);
		avaliacao.setAvaliacao("Testando a primeira avaliacao");
		avaliacao.setPergunta1(1.0);
		avaliacao.setPergunta2(2.0);
		avaliacao.setPergunta3(3.0);
		avaliacao.setPergunta4(4.0);
		avaliacao.setPergunta5(5.0);
		avaliacao.setComentario("Testando");
		
		AvaliacaoService aservice = new AvaliacaoService(aDao);
		System.out.println(avaliacao.toString());
		//aservice.insereAvaliacao(avaliacao);
		
		avaliacao = aservice.insereAvaliacao(avaliacao);
		
	}
	
	public static void teste3() throws IOException  {
		Paciente paciente = new Paciente();
	
		
		
			paciente = pacienteService.buscaPaciente(1).get();
	
		System.out.println(paciente.toString());
		
	
	}

	public static void teste4() {
		Teste teste = new Teste(00, "olá!");
		
		testeService.insereTeste(teste);
		
		
	}
	

}
