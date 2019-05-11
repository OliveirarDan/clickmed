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
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
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


</head>

<body>
	<!--================ Header Area =================-->
	<header>
		<section class="simple-header">
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-lg-4 col-4 header-left">
						<a class="" href="/"> <i class="fa fa-chevron-circle-left"></i>
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
			<!--================Primeira linha=================-->
			<div class="row">
				<div class="col-md-8"> <!-- Primeiro card da primeira linha -->
					<div class="card_infos">
						<div class="row">
							<div class="col-md-4">
								<div class="center">
									</br>
										<div class="foto-circle">
											<!-- User Profile Image -->
											<img class="profile-pic" src="img/person.jpg">
											
											<!-- Default Image -->
											<i class="fa fa-user fa-5x"></i>
										</div>
								</div>
							</div>
							<div class="col-md-8">
								</br>
								<h2><label id="nome">Nome</label></h2>
								<h4><label id="crm">CRM</label></h4>
							</div>
						</div>
						<div class="row">
							<div class="col-md-4">
								<div class="center">
									<h4><label id="espec">Especialidades</label></h4>	
									<label id="especialidades">Teste</label></br> <!-- Aqui precisa fazer um for each em uma lista-->						
									<label id="especialidades">Teste</label></br>
									<label id="especialidades">Teste</label></br>
								</div>
							</div>
							<div class="col-md-8">
								<div class="center">
									<h4><label id="conv">Convênios atendidos</label></h4>	
									<label id="convenio">Teste</label></br> <!-- Aqui precisa fazer um for each em uma lista-->						
									<label id="convenio">Teste</label></br>
									<label id="convenio">Teste</label></br>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-4">
								<div class="center">
									<h4><label id="local">Localização</label></h4>	
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
									<label id="teste"><span class="material-icons">&#xe55f;</span>Rua nicolina fernandes Rua nicolina fernandes</label>	
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4"> <!-- Segundo card da primeira linha -->
					<div class="center">
						<div class="circle">
							<div class="nota">
								<h1 id="nota">4,57</h1>
							</div>
						</div>
						
						<h4>Média das avaliações</h4>
					</div>
					
				</div>				
			</div>
			<!--================Fim da primeira linha =================-->
			</br>
			<!--================Inicio da segunda linha=================-->
			<div class="row">
				<div class="col-md-6"> <!-- Primeiro card da primeira linha -->
					<div class="card_infos">
						<div class="row">
							<div class="col-md-12">
								<h3 class="title">Experiência Profissional</h3>
								<hr class="line">
							</div>							
						</div>
						<div class="row">
							<ul>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-6"> <!-- Segundo card da primeira linha -->
					<div class="card_infos">
						<div class="row">
							<div class="col-md-12">
								<h3 class="title">Formação Acadêmica</h3>
								<hr class="line">
							</div>							
						</div>
						<div class="row">
							<ul>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
							</ul>
						</div>
					</div>
				</div>				
			</div>
			<!--================Fim da segunda linha=================-->


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