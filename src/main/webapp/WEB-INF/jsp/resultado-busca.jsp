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
							<a href="/"> <button name="refazerPesquisa" value="/"
								class="secondary-btn text-uppercase">Refazer pesquisa</button></a>
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
			<c:forEach items="${medico}" var="medico">
			<div class="wrapper">
				<div class="card radius shadowDepth1">
					<div class="row card-line card__padding">
						<div class="border-tlr-radius">
							<img src="http://lorempixel.com/400/200/sports/" alt="image"
								class="border-tlr-radius foto-card-circle">
						</div>
						<div class="card-head-title">
							<a>Nome do médico</a></br> 
							<a>CRM</a>
							<a>${medico.nome}</a></br> 
							<a>${medico.crm}</a>								
						</div>
					</div>

					<div class="card__content card-line card__padding">
						<div class="row card__meta">
							<div class="col-md-12 col-12">
								<a>Especialidades:</a>
								<c:forEach items="${medico.especialidade}" var="especialidade">
									<ul>
										<a class="card-title">Otorrino</a>
										<a class="card-title">${especialidade}</a>
									</ul>
								</c:forEach>
							</div>
						</div>
						<div class="row">
							<div class="col-md-2 col-2">
								<i class="fa-card fa-map-marker"></i>
							</div>
							<div class="col-md-10 col-10">
								<a class="card-title">Endereço do médico</a>
								<a class="card-title">${medico.rua}</a>
							</div>
						</div>
					</div>

					<div class="card__content card-line card__padding">
						<a class="card-title">Nota: ${medico.avaliacao}</a><br>
						<a class="card-title">Custo: ${medico.preco}</a><br>
					</div>
					<div class="card-bottom">
						<a class="card-action" href="/selecionaMedico">Visualizar</a>
					</div>

				</div>
			</div>
			</c:forEach>
		</div>
	</section>
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