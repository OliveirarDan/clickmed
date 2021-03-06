<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
<link rel="stylesheet" href="vendors/animate-css/animate.css">
<!-- main css -->
<link rel="stylesheet" href="css/style.css">

<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.mask.js"></script>
<script src="js/theme.js"></script>
<script src="js/jquery.validate.js"></script>

<!-- JS Opcional  -->
<script type="text/javascript">
	$(document).ready(function() {
		$('.data').mask('11/11/1111', {
			reverse : true
		});
		$('.time').mask('00:00:00', {
			reverse : true
		});
		$('.date_time').mask('00/00/0000 00:00:00', {
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
						<a class="" href="index.jsp"> <i
							class="fa fa-chevron-circle-left"></i>
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
			<!--================Início da Paginação de Cadastro =================-->
			<div class="row">
				<div class="col-md-12">
					<span>
						<h3>Edite sua conta</h3>
					</span>
				</div>
			</div>


			<!--================Fim da Paginação Cadastro =================-->
			<!--================Início dos campos de Cadastro =================-->
			<div class="row">
				<div class="col-lg-12">
					<form class="row contact_form" action="salvaPaciente"
						method="post" id="cadastro-paciente">
						<div class="col-md-12">
							<div class="row">
								<div class="col-md-8 col-6">
									<div class="form-group">
										<input type="hidden"
											class="single-input" id="id" name="id" placeholder="Nome" value="${paciente.id}"
											required />
									
										<input type="text" class="single-input" id="name" name="nome" value="${paciente.nome}"
											placeholder="Nome" required /> 

									</div>
									<div class="form-group">
										<input type="text" class="single-input" id="sobrenome" value="${paciente.sobrenome}"
											name="sobrenome" placeholder="Sobrenome" required />
									</div>

									<div class="form-group">
<%-- 										<input type="cpf" class="single-input cpf" id="cpf"  name="cpf" value="${paciente.cpf}" --%>
<!-- 											placeholder="CPF" "disabled="disabled"required /> -->
											<br>
										<label class="col-md-12" id="cpf" for="radios">CPF: ${paciente.cpf} </label> 
										<input type="hidden" class="single-input cpf" id="cpf" name="cpf"
											placeholder="CPF" value="${paciente.cpf}" required />	
											
									</div>
								</div>
								<!-- Foto de perfil -->
								<div class="col-md-4 col-6">
									<div class="center">
										<div class="foto-circle">
											<!-- User Profile Image -->
											<img class="profile-pic" src="${paciente.foto}">

											<!-- Default Image -->
											<i class="fa fa-user fa-5x"></i>
										</div>
									</div>
									<div class="p-image">
										<i class="fa fa-camera upload-button"></i> <input
											class="file-upload" type="file"  accept="image/*" />
									</div>
								</div>
								<!-- Final da Foto de perfil -->
							</div>
							<div class="row">
								
								<input type="hidden" class="single-input cpf" id="cpf" name="sexo"
											placeholder="" value="${paciente.sexo}" required />	
<!-- 								<label class="col-md-12" for="radios">Gênero</label> -->
<!-- 								<div class="col-md-8"> -->
<!-- 									<label class="radio-inline" for="radios-0"> <input -->
<!-- 										type="radio" name="sexo" id="radios-0" value="1"> -->
<!-- 										Masculino -->
<!-- 									</label> <label class="radio-inline" for="radios-1"> <input -->
<!-- 										type="radio" name="sexo" id="radios-1" value="2"> -->
<!-- 										Feminino -->
<!-- 									</label> <label class="radio-inline" for="radios-2"> <input -->
<!-- 										type="radio" name="sexo" id="radios-2" value="2"> -->
<!-- 										Outro -->
<!-- 									</label> -->
<!-- 								</div> -->
							</div>
							<div class="row">
								<div class="form-group col-md-2">
									<input type="date" class="single-input" id="datanasc"
										name="dataNascimento" value="${paciente.dataNascimento}" placeholder="Data de nascimento"
										required />
								</div>
								<div class="form-group col-md-4">
									<input type="tel" class="single-input tel1" id="telresidencial"
										name="telefone1" placeholder="Telefone residencial" value="${paciente.telefone1 }" required />
								</div>
								<div class="form-group col-md-4">
									<input type="tel" class="single-input tel2" id="telcelular"
										name="telefone2" placeholder="Telefone celular" value="${paciente.telefone2 }" required />
								</div>
								<div class="form-group col-md-2">
									<input type="text" class="single-input cep" id="cep" name="cep" value="${paciente.cep }"
										placeholder="CEP" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-8">
									<input type="text" class="single-input" id="rua" name="nomeRua" value="${paciente.nomeRua }"
										placeholder="Rua, Av, Logradouro" required />
								</div>
								<div class="form-group col-md-4">
									<input type="text" class="single-input" id="numero" value="${paciente.numero }"
										name="numero" placeholder="Nº" maxlength="5" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-8">
									<input type="text" class="single-input" id="cidade" value="${paciente.cidade }"
										name="cidade" placeholder="Cidade" required />
								</div>
								<div class="form-group col-md-4">
									<input type="text" class="single-input" id="uf" name="estado" value="${paciente.estado }"
										placeholder="UF" maxlength="2" required />
								</div>
							</div>
						</div>
						
						
						<div class="col-md-12 text-center">
							<button type="submit" name="cadastraPaciente"
								value="salvaPaciente" class="primary-btn text-uppercase">Salvar</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!--================Fim dos campos de Cadastro =================-->
	<!--================Fim do Cadastro =================-->

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