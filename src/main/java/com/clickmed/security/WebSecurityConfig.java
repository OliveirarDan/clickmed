package com.clickmed.security;

import com.clickmed.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;
import java.util.Optional;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  private UserService userService;

  /**
   * @param httpSecurity
   * Este método realiza a configuração de quais rotas podem ser acessadas com ou sem autenticação.
   * Também define quais rotas estão completamente liberadas, como por exmeplo resources.
   *
   * */
  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.csrf().disable().authorizeRequests()
      .antMatchers("/", "/cadastro", "/novoPaciente", "/novoMedico", "/novaClinica", "/buscaPrincipal").permitAll()
      .antMatchers("/autenticar","/infosMedico").permitAll()
      .antMatchers("/novaAvaliacao","/cadastraAvaliacao").permitAll()//Somente TESTE
      .antMatchers(HttpMethod.POST, "/api/login").permitAll()
      .antMatchers(HttpMethod.POST, "/api/usuario").permitAll()
      .antMatchers(HttpMethod.POST, "/api/paciente").permitAll()
      .antMatchers(HttpMethod.POST, "/api/clinica").permitAll()
      .antMatchers(HttpMethod.POST, "/api/medico").permitAll()
      .antMatchers(HttpMethod.GET, "/api/busca/**").permitAll()
      .antMatchers(HttpMethod.GET, "/api/medico").permitAll()
      .antMatchers(HttpMethod.GET, "/api/clinica").permitAll()
      .antMatchers(HttpMethod.GET, "/api/especialidade").permitAll()
      .antMatchers(HttpMethod.GET, "/api/convenio").permitAll()
      .antMatchers("/css/**", "/js/**", "/img/**").permitAll()
      .anyRequest().authenticated()
      .and()

      // filtra requisições de login
      .addFilterBefore(new JWTLoginFilter("/api/login", authenticationManager()),
        UsernamePasswordAuthenticationFilter.class)

      // filtra outras requisições para verificar a presença do JWT no header
      .addFilterBefore(new JWTAuthenticationFilter(),
        UsernamePasswordAuthenticationFilter.class);
  }

  /**
   * @param auth
   * Chama a classe implementada UserService e realiza a busca do usuário
   * no bando de dados.
   * Este método decripta o password encriptado quando gravado no banco.
   * */
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userService)
      .passwordEncoder(new BCryptPasswordEncoder());
  }
}
