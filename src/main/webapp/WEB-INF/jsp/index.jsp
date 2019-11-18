<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt">

<head>
<!-- Include de todos os imports e meta tags -->
<jsp:include page="includes/imports.jsp" />

<title>ClickMed</title>

<script>
$(document).ready(function(){
  $('.toast').toast('show');
});
</script>

<script src="js/autocomplete/arrayauto.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<body>
	<!--================ Include do Menu =================-->
	<jsp:include page="includes/menu.jsp" />

	<!--================ Começo Home Banner Area =================-->
	<section class="home_banner_area">
		<div class="banner_inner bg-img">
			<div class="container">

				<div class="banner_content">
					<div style="float: right">

						<!-- <p class="h-index">
								Encontre agora mesmo o médico que precisa.
							</p>-->

						<br>

						<form autocomplete="off" action="buscaPrincipal" method="post">
							<div class="autocomplete"
								style="width: 40%; position: absolute; right: 10%;">
								<input id="myInput" type="text" name="nome"
									placeholder="Pesquise por nome, especialidade ou bairro...">
							</div>
							<button type="submit" name="pesquisa" value="pesquisa"
								class="primary-btn text-uppercase"
								style="position: absolute; right: 0; margin-right: 1%">
								<i class="fa fa-search"></i>
							</button>
						</form>
					</div>
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
						<h4>Psicologia</h4>
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
							<img src="img/team/member1.png" height="100" width="100">
						</div>
						<div class="author_decs">
							<h4>Maria Clara</h4>
							<p class="profession">Gerente de RH</p>
							<p>Gostei bastante do atendimento do médico. É um
								profissional muito competente, pontual e simpático. Recomendo!
								Só tenho a agradecer. Parabéns!</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="single_member">
						<div class="author">
							<img src="img/team/member2.png" height="120" width="120">
						</div>
						<div class="author_decs">
							<h4>Eduardo Monteiro</h4>
							<p class="profession">Sr. Análise de dados</p>
							<p>O Dr. passa confiança e domínio do assunto. Muito
								profissional e preocupado em tirar todas as dúvidas e deixar
								tudo claro para o paciente. Estou satisfeito.</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="single_member">
						<div class="author">
							<img src="img/team/member3.png" height="140" width="140">
						</div>
						<div class="author_decs">
							<h4>Stephanie Souza</h4>
							<p class="profession">Analista de Marketing</p>
							<p>Ótima profissional. A Dra me atendeu com pontualidade,
								muita atenção e com domínio na área especializada. Para uma
								primeira consulta, fiquei muito satisfeita.</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="single_member">
						<div class="author">
							<img src="img/team/member4.png" height="145" width="145">
						</div>
						<div class="author_decs">
							<h4>Marcelo Ribeiro</h4>
							<p class="profession">Professor de Direito</p>
							<p>Explica tudo com detalhes e paciência. As recomendações
								dela foram fundamentais para a mudança de estilo de vida que
								tinha prometido a mim mesma!</p>
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
	<jsp:include page="includes/opcoes.jsp" />
</body>
</html>