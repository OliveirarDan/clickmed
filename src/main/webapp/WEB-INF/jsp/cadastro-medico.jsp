<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt">

<head>
<!-- Include de todos os imports e meta tags -->
<jsp:include page="includes/imports.jsp" />

<title>ClickMed</title>

</head>

<body>
	<!--================ Header Area =================-->
	<header>
		<!--================ Include do Menu =================-->
		<jsp:include page="includes/menu.jsp" />
		<section class="simple-header">
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-lg-4 col-4 header-left">
						<a href="/"> <i class="fa fa-menu fa-chevron-left"></i>
						</a>
					</div>
					<div class="col-md-8 col-lg-8 col-8 header-right">
						<span class="header-title"><h2>Cadastro</h2></span>
					</div>
				</div>
			</div>
		</section>
	</header>
	<!--================ Final Header Area =================-->


	<!--================Início do Cadastro =================-->
	<section class="contact_area section_gap">
		<div class="container">
			<div class="page-content">
				<div class="row">
					<div class="col-md-12">
						<h3>Crie sua conta</h3>
					</div>
				</div>
				<!--================Início da Paginação de Cadastro =================-->

				<!--================Fim da Paginação de Cadastro =================-->

				<!--================Início do Formulário de Cadastro =================-->
				<form class="row contact_form" action="cadastraMedico" method="post"
					id="cadastro-medico" autocomplete="off">

					<div id="wizard">
						<h2>Dados pessoais</h2>
						<!--================Início da Primeira Etapa =================-->

						<section>
							<div class="row">
								<div class="col-md-12">
									<span><p>Nos informe seus dados pessoais abaixo, e
											também já crie sua conta para acesso.</p></span>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-12">
									<div class="col-md-12">
										<div class="row">
											<div class="col-md-4">
												<div class="form-group">
													<input type="number" class="single-input required" id="crm"
														name="crm" placeholder="CRM" minlength="7" maxlength="13">
												</div>

											</div>
										</div>
										<div class="row">
											<div class="col-md-8 col-6">
												<div class="form-group">
													<input type="text" class="single-input required" id="nome"
														name="nome" placeholder="Nome">
												</div>
												<div class="form-group">
													<input type="text" class="single-input required"
														id="sobrenome" name="sobrenome" placeholder="Sobrenome">
												</div>

												<div class="form-group">
													<input type="email" class="single-input required"
														id="email" name="usuario.email"
														placeholder="E-mail (login)">
												</div>
												<input type="hidden" class="foto" id="foto" name="foto"
													value="" />
											</div>
											<!-- Foto de perfil -->
											<div class="col-md-4 col-6">
												<div class="center">
													<div class="foto-circle">
														<!-- User Profile Image -->
														<img class="profile-pic" src="img/person.jpg">

														<!-- Default Image -->
														<!-- <i class="fa fa-user fa-5x"></i> -->
													</div>
												</div>
												<div class="p-image">
													<i class="fa fa-camera upload-button"></i> <input
														class="file-upload" type="file" accept="image/*" />
												</div>
											</div>
											<!-- Final da Foto de perfil -->
										</div>
										<div class="row">
											<label class="col-md-12 required" for="radios">Gênero</label>
											<div class="col-md-8">
												<label class="radio-inline" for="radios-0"> <input
													type="radio" name="sexo" id="radios-0" value="1" required>
													Masculino
												</label> <label class="radio-inline" for="radios-1"> <input
													type="radio" name="sexo" id="radios-1" value="2">
													Feminino
												</label> <label class="radio-inline" for="radios-2"> <input
													type="radio" name="sexo" id="radios-2" value="2">
													Outro
												</label>
											</div>
										</div>
										<div class="row">
											<div class="form-group col-md-4 required">
												<label for="pass">Crie uma senha</label> <input
													class="single-input required" type="password" id="senha"
													name="usuario.senha" maxlength="8" minlength="8">
											</div>


											<div class="form-group">
												<input type="hidden" class="single-input" id="permissao"
													name="permissao" value="1" required />
											</div>
										</div>
									</div>
								</div>
							</div>
						</section>
						<!--================Fim da Primeira Etapa =================-->
						<!--================Início da Segunda Etapa =================-->
						<h2>Dados profissionais</h2>
						<section>
							<div class="row">
								<div class="col-md-12">
									<span><p>Agora descreva um pouco sobre você, isso
											aumenta a segurança dos pacientes e aumenta a chance de
											agendamento de consultas.</p></span>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="control-group">
										<label for="especialidades">Especilidades:</label> <input
											type="text" id="especialidades" name="especialidades"
											placeholder="Começe a digitar para pesquisar" value="" autocomplete="off"
											required />
									</div>
								</div>

							</div>
							<div class="row">
								<div class="col-md-12">
									<label><span> Formação acadêmica:</span></label>
									<div class="form-group">
										<textarea class="single-input" id="formacaoAcademica"
											name="formacaoAcademica" rows="5"> </textarea>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<label><span> Experiência profissional:</span></label>
									<div class="form-group">
										<textarea class="single-input" id="experienciaProfissional"
											name="experienciaProfissional" rows="5"> </textarea>
									</div>
								</div>
							</div>
						</section>
						<!--================Fim da Segunda Etapa =================-->
						<!--================Início da Terceira Etapa =================-->
						<h2>Dados de atendimento</h2>
						<section>
							<div class="row">
								<div class="form-group col-md-12">
									<div class="control-group">
										<label for="clinicas">Selecione qual o seu
											local de atendimento</label> <input type="text" id="clinicas"
											name="clinicas" autocomplete="off"
											placeholder="Começe a digitar para pesquisar" value=""
											required />
									</div>
								</div>

							</div>
							<div class="row">
								<div class="form-group col-md-4">
									<input type="tel" class="single-input tel1 required"
										id="telefone1" name="telefone1"
										placeholder="Telefone principal">
								</div>
								<div class="form-group col-md-4">
									<input type="tel" class="single-input tel1" id="telefone2"
										name="telefone2" placeholder="Outro telefone (caso possua)">
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-8">
									<div class="control-group">
										<label for="diasAtendimento">Quais dias da semana há
											atendimento?</label> <input type="text" id="diasAtendimento"
											name="diasAtendimento" autocomplete="off"
											placeholder="Começe a digitar para pesquisar" value=""
											required />
									</div>
								</div>

								<div class="form-group col-md-2">
									<label for="horaInicioAtendimento">Início</label> <input
										type="text" class="single-input hora required"
										id="horaInicioAtendimento" name="horaInicioAtendimento"
										placeholder="00h00">
								</div>
								<div class="form-group col-md-2">
									<label for="horaFimAtendimento">Até:</label> <input type="text"
										class="single-input hora required" id="horaFimAtendimento"
										placeholder="00h00" name="horaFimAtendimento" />
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="control-group">
										<label for="convenios">Convênios atendidos:</label> <input
											type="text" name="convenios" id="convenios" autocomplete="off"
											placeholder="Começe a digitar para pesquisar" required />
									</div>
								</div>

							</div>
							<div class="row">
								<div class="col-md-12">
									<label><span> Descreva quais planos destes
											convênios atende?:</span></label>
									<div class="form-group">
										<textarea class="single-input required" id="planosConvenio"
											name="planosConvenio" rows="5"> </textarea>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12 text-center">
									<button type="submit" name="cadastraMedico1"
										value="cadastraMedico" class="primary-btn text-uppercase">Cadastrar</button>
								</div>
							</div>

						</section>
						<!--================Fim da Terceira Etapa =================-->

					</div>
				</form>
				<script>
					
				</script>
			</div>
		</div>
	</section>
	<!--================Fim do Formulário de Cadastro =================-->
	<!--================ Includes de Footer e Modal de Login =================-->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/login.jsp" />
	<jsp:include page="includes/opcoes.jsp" />
</body>
</html>
