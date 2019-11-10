package com.clickmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * Aqui rodamos o projeto como Java Aplication, antes de realizar tal procedimento, construa e popule o banco
 * @author RON
 *
 */
@SpringBootApplication
public class ClickmedApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ClickmedApplication.class, args);
	}

}
