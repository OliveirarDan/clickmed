<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt">

<head>
<!-- Include de todos os imports e meta tags -->
<jsp:include page="includes/imports.jsp" />

<title>ClickMed</title>

<script src="js/autocomplete/arrayauto.js"></script>

<body>
	<!--================ Include do Menu =================-->
	<jsp:include page="includes/menu.jsp" />

	<!--================ Começo Home Banner Area =================-->
	<section class="home_banner_area">
		<div class="banner_inner">
			<div class="container">
				<div class="banner_content">
					<center>
					<h2>
						Procurando uma consulta?  <br> 
						Esta no lugar certo. <br>
						Digite abaixo o que você deseja. <br>
					</h2>
					
					<br>

					<form autocomplete="off" action="buscaPrincipal" method="post">
						<div class="autocomplete" style="width:700px;">
    						<input id="myInput" type="text" name="nome" placeholder="Pesquise por Especialidade, Local, Etc...">
 						</div>
						<button type="submit" name="pesquisa" value="pesquisa"
							class="primary-btn text-uppercase">
							<i class="fa fa-search"></i>
						</button>
					</form>
					</center>
					<form autocomplete="off" action="index.jsp"></form>



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
	<section class="features_area section_gap_white">
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
	<section class="department_area section_gap_white">
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
	<section class="section_gap_white counter_area overlay">
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
			</div>
		</div>
	</section>
	<!--================ Fim Area Contador =================-->
	<!--================ Includes de Footer e Modal de Login =================-->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/login.jsp" />	
</body>
</html>