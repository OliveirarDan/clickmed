<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html lang="pt">

<head>
	<!-- Required meta tags -->
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="icon" href="img/favicon.png" type="image/png">
	<title>ClickMed</title>
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="vendors/linericon/style.css">
	<link rel="stylesheet" href="css/login-register.css" />
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="vendors/owl-carousel/owl.carousel.min.css">
	<link rel="stylesheet" href="vendors/lightbox/simpleLightbox.css">
	<link rel="stylesheet" href="vendors/nice-select/css/nice-select.css">
	<link rel="stylesheet" href="vendors/animate-css/animate.css">
	<!-- main css -->
	<link rel="stylesheet" href="css/style.css">
</head>

<body>
	
	<!--================ Header Area =================-->
	<header>
		<section class="simple-header">
			<div class="container">
				<div class="row">				
					<div class="col-md-4 col-lg-4 col-4 header-left">
						<a class="" href="index.html">
							<i class="fa fa-chevron-circle-left"></i>
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
					<span> <h3>Crie sua conta</h3></span>
				</div>
			</div>
			
			
			<!--================Fim da Paginação Cadastro =================-->
			<!--================Início dos campos de Cadastro =================-->
			<div class="row">
				<div class="col-lg-12">
					<form class="row contact_form" action="" method="" id="cadastro" novalidate="">
						<div class="col-md-12">
							<div class="row">
								<div class="col-md-8 col-6">
									<div class="form-group">
										<input type="text" class="single-input" id="name" name="name" placeholder="Nome" required>
									</div>
									<div class="form-group">
										<input type="text" class="single-input" id="sobrenome" name="sobrenome" placeholder="Sobrenome" required>
									</div>
									
									<div class="form-group">
										<input type="email" class="single-input" id="email" name="email" placeholder="E-mail (login)" required>
									</div>
								</div>
								<!-- Foto de perfil -->
								<div class="col-md-4 col-6">
									<div class="center">
										<div class="foto-circle">
											<!-- User Profile Image -->
											<img class="profile-pic" src="https://t4.ftcdn.net/jpg/02/15/84/43/240_F_215844325_ttX9YiIIyeaR7Ne6EaLLjMAmy4GvPC69.jpg">
											
											<!-- Default Image -->
											<!-- <i class="fa fa-user fa-5x"></i> -->
										</div>
									</div>
									<div class="p-image">
										<i class="fa fa-camera upload-button"></i>
										<input class="file-upload" type="file" accept="image/*"/>
									</div>							
								</div>
								<!-- Final da Foto de perfil -->
							</div>
							<div class="row">
								<label class="col-md-12" for="radios">Gênero</label>
								<div class="col-md-8">
									<label class="radio-inline" for="radios-0">
										<input type="radio" name="radios" id="radios-0" value="1">
										Masculino
									</label>
									<label class="radio-inline" for="radios-1">
										<input type="radio" name="radios" id="radios-1" value="2">
										Feminino
									</label>
									<label class="radio-inline" for="radios-2">
										<input type="radio" name="radios" id="radios-2" value="2">
										Outro
									</label>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-2">
									<input type="date" class="single-input" id="datanasc" name="datanasc" placeholder="Data de nascimento" required>
								</div>							
								<div class="form-group col-md-4">
									<input type="tel" class="single-input" id="telresidencial" name="telresidencial" placeholder="Telefone residencial" data-mask="(00) 0000-0000" data-mask-selectonfocus="true" required>
								</div>
								<div class="form-group col-md-4">
									<input type="tel" class="single-input" id="telcelular" name="telcelular" placeholder="Telefone celular" data-mask="(00) 0000-00000" data-mask-selectonfocus="true" required>
								</div>							
								<div class="form-group col-md-2">
									<input type="text" class="single-input" id="cep" name="cep" placeholder="CEP" data-mask="00000-000" data-mask-selectonfocus="true" required>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-8">
									<input type="text" class="single-input" id="rua" name="rua" placeholder="Rua, Av, Logradouro" required>
								</div>
								<div class="form-group col-md-4">
									<input type="text" class="single-input" id="numero" name="numero" placeholder="Nº" required>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-8">
									<input type="text" class="single-input" id="cidade" name="cidade" placeholder="Cidade" required>
								</div>
								<div class="form-group col-md-4">
									<input type="text" class="single-input" id="uf" name="uf" placeholder="UF" maxlength="2" required>
								</div>							
							</div>
						</div>
						<div class="form-group col-md-4">
							<label for="pass">Crie uma senha</label>
							<input class="single-input" type="password" id="senha" name="senha" maxlength="8" minlength="8" required>
						</div>
						<div class="col-md-12 text-center">
							<button type="submit" value="cadastrar" class="primary-btn text-uppercase">Cadastrar</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!--================Fim dos campos de Cadastro =================-->
	<!--================Fim do Cadastro =================-->	
	
	<!--================ Começo Area Rodapé  =================-->
	
	<div class="footer-bottom">
		<div class="container">
			<div class="d-flex justify-content-between align-items-center flex-wrap">
				<p class="footer-text">
					Copyright ClickMed &copy;
					<script>document.write(new Date().getFullYear());</script> Todos os direitos reservados.
					<div class="footer-social d-flex align-items-center">
						<a href="#"><i class="fa fa-facebook"></i></a>
						<a href="#"><i class="fa fa-twitter"></i></a>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<!--================ Fim Area Rodapé   =================-->
	
	<!-- Optional JavaScript -->
	
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/popper.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/login-register.js"></script>
	<script src="js/stellar.js"></script>
	<script src="vendors/lightbox/simpleLightbox.min.js"></script>
	<script src="vendors/nice-select/js/jquery.nice-select.min.js"></script>
	<script src="vendors/owl-carousel/owl.carousel.min.js"></script>
	<script src="js/jquery.ajaxchimp.min.js"></script>
	<script src="vendors/counter-up/jquery.waypoints.min.js"></script>
	<script src="vendors/counter-up/jquery.counterup.js"></script>
	<script src="js/mail-script.js"></script>
	
	<!--gmaps Js-->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
	<script src="js/gmaps.min.js"></script>
	<script src="js/theme.js"></script>
	<script src="js/jquery.mask.min.js"></script>
	
	
</body>

</html>