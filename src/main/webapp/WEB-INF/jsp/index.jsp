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
<link rel="stylesheet" href="vendors/linericon/style.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="vendors/owl-carousel/owl.carousel.min.css">
<link rel="stylesheet" href="vendors/lightbox/simpleLightbox.css">
<link rel="stylesheet" href="vendors/nice-select/css/nice-select.css">
<link rel="stylesheet" href="vendors/animate-css/animate.css">
<link rel="stylesheet" href="css/espec/autocomplete.css">

<!-- main css -->
<link rel="stylesheet" href="css/style.css">


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
<script src="js/autocomplete/complete.js"></script>
<script src="js/autocomplete/arrayauto.js"></script>

<!--gmaps Js-->
<script
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
<script src="js/gmaps.min.js"></script>
<script src="js/theme.js"></script>
</head>

<body>

	<!--================ Header Menu Area =================-->
	<header class="header_area">
		<div class="header-top">
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
						<ul class="nav navbar-nav ml-auto header-top-right">
							<a class="primary-btn text-uppercase" data-toggle="modal"
								href="javascript:void(0)" onclick="openLoginModal();">Entrar</a>
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</header>
	<!--================ Final Header Menu Area =================-->

	<!--================ Começo Home Banner Area =================-->
	<section class="home_banner_area">
		<div class="banner_inner">
			<div class="container">
				<div class="banner_content">
					<h2>
						Ganhe tempo e <br> encontre profissionais capacitados <br>
						sem dificuldades :) <br>
					</h2>
					<form autocomplete="off" action="index.jsp">
  						<div class="autocomplete" style="width:700px;">
    						<input id="myInput" type="text" name="espec" placeholder="Especialidades">
 						</div>
 						<div class="autocomplete" style="width:250px;">
    						<input id="myLoc" type="text" name="loc" placeholder="Locais">
 						</div>
 						<button type="submit" name="pesquisa"
								value="pesquisa" class="primary-btn text-uppercase"><i class="fa fa-search"></i></button>
					</form>
					
					<form autocomplete="off" action="index.jsp">
  						
					</form>
					
					

					<script>
						autocomplete(document.getElementById("myInput"), espec);
						autocomplete(document.getElementById("myLoc"), local);
					</script>
					<script>
						
					</script>
				</div>
			</div>
		</div>
	</section>
	<!--================ Final Home Banner Area =================-->

	<!--================ Começo Propostas Area =================-->
	<section class="features_area section_gap">
		<div class="container">
			<div class="row">
				<!-- proposta -->
				<div class="col-lg-4 col-md-6">
					<div class="single_feature">
						<div class="feature_head">
							<img src="img/features/icon1.png" alt="">
							<h4>Descubra sua necessidade</h4>
						</div>
						<div class="feature_content">
							<p>Através de uma busca criada pensando em facilitar o
								processo de localização do da especialidade indicada para você.
							</p>
						</div>
					</div>
				</div>
				<!-- proposta -->
				<div class="col-lg-4 col-md-6">
					<div class="single_feature">
						<div class="feature_head">
							<img src="img/features/icon2.png" alt="">
							<h4>Profissionais capacitados</h4>
						</div>
						<div class="feature_content">
							<p>Encontre o melhor profissional baseado em informações da
								comunidade, sem risco, sem dificuldades.</p>
						</div>
					</div>
				</div>
				<!-- proposta -->
				<div class="col-lg-4 col-md-6">
					<div class="single_feature">
						<div class="feature_head">
							<img src="img/features/icon3.png" alt="">
							<h4>Contribua com a comunidade</h4>
						</div>
						<div class="feature_content">
							<p>Após realizar uma consulta, deixe suas considerações, isso
								ajudará o médico e seus pacientes.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ Final Propostas Area =================-->


	<!--================ Começo Area Especialidades =================-->
	<section class="department_area section_gap">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-7">
					<div class="main_title">
						<h2>Principais especialidades</h2>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua.</p>
					</div>
				</div>
			</div>

			<div class="row">
				<!-- especialidade -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="img/department/d-icon1.png" alt="">
						</div>
						<h4>Cardiologia</h4>
					</div>
				</div>
				<!-- especialidade -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="img/department/d-icon2.png" alt="">
						</div>
						<h4>Psicólogia</h4>
					</div>
				</div>
				<!-- especialidade -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="img/department/d-icon3.png" alt="">
						</div>
						<h4>Dentista</h4>
					</div>
				</div>
				<!-- especialidade -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="img/department/d-icon4.png" alt="">
						</div>
						<h4>Oftalmologia</h4>
					</div>
				</div>
				<!-- especialidade -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="img/department/d-icon5.png" alt="">
						</div>
						<h4>Neurologia</h4>
					</div>
				</div>
				<!-- especialidade -->
				<div class="col-lg-2 text-center col-sm-6">
					<div class="single_department">
						<div class="dpmt-thumb">
							<img src="img/department/d-icon6.png" alt="">
						</div>
						<h4>Dermatologia</h4>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ Fim Area Especialidades =================-->

	<!--================ Começo Area Contador =================-->
	<section class="section_gap counter_area overlay">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-7">
					<div class="main_title">
						<h2>Opiniões recentes</h2>
					</div>
				</div>
			</div>		
			<div class="row">
				<!--contador-->
				<div class="col-lg-3 col-sm-6">
					<div class="single_member">
						<div class="author">
							<img src="img/team/member1.png" alt="">
						</div>
						<div class="author_decs">
							<h4>Ethel Davis</h4>
							<p class="profession">Sr. Faculty Data Science</p>
							<p>If you are looking at blank cassettes on the web, you may
								be very confused at the difference in price.</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="single_member">
						<div class="author">
							<img src="img/team/member1.png" alt="">
						</div>
						<div class="author_decs">
							<h4>Ethel Davis</h4>
							<p class="profession">Sr. Faculty Data Science</p>
							<p>If you are looking at blank cassettes on the web, you may
								be very confused at the difference in price.</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="single_member">
						<div class="author">
							<img src="img/team/member1.png" alt="">
						</div>
						<div class="author_decs">
							<h4>Ethel Davis</h4>
							<p class="profession">Sr. Faculty Data Science</p>
							<p>If you are looking at blank cassettes on the web, you may
								be very confused at the difference in price.</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="single_member">
						<div class="author">
							<img src="img/team/member1.png" alt="">
						</div>
						<div class="author_decs">
							<h4>Ethel Davis</h4>
							<p class="profession">Sr. Faculty Data Science</p>
							<p>If you are looking at blank cassettes on the web, you may
								be very confused at the difference in price.</p>
						</div>
					</div>
				</div>
				

				
	</section>
	<!--================ Fim Area Contador =================-->


	<!--================ Começo Area Rodapé  =================-->
	<footer class="footer-area section-gap">
		<div class="footer_top section_gap">
			<div class="container">
				<div class="row">
					<div class="col-lg-3  col-md-6 col-sm-6">
						<div class="single-footer-widget">
							<h4 class="text-white">Sobre nós</h4>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore dolore magna aliqua.
							</p>
						</div>
					</div>
					<div class="col-lg-4  col-md-6 col-sm-6">
						<div class="single-footer-widget">
							<h4 class="text-white">Fale conosco</h4>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore dolore magna aliqua.
							</p>
							<p class="number">
								012-6532-568-9746 <br> 012-6532-569-9748
							</p>
						</div>
					</div>
				</div>

			</div>
		</div>
		<div class="footer-bottom">
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
	<!--================ Começo do modal de Login =================-->
	<div class="modal fade login" id="loginModal">
		<div class="modal-dialog login animated">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Entre com seus dados</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">
					<div class="box">
						<div class="content">
							<div class="form loginBox">
								<form method="" action="" accept-charset="UTF-8">
									<input id="email" class="form-control" type="text"
										placeholder="E-mail" name="email"> <input
										id="password" class="form-control" type="password"
										placeholder="Senha" name="password"> <input
										class="btn btn-default btn-login" type="button" value="Login"
										onclick="">
								</form>
								<span><p>
										<a href="#">Esqueci minha senha</a>
									</p> </span>
							</div>
							<div class="division">
								<div class="line l"></div>
								<span>Ou</span>
								<div class="line r"></div>
							</div>
							<div class="social">
								<a id="google_login" class="circle google" href="#"> <i
									class="fa fa-google-plus fa-fw"></i>
								</a> <a id="facebook_login" class="circle facebook" href="#"> <i
									class="fa fa-facebook fa-fw"></i>
								</a>
							</div>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<div class="forgot login-footer">
						<div class="division">
							<span>Ainda não possui um cadastro?</span>
						</div>

						<span> Cadastre-se como <a href="/novoPaciente">paciente.</a>
						</span><br> <span> Ou como <a href="/novoMedico">profissional.</a>
						</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--================ Fim Area Rodapé   =================-->

</body>
</html>