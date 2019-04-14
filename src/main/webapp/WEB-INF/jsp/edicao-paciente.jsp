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
	<script src="js/stellar.js"></script>
	<script src="js/theme.js"></script>
	<script src="js/jquery.mask.min.js"></script>
	

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
						<h3>Edite sua conta</h3>
					</span>
				</div>
			</div>


			<!--================Fim da Paginação Cadastro =================-->
			<!--================Início dos campos de Cadastro =================-->
			<div class="row">
				<div class="col-lg-12">
					<form class="row contact_form" action="salvaPaciente" method="post"
						id="cadastro-paciente">
						<div class="col-md-12">
							<div class="row">
								<div class="col-md-8 col-6">

									<div class="form-group">
										<input type="text" class="single-input" id="name" name="nome"
											placeholder="Nome" required value="${paciente.nome}" />
									</div>
									<div class="form-group">
										<input type="text" class="single-input" id="sobrenome"
											name="sobrenome" placeholder="Sobrenome"
											value="${paciente.sobrenome}" required />
									</div>

									<div class="form-group">
										<input type="email" class="single-input" id="email"
											name="usuario.email" placeholder="E-mail (login)"
											value="${paciente.usuario.email} " required />
									</div>
									
									
									<div class="form-group">
										<input type="text" class="single-input" id="cpf"
											name="cpf" placeholder="CPF" 
											value="${paciente.cpf}" required />
											<input type="hidden" class="single-input" id="id"
											name="id" placeholder="id" 
											value="${paciente.id}" required />
									</div>
										
									<	
								</div>
								<!-- Foto de perfil -->
								<div class="col-md-4 col-6">
									<div class="center">
										<div class="foto-circle">
											<!-- User Profile Image -->
											<img class="profile-pic" src="img/person.jpg">

											<!-- Default Image -->
											<i class="fa fa-user fa-5x"></i>
										</div>
									</div>
									<div class="p-image">
										<i class="fa fa-camera upload-button"></i> <input
											class="file-upload" type="file" accept="image/*" />
									</div>
								</div>
								<!-- Final da Foto de perfil -->

								<div class="col-md-12 text-center">
									<button type="submit" name="cadastraPaciente"
										value="salvaPaciente" class="primary-btn text-uppercase">Cadastrar</button>
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
		</div>
	</footer>
</body>
</html>