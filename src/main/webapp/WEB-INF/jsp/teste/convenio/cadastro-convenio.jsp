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
<script src="js/jquery.mask.min.js"></script>
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
			<!--================Início da Paginação de Cadastro =================-->
			<div class="row">
				<div class="col-md-12">
					<span>
						<h3>Crie um Convênio</h3>
					</span>
				</div>
			</div>


			<!--================Fim da Paginação Cadastro =================-->
			<!--================Início dos campos de Cadastro =================-->
			<div class="row">
				<div class="col-lg-12">
					<form class="row contact_form" action="cadastraConvenio"
						method="post" id="cadastro-paciente">
						<div class="col-md-12">
							<div class="row">
								<div class="col-md-8 col-6">
									<div class="form-group">
										<input type="text" class="single-input" id="name" name="nome"
											placeholder="Nome" required />
									</div>
									<div class="form-group">
										<input type="text" class="single-input" id="codConvenio"
											name="codConvenio" placeholder="Código do Convênio" required />
									</div>
								</div>
								<div class="col-md-12 text-center">
									<button type="submit" name="cadastraPaciente"
										value="cadastraConvenio" class="primary-btn text-uppercase">Cadastrar</button>
								</div>
							</div>
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