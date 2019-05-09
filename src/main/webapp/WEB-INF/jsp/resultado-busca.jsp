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
		<section class="simple-header">
			<div class="container">

				<div class="row">
					<div class="form-group col-4 col-md-4">
						<div class="row">
							<div class="col-md-3 col-3">
								<i class="fa fa-search"></i>
							</div>
							<div class="col-md-9 col-9">
								<a>Inserir termo pesquisado</a>
							</div>
						</div>
					</div>

					<div class="form-group offset-6 col-2 col-md-2">
						<div class="control-group">
							<button name="refazerPesquisa" value="/"
								class="secondary-btn text-uppercase">Refazer pesquisa</button>
						</div>
					</div>
				</div>


				<div class="row ">
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
					<div class="form-group offset-6 col-2 col-md-2">
						<div class="control-group">
							<button name="limparFiltros" value=""
								class="secondary-btn text-uppercase">Limpar filtros</button>
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
					<div class="row card-head">
						<div class="border-tlr-radius col-md-6">
							<img src="http://lorempixel.com/400/200/sports/" alt="image"
								class="border-tlr-radius foto-card-circle">
						</div>
						<div class="card-head-title col-md-6">
							<a>Nome do médico</a></br> <a>CRM</a>
						</div>
					</div>

					<div class="card__content ">
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

						<div class="card__meta">
							<a>Especialidades</a>
						</div>

						<c:forEach items="${medico.especialidade}" var="especialidade">
    						${especialidade}<br>
						</c:forEach>

						<div class="row">
							<div class="col-md-2 col-2">
								<i class="fa fa-chevron-circle-left"></i>
							</div>
							<div class="col-md-10 col-10">
								<a>Endereço do médico</a>
							</div>
						</div>

						<article class="card__article">
							<h4>
								<a href="#">Material Design Card - For Blog Post Article</a>
							</h4>

							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
								Ducimus harum...</p>
						</article>
					</div>

					<div class="card__action">

						<div class="card__author">
							<img src="http://lorempixel.com/40/40/sports/" alt="user">
							<div class="card__author-content">
								By <a href="#">John Doe</a>
							</div>
						</div>
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
				<div class="footer-social d-flex align-items-center">
					<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
						class="fa fa-twitter"></i></a>
				</div>
			</div>
		</div>
	</footer>
</body>
</html>