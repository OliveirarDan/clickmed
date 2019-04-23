<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="icon" href="img/favicon.png" type="image/png">
<title>ClickMed</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/steps/jquery.steps.css">
<link rel="stylesheet" href="css/selectize/selectize.bootstrap3.css">

<!-- main css -->
<link rel="stylesheet" href="css/style.css">

<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.mask.js"></script>
<script src="js/steps/jquery.steps.js"></script>
<script src="js/selectize/selectize.js"></script>
<script src="js/jquery.validate.js"></script>
<script src="js/javascript.js"></script>
<script src="js/theme.js"></script>

<!-- JS Opcional  -->
<script type="text/javascript">
	$(document).ready(function() {
		$('.data').mask('11/11/1111', {
			reverse : true
		});
		$('.time').mask('00:00:00', {
			reverse : true
		});
		$('.hora').mask('00:00', {
			reverse : true
		});
		$('.cep').mask('00000-000', {
			reverse : true
		});
		$('.tel1').mask('(00) 0000-0000');
		$('.tel2').mask('(00) 00000-0000');
		$('.phone_us').mask('(000) 000-0000', {
			reverse : true
		});
		$('.mixed').mask('AAA 000-S0S', {
			reverse : true
		});
		$('.cpf').mask('000.000.000-00', {
			reverse : true
		});
		$('.money').mask('000.000.000.000.000,00', {
			reverse : true
		});
	});
</script>


</head>

<body>

	<!--================ Header Area =================-->
	<header>
		<section class="simple-header">
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-lg-4 col-4 header-left">
						<a href="/"> <i class="fa fa-chevron-circle-left"></i>
						</a>
					</div>
					<div class="col-md-8 col-lg-8 col-8 header-right">
						<span class="header-title"><h2>Edição</h2></span>
					</div>
				</div>
			</div>
		</section>
	</header>
	<!--================ Final Header Area =================-->


	<!--================Início do Cadastro =================-->
	<section class="contact_area section_gap">
		<div class="container">

			<div class="row">
				<div class="col-md-12">
					<h3>Crie sua conta</h3>
				</div>
			</div>
			<!--================Início da Paginação de Cadastro =================-->

			<!--================Fim da Paginação de Cadastro =================-->

			<!--================Início do Formulário de Cadastro =================-->
			<form class="row contact_form" action="salvaMedico" method="post"
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
												<input type="hidden" class="single-input" id="id" name="id"
													placeholder="id" value="${medico.id}" required /> <input
													type="number" class="single-input required" id="crm"
													name="crm" value="${medico.crm}" placeholder="CRM" minlength="7" maxlength="13">
											</div>

										</div>
									</div>
									<div class="row">
										<div class="col-md-8 col-6">
											<div class="form-group">
												<input type="text" class="single-input required" id="nome"
													name="nome" placeholder="Nome" value="${medico.nome}">
											</div>
											<div class="form-group">
												<input type="text" class="single-input required"
													id="sobrenome" name="sobrenome" placeholder="Sobrenome" value="${medico.sobrenome}">
											</div>

<!-- 											<div class="form-group"> -->
<!-- 												<input type="email" class="single-input required" id="email" -->
<%-- 													name="usuario.email" placeholder="E-mail (login)" value="${medico.usuario.email}"> --%>
<!-- 											</div> -->
											<input type="hidden" class="foto" id="foto" name="foto" value="${medico.foto}"
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
<!-- 									<div class="row"> -->
<!-- 										<div class="form-group col-md-4 required"> -->
<!-- 											<label for="pass">Crie uma senha</label> <input -->
<!-- 												class="single-input required" type="password" id="senha" -->
<%-- 												name="usuario.senha" maxlength="8" minlength="8" value="${medico.usuario.senha}"> --%>
<!-- 										</div> -->


										
<!-- 									</div> -->
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
									<label for="especialidade">Especilidades:</label> <input
										type="text" id="especialidade" name="especialidade"
										placeholder="Começe a digitar para pesquisar" value=""
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
									<label for="localAtendimento">Selecione qual o seu
										local de atendimento</label> <input type="text" id="localAtendimento"
										name="localAtendimento"
										placeholder="Começe a digitar para pesquisar" value=""
										required />
								</div>
							</div>

						</div>
						<div class="row">
							<div class="form-group col-md-12">
								<div class="control-group">
									<span>Não encontrou sua clínica ou consultório? <a
										href="/cadastro-clinica"> Clique aqui e cadastre.</a>
									</span>
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
										name="diasAtendimento"
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
										type="text" name="convenios" id="convenios"
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
									value="cadastraMedico" class="primary-btn text-uppercase">Salvar</button>
							</div>
						</div>

					</section>
					<!--================Fim da Terceira Etapa =================-->

				</div>
			</form>
			<script>
				
			</script>
		</div>
	</section>
	<!--================Fim do Formulário de Cadastro =================-->

	<!--================ Começo Area Rodapé  =================-->
	<footer class="footer-bottom">
		<div class="container">
			<div
				class="d-flex justify-content-between align-items-center flex-wrap">
				<p class="footer-text">
					Copyright ClickMed &copy;
					<script>
						document.write(new Date().getFullYear());
					</script>
					Todos os direitos reservados.
				<div class="footer-social d-flex align-items-center">
					<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
						class="fa fa-twitter"></i></a>
				</div>
			</div>
		</div>
	</footer>
</body>
</html>
