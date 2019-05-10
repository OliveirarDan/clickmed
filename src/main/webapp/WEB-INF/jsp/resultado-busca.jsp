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
<link rel="stylesheet" href="css/steps/jquery.steps.css">
<link rel="stylesheet" href="css/selectize/selectize.bootstrap3.css">
<link rel="stylesheet" href="css/card.css">


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

<!-- Main JS -->

<!-- JS Opcional  -->
<script type="text/javascript">
	$(document).ready(function() {
		$('.data').mask('11/11/1111'), {
			reverse : true
		};
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


		<!--================ Header Menu Area =================-->
		<div class="header-top header_area">
			<div class="container">
				<div class="row align-items-center"></div>
			</div>
		</div>
		<div class="main_menu">
			<nav class="navbar navbar-expand-lg navbar-light">
				<div class="container">
					<!-- Logo e menu readequados para mobile -->
					<a class="navbar-brand logo_h" href="index.html"><img
						src="img/logo.png" alt=""></a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<!-- Menu principal -->
					<div class="collapse navbar-collapse offset"
						id="navbarSupportedContent">
						<ul class="nav navbar-nav menu_nav ml-auto">
							<li class="nav-item active"><a class="nav-link"
								href="index.html">Home</a></li>
							<li class="nav-item"><a class="nav-link"
								href="about-us.html">Quem somos</a></li>
							<li class="nav-item"><a class="nav-link" href="contact.html">Contato</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>


		<section class="simple-header">
			<div class="container">
				<div class="row">
					<div class="form-group col-2 col-md-2">
						<div class="control-group">
							<input type="text" id="classificacao" name="classificacao"
								placeholder="Classificação" value="" />
						</div>
					</div>
					<div class="form-group col-2 col-md-2">
						<div class="control-group">
							<input type="text" id="custo" name="custo" placeholder="Custo"
								value="" />
						</div>
					</div>
					<div class="form-group offset-4 col-2 col-md-2">
						<div class="control-group">
							<button name="limparFiltros" value=""
								class="secondary-btn text-uppercase">Limpar filtros</button>
						</div>
					</div>
					<div class="form-group col-2 col-md-2">
						<div class="control-group">
							<button name="refazerPesquisa" value="/"
								class="secondary-btn text-uppercase">Refazer pesquisa</button>
						</div>
					</div>
				</div>
			</div>
		</section>
	</header>
	<!--================ Final Header Area =================-->
	<!--================Início do Container principal =================-->
	<section class="contact_area section_gap">
		<div class="container">

			<!--Início da card  -->
			<div class="wrapper">

				<div class="card radius shadowDepth1 card__padding">
					<div class="row card-line">
						<div class="border-tlr-radius col-md-6">
							<img src="http://lorempixel.com/400/200/sports/" alt="image"
								class="border-tlr-radius foto-card-circle">
						</div>
						<div class="card-head-title col-md-6">
							<a>Nome do médico</a></br> <a>CRM</a>
						</div>
					</div>

					<div class="card__content card-line">
						<div class="card__share">
							<div class="card__social">
								<a class="share-icon facebook" href="#"><span
									class="fa fa-facebook"></span></a> <a class="share-icon twitter"
									href="#"><span class="fa fa-twitter"></span></a> <a
									class="share-icon googleplus" href="#"><span
									class="fa fa-google-plus"></span></a>
							</div>

							<a id="share" class="share-toggle share-icon" href="#"></a>
						</div>

						<div class="row card__meta">
							<div class="col-md-12 col-12">
								<a>Especialidades:</a>
								<c:forEach items="${medico.especialidade}" var="especialidade">
									<ul>
										<a>Otorrino</a>
										<a>${especialidade}</a>
									</ul>
								</c:forEach>
							</div>
						</div>
						<div class="row">
							<div class="col-md-2 col-2">
								<i class="fa-card fa-chevron-circle-left"></i>
							</div>
							<div class="col-md-10 col-10">
								<p>Endereço do médico</p>
							</div>
						</div>
					</div>

					<div class="card__content">
						Nota:<br> Custo:
					</div>
					<div class="card-footer">
						<a class="card-selecionar" href="/selecionaMedico">Visualizar</a>
					</div>

				</div>
			</div>


		</div>
	</section>
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
			</div>
		</div>
	</footer>
</body>
</html>