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
<script src="js/popper.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.mask.js"></script>
<script src="js/stellar.js"></script>
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
		$('.date_time').mask('00/00/0000 00:00:00', {
			reverse : true
		});
		$('.cep').mask('00000-000', {
			reverse : true
		});
		$('.tel1').mask('(00) 0000-0000');
		$('.tel2').mask('(00) 00000-0000');
		$('.cpf').mask('000.000.000-00', {
			reverse : true
		});
		$('.cnpj').mask('00.000.000/0000-00', {
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
						<span class="header-title"><h2>Edição - Clínica</h2></span>
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
						<h3>Edite a clínica</h3>
					</span>
				</div>
			</div>


			<!--================Fim da Paginação Cadastro =================-->
			<!--================Início dos campos de Cadastro =================-->
			<div class="row">
				<div class="col-lg-12">
					<form class="row contact_form" action="salvaClinica" method="post"
						id="cadastro-clinica">
						<div class="col-md-12">
							<div class="row">
								<div class="form-group col-md-8 col-12">
									<input type="hidden" class="single-input" id="id" name="id"
										value="${clinica.id}" /> <input type="text"
										class="single-input" id="fantasia" name="nomeFantasia"
										placeholder="Nome Fantasia" value="${clinica.nomeFantasia}"
										required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-8 col-12">
									<input type="text" class="single-input" id="razao"
										name="razaoSocial" placeholder="Razão Social"
										value="${clinica.razaoSocial}" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-4 col-12">
									<input type="text" class="single-input cnpj" id="cnpj"
										name="cnpj" value="${clinica.cnpj}" placeholder="CNPJ"
										required />
								</div>
								<div class="form-group col-md-4 col-12">
									<input type="email" class="single-input" id="email"
										name="email" placeholder="E-mail de atendimento"
										value="${clinica.email}" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-4 col-12">
									<input type="tel" class="single-input tel1" id="telresidencial"
										name="telefone1" placeholder="Telefone principal"
										value="${clinica.telefone1}" required />
								</div>
								<div class="form-group col-md-4 col-12">
									<input type="tel" class="single-input tel1" id="telcelular"
										name="telefone2" placeholder="Outro telefone"
										value="${clinica.telefone2}" />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-2 col-12">
									<input type="text" class="single-input cep" id="cep" name="cep"
										placeholder="CEP" value="${clinica.cep}" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<input type="text" class="single-input" id="rua" name="rua"
										placeholder="Rua, Av, Logradouro" value="${clinica.rua}"
										required />
								</div>
								<div class="form-group col-md-2">
									<input type="text" class="single-input" id="numero"
										name="numero" placeholder="Nº" maxlength="5"
										value="${clinica.numero}" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<input type="text" class="single-input" id="cidade"
										name="cidade" placeholder="Cidade" value="${clinica.cidade}"
										required />
								</div>
								<div class="form-group col-md-2">
									<input type="text" class="single-input" id="uf" name="estado"
										value="${clinica.estado}" placeholder="UF" maxlength="2"
										required />
								</div>
							</div>
						</div>
						<div class="col-md-12 text-center">
							<button type="submit" name="cadastraClinica" value="salvaClinica"
								class="primary-btn text-uppercase">Salvar</button>
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